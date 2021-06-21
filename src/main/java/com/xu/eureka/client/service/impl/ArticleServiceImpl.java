package com.xu.eureka.client.service.impl;

import com.xu.eureka.client.entity.Article;
import com.xu.eureka.client.mapper.ArticleMapper;
import com.xu.eureka.client.service.ArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
