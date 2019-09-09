package com.zb.fallback;

import com.zb.pojo.ZhNews;

import com.zb.client.RestZhNewsClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ZhNewsClientFallBack implements RestZhNewsClient {


    @Override
    public ZhNews getZhNewsById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<ZhNews>	getZhNewsListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getZhNewsCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddZhNews(ZhNews zhNews)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyZhNews(ZhNews zhNews)throws Exception{
        return null;
    }
}
