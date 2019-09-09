package com.zb.fallback;

import com.zb.pojo.ZhEvaluation;

import com.zb.client.RestZhEvaluationClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ZhEvaluationClientFallBack implements RestZhEvaluationClient {


    @Override
    public ZhEvaluation getZhEvaluationById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<ZhEvaluation>	getZhEvaluationListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getZhEvaluationCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddZhEvaluation(ZhEvaluation zhEvaluation)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyZhEvaluation(ZhEvaluation zhEvaluation)throws Exception{
        return null;
    }
}
