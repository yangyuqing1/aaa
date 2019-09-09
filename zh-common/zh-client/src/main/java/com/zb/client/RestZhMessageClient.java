package com.zb.client;
import com.zb.pojo.ZhMessage;

import com.zb.fallback.ZhMessageClientFallBack;
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
@FeignClient(name = "zh-order-provider", fallback = ZhMessageClientFallBack.class)
public interface RestZhMessageClient {
@RequestMapping(value = "/getZhMessageById",method = RequestMethod.POST)
public ZhMessage getZhMessageById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getZhMessageListByMap",method = RequestMethod.POST)
public List<ZhMessage>	getZhMessageListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getZhMessageCountByMap",method = RequestMethod.POST)
public Integer getZhMessageCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddZhMessage",method = RequestMethod.POST)
public Integer qdtxAddZhMessage(@RequestBody ZhMessage zhMessage)throws Exception;

@RequestMapping(value = "/qdtxModifyZhMessage",method = RequestMethod.POST)
public Integer qdtxModifyZhMessage(@RequestBody ZhMessage zhMessage)throws Exception;
}

