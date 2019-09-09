package com.zb.client;
import com.zb.pojo.ZhNeeds;

import com.zb.fallback.ZhNeedsClientFallBack;
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
@FeignClient(name = "zh-order-provider", fallback = ZhNeedsClientFallBack.class)
public interface RestZhNeedsClient {
@RequestMapping(value = "/getZhNeedsById",method = RequestMethod.POST)
public ZhNeeds getZhNeedsById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getZhNeedsListByMap",method = RequestMethod.POST)
public List<ZhNeeds>	getZhNeedsListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getZhNeedsCountByMap",method = RequestMethod.POST)
public Integer getZhNeedsCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddZhNeeds",method = RequestMethod.POST)
public Integer qdtxAddZhNeeds(@RequestBody ZhNeeds zhNeeds)throws Exception;

@RequestMapping(value = "/qdtxModifyZhNeeds",method = RequestMethod.POST)
public Integer qdtxModifyZhNeeds(@RequestBody ZhNeeds zhNeeds)throws Exception;
}

