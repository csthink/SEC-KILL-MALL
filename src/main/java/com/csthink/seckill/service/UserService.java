package com.csthink.seckill.service;

import com.csthink.seckill.domain.User;

public interface UserService {

    User getById(Integer id);

    boolean tx();
}
