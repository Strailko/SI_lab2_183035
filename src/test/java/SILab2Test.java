import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    SILab2 obj = new SILab2();
    private static User Test1;
    private static User Test2;
    private static User Test3;
    private static User Test4;
    private static User Test5;
    private static User Test6;
    private static User Test7;
    private static List<String> allUsers;

    @BeforeAll
    static void init(){
        System.out.println("Initializing ");
        Test1 = null;
        Test2 = new User(null, null, null);
        Test3 = new User("mile", "null", "null");
        Test4 = new User("milej", null, null);
        Test5 = new User("milej", "mile123", "milej");
        Test6 = new User("milej", "mile123", "milej@");
        Test7 = new User("milej", "mile123", "milej@g.com");
        allUsers = new ArrayList<>(2);
        allUsers.add("mile");
    }

    @AfterAll
    static void destroy(){
        System.out.println("Done");
    }

    @Test
    public void Tests(){
		RuntimeException exception;
		//Test1: slucaj koga user objektot e null
        exception=assertThrows(RuntimeException.class, () -> obj.function(Test1, allUsers));
        assertTrue(exception.getMessage().contains("The user argument is not initialized!"));
		//Test2: koga objektot e inicijaliziran, so nickname postaven na null
        exception=assertThrows(RuntimeException.class, () -> obj.function(Test2, allUsers));
        assertTrue(exception.getMessage().contains("User already exists!"));
		//Test3: koga nickname e postaven na vekepostoecki od listata
        exception=assertThrows(RuntimeException.class, () -> obj.function(Test3, allUsers));
        assertTrue(exception.getMessage().contains("User already exists!"));
        assertAll(
                //Test4: se vnesuva nickname sto go zadovoluva prethodniot uslov, no email i passwordot ostanuvaat null, pagja na testot za email
                () -> assertFalse(obj.function(Test4, allUsers)),
                //Test5: se vnesuvaat site podatoci, na emailot mu falat znakot @ i .
                () -> assertFalse(obj.function(Test5, allUsers)),
                //Test6: se vnesuvaat site podatoci, na emailot mu fali .
                () -> assertFalse(obj.function(Test6, allUsers)),
                //Test7: se vnesuvaat site podatoci sto gi zadovoluvaat site uslovi i vrakja true
                () -> assertTrue(obj.function(Test7, allUsers))
        );
    }
}