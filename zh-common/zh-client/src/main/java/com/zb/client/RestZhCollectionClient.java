package com.zb.client;
import com.zb.pojo.ZhCollection;

import com.zb.fallback.ZhCollectionClientFallBack;
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
@FeignClient(name = "zh-order-provider", fallback = ZhCollectionClientFallBack.class)
public interface RestZhCollectionClient {
@RequestMapping(value = "/getZhCollectionById",method = RequestMethod.POST)
public ZhCollection getZhCollectionById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getZhCollectionListByMap",method = RequestMethod.POST)
public List<ZhCollection>	getZhCollectionListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getZhCollectionCountByMap",method = RequestMethod.POST)
public Integer getZhCollectionCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddZhCollection",method = RequestMethod.POST)
public Integer qdtxAddZhCollection(@RequestBody ZhCollection zhCollection)throws Exception;

@RequestMapping(value = "/qdtxModifyZhCollection",method = RequestMethod.POST)
public Integer qdtxModifyZhCollection(@RequestBody ZhCollection zhCollection)throws Exception;
}

