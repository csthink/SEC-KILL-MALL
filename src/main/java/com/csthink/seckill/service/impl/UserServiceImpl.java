package com.csthink.seckill.service.impl;

import com.csthink.seckill.dao.UserDao;
import com.csthink.seckill.domain.User;
import com.csthink.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(Integer id) {
        return userDao.findById(id);
    }

//    @Transactional
    @Override
    public boolean tx() {
        User user1 = new User();
        user1.setId(3);
        user1.setName("lucy");
        userDao.insert(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setName("lucy");
        userDao.insert(user2);

        return true;
    }
}
