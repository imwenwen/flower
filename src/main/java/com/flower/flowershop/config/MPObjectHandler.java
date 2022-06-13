package com.flower.flowershop.config;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class MPObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        // 起始版本 3.3.3(推荐)
        DateTime currentTime = DateUtil.date();
        this.strictInsertFill(metaObject, "createTime", () -> currentTime, Date.class);
        this.strictInsertFill(metaObject, "updateTime", () -> currentTime, Date.class);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 起始版本 3.3.3(推荐)
        this.strictUpdateFill(metaObject, "updateTime", () -> new Date(), Date.class);
    }

}