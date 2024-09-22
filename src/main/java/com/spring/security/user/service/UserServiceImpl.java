package com.spring.security.user.service;

import com.spring.security.user.dto.UserDTO;
import com.spring.security.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName    : com.spring.security.user.service
 * fileName       : UserServiceImpl
 * author         : Administrator
 * date           : 2024-09-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-21        Administrator       최초 생성
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements  UserService{
    private final UserRepository userRepository;

    @Override
    public UserDTO findUserByUserId(String userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void saveUser(UserDTO user) {
        userRepository.save(user);
    }

    @Override
    public List<UserDTO> findUsers() {
        return userRepository.findUsers();
    }
}
