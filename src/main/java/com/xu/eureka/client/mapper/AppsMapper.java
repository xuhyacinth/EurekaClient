package com.xu.eureka.client.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xu.eureka.client.entity.Apps;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
public interface AppsMapper extends BaseMapper<Apps> {

    @Select("select " +
            "aid, tag, type, name, version, useable, app_abs_path, app_url_path, icon_abs_path, icon_url_path, create_date, update_date " +
            "from apps")
    public List<Apps> getAllAppsInfo();
}
