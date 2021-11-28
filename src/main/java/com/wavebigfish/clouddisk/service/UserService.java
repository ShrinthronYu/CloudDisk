package com.wavebigfish.clouddisk.service;

import com.wavebigfish.clouddisk.common.RestResult;
import com.wavebigfish.clouddisk.model.User;

public interface UserService {
    RestResult<String> registerUser(User user);
    RestResult<User> login(User user);
    User getUserByToken(String token);
}