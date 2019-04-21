package com.csthink.seckill.dao;

import com.csthink.seckill.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    @Select("select * from user where id=#{id}")
    User findById(@Param("id") Integer id);

    @Insert("insert user(id, name) values(#{id}, #{name})")
    int insert(User user);
}
