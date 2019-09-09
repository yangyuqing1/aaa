package com.zb.fallback;

import com.zb.pojo.ZhGoods;

import com.zb.client.RestZhGoodsClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ZhGoodsClientFallBack implements RestZhGoodsClient {


    @Override
    public ZhGoods getZhGoodsById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<ZhGoods>	getZhGoodsListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getZhGoodsCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddZhGoods(ZhGoods zhGoods)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyZhGoods(ZhGoods zhGoods)throws Exception{
        return null;
    }
}
