package com.zb.client;
import com.zb.pojo.ZhGoods;

import com.zb.fallback.ZhGoodsClientFallBack;
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
@FeignClient(name = "zh-order-provider", fallback = ZhGoodsClientFallBack.class)
public interface RestZhGoodsClient {
@RequestMapping(value = "/getZhGoodsById",method = RequestMethod.POST)
public ZhGoods getZhGoodsById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getZhGoodsListByMap",method = RequestMethod.POST)
public List<ZhGoods>	getZhGoodsListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getZhGoodsCountByMap",method = RequestMethod.POST)
public Integer getZhGoodsCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddZhGoods",method = RequestMethod.POST)
public Integer qdtxAddZhGoods(@RequestBody ZhGoods zhGoods)throws Exception;

@RequestMapping(value = "/qdtxModifyZhGoods",method = RequestMethod.POST)
public Integer qdtxModifyZhGoods(@RequestBody ZhGoods zhGoods)throws Exception;
}

