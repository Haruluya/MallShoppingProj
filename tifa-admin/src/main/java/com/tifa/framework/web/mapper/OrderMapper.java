package com.tifa.framework.web.mapper;

import com.tifa.framework.web.pojo.Category;
import com.tifa.framework.web.pojo.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author haruluya
* @description 针对表【order_】的数据库操作Mapper
* @createDate 2022-03-29 17:15:21
* @Entity com.tifa.framework.web.pojo.Order
*/

public interface OrderMapper extends BaseMapper<Order> {
}




