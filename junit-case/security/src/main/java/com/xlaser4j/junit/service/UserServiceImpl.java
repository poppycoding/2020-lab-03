package com.xlaser4j.junit.service;

import com.xlaser4j.junit.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @package: com.xlaser4j.junit.service
 * @author: Elijah.D
 * @time: 2020/2/20 21:53
 * @description:
 * @modified: Elijah.D
 */
@Service
public class UserServiceImpl implements UserDetailsService {
    /**
     * 根据用户名从数据库查询出用户相关信息,security自动做账号密码权限的匹配工作.
     *
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("", username);
    }
}