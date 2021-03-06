# Втора лабораториска вежба по Софтверско инженерство

## Миле Јанкулоски, бр. на индекс 183035

### Група на код: 

Ја добив групата на код 2

###  Control Flow Graph

Фотографија од control flow graph-ot

![Control Flow Graph](https://jankuloski.ml/ControlFlowGraph.jpg)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 7, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=6, па цикломатската комплексност изнесува 7.

### Тест случаи според критериумот Every branch

Every branch критериумот ги проверува сите патеки на разгранувањата.

![Every branch](https://jankuloski.ml/EveryBranch.jpg)

### Тест случаи според критериумот Multiple condition

Multiple condition критериумот го проверува секој од условите.

![Multiple condition](https://jankuloski.ml/MultipleCondition.jpg)

### Објаснување на напишаните unit tests

Inputs - (Username, Password, Email)  
Test1:	(null)  
Test2:	(null, null, null)  
Test3:	(mile, null, null)  
Test4:	(milej, null, null)  
Test5:	(milej, mile123, milej)  
Test6:	(milej, mile123, milej@)  
Test7:	(milej, mile123, milej@g.com)  

Test1: Тестот ги опфаќа nodes A и B. Влезот односно user објектот е null, го задоволува првиот услов и фрла exception.  
    
Test2: Тестот ги опфаќа nodes A, C и D. Во влезот се пополнуваат сите со променливи null. Го задоволува условот (user.getUsername() == null || allUsers.contains(user.getUsername())) и фрла exception.  
                                                                
Test3: Тестот ги опфаќа nodes A, C и D. Во влезот се пополнува само username исто како веќепостоечко од листата, а останатите се null. Го задоволува условот (user.getUsername() == null || allUsers.contains(user.getUsername())) и фрла exception.  
  
Test4: Тестот ги опфаќа nodes A, C, E и F. Во влезот се пополнува само username што не е null и не се содржи во листата. Го задоволува условот (if (user.getEmail() == null)) бидејќи мејлот е поставен на null и враќа false.  
      
Test5: Тестот ги опфаќа nodes A, C, E, G, H, I, K, M, N и O. Во влезот се пополнуваат сите параметри со стрингови. Го задоволува условот (if (!atChar || !dotChar)) поради тоа што имејлот нема @ и враќа false.  
      
Test6: Тестот ги опфаќа nodes A, C, E, G, H, I, J, K, M, N и O. Во влезот се пополнуваат сите параметри со стрингови. Го задоволува условот (if (!atChar || !dotChar)) поради тоа што имејлот нема . и враќа false. 
          
Test7: Тестот ги опфаќа nodes A, C, E, G, H, I, J, K, L, M, N и P. Во влезот се пополнуваат сите параметри со стрингови. Функцијата како краен резултат враќа true поради точноста на параметрите.  
    
Тестовите и за двата критериуми се исти.
