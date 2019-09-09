package com.zb.fallback;

import com.zb.pojo.ZhMessage;

import com.zb.client.RestZhMessageClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ZhMessageClientFallBack implements RestZhMessageClient {


    @Override
    public ZhMessage getZhMessageById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<ZhMessage>	getZhMessageListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getZhMessageCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddZhMessage(ZhMessage zhMessage)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyZhMessage(ZhMessage zhMessage)throws Exception{
        return null;
    }
}
