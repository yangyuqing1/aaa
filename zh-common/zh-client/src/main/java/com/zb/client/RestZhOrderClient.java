package com.zb.client;
import com.zb.pojo.ZhOrder;

import com.zb.fallback.ZhOrderClientFallBack;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by shang-pc on 2018/5/15.
*/
@FeignClient(name = "zh-order-provider", fallback = ZhOrderClientFallBack.class)
public interface RestZhOrderClient {
@RequestMapping(value = "/getZhOrderById",method = RequestMethod.POST)
public ZhOrder getZhOrderById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getZhOrderListByMap",method = RequestMethod.POST)
public List<ZhOrder>	getZhOrderListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getZhOrderCountByMap",method = RequestMethod.POST)
public Integer getZhOrderCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddZhOrder",method = RequestMethod.POST)
public Integer qdtxAddZhOrder(@RequestBody ZhOrder zhOrder)throws Exception;

@RequestMapping(value = "/qdtxModifyZhOrder",method = RequestMethod.POST)
public Integer qdtxModifyZhOrder(@RequestBody ZhOrder zhOrder)throws Exception;
}

