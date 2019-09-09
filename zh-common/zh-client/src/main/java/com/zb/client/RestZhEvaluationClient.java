package com.zb.client;
import com.zb.pojo.ZhEvaluation;

import com.zb.fallback.ZhEvaluationClientFallBack;
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
@FeignClient(name = "zh-order-provider", fallback = ZhEvaluationClientFallBack.class)
public interface RestZhEvaluationClient {
@RequestMapping(value = "/getZhEvaluationById",method = RequestMethod.POST)
public ZhEvaluation getZhEvaluationById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getZhEvaluationListByMap",method = RequestMethod.POST)
public List<ZhEvaluation>	getZhEvaluationListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getZhEvaluationCountByMap",method = RequestMethod.POST)
public Integer getZhEvaluationCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddZhEvaluation",method = RequestMethod.POST)
public Integer qdtxAddZhEvaluation(@RequestBody ZhEvaluation zhEvaluation)throws Exception;

@RequestMapping(value = "/qdtxModifyZhEvaluation",method = RequestMethod.POST)
public Integer qdtxModifyZhEvaluation(@RequestBody ZhEvaluation zhEvaluation)throws Exception;
}

