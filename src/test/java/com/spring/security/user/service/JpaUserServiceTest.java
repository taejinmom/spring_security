package com.spring.security.user.service;

import com.spring.security.user.dto.UserDTO;
import com.spring.security.user.entity.User;
import com.spring.security.user.repository.JpaUserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.spring.security.user.service
 * fileName       : JpaUserServiceTest
 * author         : Administrator
 * date           : 2024-09-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-21        Administrator       최초 생성
 */
@SpringBootTest
@Slf4j
class JpaUserServiceTest {
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private JpaUserService jpaUserService;

    @Test
    void connection() {
        log.info(entityManager.createNativeQuery("SELECT current_schema()").getSingleResult().toString());


    }
    @Test
    void save() {
        UserDTO userDTO1 = new UserDTO("1","user1","1234");
        UserDTO userDTO2 = new UserDTO("2", "user2", "1234");

        userDTO1.setEntity();
        userDTO2.setEntity();

        User user1 = userDTO1.getUser();
        User user2 = userDTO2.getUser();

        jpaUserService.save(user1);
        jpaUserService.save(user2);
    }

    @Test
    void findById() {
        Optional<User> user = jpaUserService.findUser("1");

        Assertions.assertThat(user).isNotEmpty();
    }

    @Test
    void findUsers() {
    }
}