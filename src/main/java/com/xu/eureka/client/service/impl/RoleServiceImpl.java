package com.xu.eureka.client.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xu.eureka.client.entity.Role;
import com.xu.eureka.client.mapper.RoleMapper;
import com.xu.eureka.client.service.RoleService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
