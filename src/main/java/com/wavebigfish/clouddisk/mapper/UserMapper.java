package com.wavebigfish.clouddisk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wavebigfish.clouddisk.model.User;
import java.util.List;

public interface UserMapper extends BaseMapper<User>{
    void insertUser(User user);
    List<User> selectUser();
}