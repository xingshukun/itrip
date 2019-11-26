package com.itrip.dao.user;

import com.itrip.beans.pojo.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    List<User> selectByExample();

    User selectByPrimaryKey(Long id);

    User selectByUserCode(@Param("userCode") String userCode);

}