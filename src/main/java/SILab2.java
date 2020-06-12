import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function (User user, List<String> allUsers) {
        if (user == null) { // Node A
            throw new RuntimeException("The user argument is not initialized!"); // Node B
        } else { // C
            if (user.getUsername() == null || allUsers.contains(user.getUsername())) { // Node C
                throw new RuntimeException("User already exists!"); // Node D
            } else { // Node E
                if (user.getEmail() == null) // Node E
                    return false; // Node F
                boolean atChar = false, dotChar = false; // Node G
                for (int i = 0; i < user.getEmail().length(); i++) { // Nodes G, H, Loop: IJKL, M
                    if (user.getEmail().charAt(i) == '@') // Node I
                        atChar = true; // Node J
                    if (atChar && user.getEmail().charAt(i) == '.') { // Node K
                        dotChar = true; // Node L
                    }
                }
                if (!atChar || !dotChar) { // Node N
                    return false; // Node O
                }
            }
        }
        return true; // Node P
    }
}
