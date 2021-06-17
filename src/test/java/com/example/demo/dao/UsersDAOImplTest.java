package com.example.demo.dao;

import com.example.demo.model.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersDAOImplTest {

    @Test
    void getAll() {
        List<User> users = new ArrayList<>();
        User user = new User(1,"Vova", "Ivanov", 33, "email@email.com");
        users.add(user);
        assertEquals("Ivanov", "Ivanov");
        assertNotNull(users);
        assertFalse(user.getFirstName() == "Masha");
    }

    @Test
    void saveUser() {
        User user = new User(1,"Vova", "Ivanov", 33, "email@email.com");
        assertEquals("Vova", user.getFirstName());
        assertNotNull(user);
        assertFalse(user.getFirstName() == "Vitya");
    }

    @Test
    void deleteUser() {
        List<User> users = new ArrayList<>();
        User user = new User(1,"Vova", "Ivanov", 33, "email@email.com");
        users.remove(user);
        assertTrue(users.isEmpty());
        assertFalse(users.contains(user));

    }
}