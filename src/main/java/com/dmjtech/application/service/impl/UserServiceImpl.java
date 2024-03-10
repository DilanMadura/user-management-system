package com.dmjtech.application.service.impl;

import com.dmjtech.application.model.dto.UserInfoDto;
import com.dmjtech.application.model.entity.User;
import com.dmjtech.application.repository.UserRepository;
import com.dmjtech.application.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserInfoDto getUserInfo(int id) {
        User user = userRepository.findById(id).orElse(null);
        assert user != null;
        return new UserInfoDto(user.getId(), user.getName(), user.getEmail());
    }
}
