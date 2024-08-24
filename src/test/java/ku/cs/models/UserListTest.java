package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Zania1", "000001");
        userList.addUser("Zania2", "000002");
        userList.addUser("Zania3", "000003");
        // TODO: find one of them
        User user = userList.findUserByUsername("Zania3");
        // TODO: assert that UserList found User
        String expected = "Zania3";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Zania1", "000001");
        userList.addUser("Zania2", "000002");
        userList.addUser("Zania3", "000003");

        // TODO: change password of one user
        boolean result = userList.changePassword("Zania1", "000001", "Zania01");
        assertTrue(result);

        // TODO: assert that user can change password
        User user = userList.findUserByUsername("Zania1");
        assertNotNull(user);
        assertTrue(user.validatePassword("Zania01"));
        assertFalse(user.validatePassword("000001"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Zania1", "000001");
        userList.addUser("Zania2", "000002");
        userList.addUser("Zania3", "000003");

        // TODO: call login() with correct username and password
        User user = userList.login("Zania1", "000001");

        // TODO: assert that User object is found
        String expected = "Zania1";
        String actual = user.getUsername();
        assertNotNull(user);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Zania1", "000001");
        userList.addUser("Zania2", "000002");
        userList.addUser("Zania3", "000003");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Zania1", "000000");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}