package com.zb.fallback;

import com.zb.pojo.ZhOrder;

import com.zb.client.RestZhOrderClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ZhOrderClientFallBack implements RestZhOrderClient {


    @Override
    public ZhOrder getZhOrderById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<ZhOrder>	getZhOrderListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getZhOrderCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddZhOrder(ZhOrder zhOrder)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyZhOrder(ZhOrder zhOrder)throws Exception{
        return null;
    }
}
