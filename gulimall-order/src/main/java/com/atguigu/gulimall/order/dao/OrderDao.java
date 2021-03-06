package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mingyanwang
 * @email wmy947411254@gmail.com
 * @date 2020-11-17 21:05:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
