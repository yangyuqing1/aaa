package com.zb.client;
import com.zb.pojo.ZhUser;

import com.zb.fallback.ZhUserClientFallBack;
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
@FeignClient(name = "zh-order-provider", fallback = ZhUserClientFallBack.class)
public interface RestZhUserClient {
@RequestMapping(value = "/getZhUserById",method = RequestMethod.POST)
public ZhUser getZhUserById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getZhUserListByMap",method = RequestMethod.POST)
public List<ZhUser>	getZhUserListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getZhUserCountByMap",method = RequestMethod.POST)
public Integer getZhUserCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddZhUser",method = RequestMethod.POST)
public Integer qdtxAddZhUser(@RequestBody ZhUser zhUser)throws Exception;

@RequestMapping(value = "/qdtxModifyZhUser",method = RequestMethod.POST)
public Integer qdtxModifyZhUser(@RequestBody ZhUser zhUser)throws Exception;
}

