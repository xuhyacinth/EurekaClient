package com.xu.eureka.client.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xu.eureka.client.service.AppsService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
@RestController
@RequestMapping("/client/apps")
@ApiOperation(value = "apps 请求")
public class AppsController {

    @Autowired
    private AppsService appsService;

    @ApiParam(name = "pageNum", required = true, value = "起始条数")
    @ApiOperation(value = "App查询", notes = "获取所有的App", httpMethod = "GET")
    @RequestMapping(value = "/getAllAppsInfo")
    public Object getAllAppsInfo(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        return appsService.getAllAppsInfo(pageNum, pageSize);
    }

}

