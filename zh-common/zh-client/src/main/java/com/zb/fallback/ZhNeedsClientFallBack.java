package com.zb.fallback;

import com.zb.pojo.ZhNeeds;

import com.zb.client.RestZhNeedsClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ZhNeedsClientFallBack implements RestZhNeedsClient {


    @Override
    public ZhNeeds getZhNeedsById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<ZhNeeds>	getZhNeedsListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getZhNeedsCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddZhNeeds(ZhNeeds zhNeeds)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyZhNeeds(ZhNeeds zhNeeds)throws Exception{
        return null;
    }
}
