package com.xu.eureka.client.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xu.eureka.client.entity.Goods;
import com.xu.eureka.client.mapper.GoodsMapper;
import com.xu.eureka.client.service.GoodsService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

}
