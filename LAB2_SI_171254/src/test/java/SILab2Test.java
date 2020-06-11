import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SILab2Test {

    SILab2 si = new SILab2();

    User user1EveryStatement = null;
    User user2EveryStatement = new User("Marko","pass","marko.gmail@com");
    User user3EveryStatement = new User("Marko","pass","marko12@");
    User user4EveryStatement = new User("Marko","pass","marko@gmail.com");

    List<String> allUsersEveryStatement= Arrays.asList("Rajko","Trajko");


    @Test
    void function1() {
        assertFalse(si.function(user1EveryStatement,allUsersEveryStatement));//1.1
        assertFalse(si.function(user2EveryStatement,allUsersEveryStatement));//1.2
        assertFalse(si.function(user3EveryStatement,allUsersEveryStatement));//1.3
        assertTrue(si.function(user4EveryStatement,allUsersEveryStatement));//1.4
    }

    User user1EveryPath = null;
    User user2EveryPath = new User("Marko",null,null);
    User user3EveryPath = new User("Marko","pass","marko@gmail");
    User user4EveryPath = new User("Marko","pass","marko@gmail.com");

    List<String> allUser1EveryPath= Arrays.asList("Rajko","Trajko");
    List<String> allUser2EveryPath= Arrays.asList("Marko","Trajko","Rajko");

    @Test
    void function2(){
        assertFalse(si.function(user1EveryPath,allUser1EveryPath));//2.1
        assertFalse(si.function(user2EveryPath,allUser2EveryPath));//2.2
        assertFalse(si.function(user3EveryPath,allUser1EveryPath));//2.3
        assertTrue(si.function(user4EveryPath,allUser1EveryPath));//2.4
    }
}