package com.xu.eureka.client.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xu.eureka.client.entity.Logs;
import com.xu.eureka.client.mapper.LogsMapper;
import com.xu.eureka.client.service.LogsService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
@Service
public class LogsServiceImpl extends ServiceImpl<LogsMapper, Logs> implements LogsService {

}
