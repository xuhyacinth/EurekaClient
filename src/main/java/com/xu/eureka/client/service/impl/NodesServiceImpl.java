package com.xu.eureka.client.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xu.eureka.client.entity.Nodes;
import com.xu.eureka.client.mapper.NodesMapper;
import com.xu.eureka.client.service.NodesService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
@Service
public class NodesServiceImpl extends ServiceImpl<NodesMapper, Nodes> implements NodesService {

}
