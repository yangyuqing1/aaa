package com.zb.fallback;

import com.zb.pojo.ZhCollection;

import com.zb.client.RestZhCollectionClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ZhCollectionClientFallBack implements RestZhCollectionClient {


    @Override
    public ZhCollection getZhCollectionById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<ZhCollection>	getZhCollectionListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getZhCollectionCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddZhCollection(ZhCollection zhCollection)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyZhCollection(ZhCollection zhCollection)throws Exception{
        return null;
    }
}
