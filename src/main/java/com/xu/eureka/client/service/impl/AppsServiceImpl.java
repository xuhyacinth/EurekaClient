package com.xu.eureka.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xu.eureka.client.entity.Apps;
import com.xu.eureka.client.mapper.AppsMapper;
import com.xu.eureka.client.service.AppsService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
@Service
public class AppsServiceImpl extends ServiceImpl<AppsMapper, Apps> implements AppsService {

    @Autowired
    private AppsMapper appsMapper;

    @Override
    public Object getAllAppsInfo(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Apps> list = appsMapper.getAllAppsInfo();
        return new PageInfo<>(list, pageSize);
    }
}
