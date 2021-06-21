package com.xu.eureka.client.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xu.eureka.client.entity.Apps;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
public interface AppsService extends IService<Apps> {

    public Object getAllAppsInfo(Integer pageNum, Integer pageSize);

}