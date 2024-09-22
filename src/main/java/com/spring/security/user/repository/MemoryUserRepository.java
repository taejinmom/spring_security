package com.spring.security.user.repository;

import com.spring.security.user.dto.UserDTO;
import com.spring.security.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * packageName    : com.spring.security.user.repository
 * fileName       : MemoryUserRepository
 * author         : Administrator
 * date           : 2024-09-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-20        Administrator       최초 생성
 */
@Repository
public class MemoryUserRepository implements UserRepository {
    private static Map<String, UserDTO> store = new HashMap<>();

    @Override
    public void save(UserDTO user) {
        store.put(user.getUserId(),user);
    }
    @Override
    public UserDTO findById(String userId) {
        return store.get(userId);
    }

    @Override
    public List<UserDTO> findUsers() {
        return new ArrayList<>(store.values());
    }
}
