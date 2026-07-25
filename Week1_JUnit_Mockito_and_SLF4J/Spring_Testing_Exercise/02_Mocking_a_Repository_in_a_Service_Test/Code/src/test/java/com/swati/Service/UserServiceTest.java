package com.swati.Service;

import com.swati.Model.User;
import com.swati.Repository.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    public void testGetUserById() {
        UserRepository repo = mock(UserRepository.class);

        UserService service = new UserService(repo);

        User user = new User(1L, "Swati");

        when(repo.findById(1L)).thenReturn(Optional.of(user));

        User result = service.getUserById(1L);

        assertNotNull(result);
        assertEquals(user, result);
    }
}