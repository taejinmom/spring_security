package com.spring.security.user.service;

import com.spring.security.common.service.CommonService;
import com.spring.security.common.service.CommonServiceImpl;
import com.spring.security.user.dto.UserDTO;
import com.spring.security.user.repository.MemoryUserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.spring.security.user.service
 * fileName       : UserServiceImplTest
 * author         : Administrator
 * date           : 2024-09-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-21        Administrator       최초 생성
 */

@SpringBootTest
class UserServiceImplTest {
    public Map<String, UserDTO> store = new HashMap<>();
    public UserService userService = new UserServiceImpl(new MemoryUserRepository());

//    @BeforeEach
//    void before() {
//        store.clear();
//    }
    @Test
    void findUserByUserId() {
    }

    @Test
    void saveUser() {
        UserDTO userDTO1 = new UserDTO("1","user1","1234");
        UserDTO userDTO2 = new UserDTO("2", "user2", "1234");

        userService.saveUser(userDTO1);
        userService.saveUser(userDTO2);

        List<UserDTO> users = userService.findUsers();
        Assertions.assertThat(2).isEqualTo(users.size());

    }

    @Test
    void findUsers() {
        List<UserDTO> users = userService.findUsers();
        Assertions.assertThat(2).isEqualTo(users.size());
    }
}