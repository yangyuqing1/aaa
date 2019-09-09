package com.zb.fallback;

import com.zb.pojo.ZhUser;

import com.zb.client.RestZhUserClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ZhUserClientFallBack implements RestZhUserClient {


    @Override
    public ZhUser getZhUserById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<ZhUser>	getZhUserListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getZhUserCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddZhUser(ZhUser zhUser)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyZhUser(ZhUser zhUser)throws Exception{
        return null;
    }
}
