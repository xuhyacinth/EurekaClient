package com.xu.eureka.client.service.impl;

import com.xu.eureka.client.entity.User;
import com.xu.eureka.client.mapper.UserMapper;
import com.xu.eureka.client.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}