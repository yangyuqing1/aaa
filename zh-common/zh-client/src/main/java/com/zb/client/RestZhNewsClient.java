package com.zb.client;
import com.zb.pojo.ZhNews;

import com.zb.fallback.ZhNewsClientFallBack;
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
@FeignClient(name = "zh-order-provider", fallback = ZhNewsClientFallBack.class)
public interface RestZhNewsClient {
@RequestMapping(value = "/getZhNewsById",method = RequestMethod.POST)
public ZhNews getZhNewsById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getZhNewsListByMap",method = RequestMethod.POST)
public List<ZhNews>	getZhNewsListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getZhNewsCountByMap",method = RequestMethod.POST)
public Integer getZhNewsCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddZhNews",method = RequestMethod.POST)
public Integer qdtxAddZhNews(@RequestBody ZhNews zhNews)throws Exception;

@RequestMapping(value = "/qdtxModifyZhNews",method = RequestMethod.POST)
public Integer qdtxModifyZhNews(@RequestBody ZhNews zhNews)throws Exception;
}

