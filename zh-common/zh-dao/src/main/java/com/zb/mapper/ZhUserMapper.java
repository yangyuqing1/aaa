package com.zb.mapper;
import com.zb.pojo.ZhUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZhUserMapper {

	public ZhUser getZhUserById(@Param(value = "id") Long id)throws Exception;

	public List<ZhUser>	getZhUserListByMap(Map<String,Object> param)throws Exception;

	public Integer getZhUserCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertZhUser(ZhUser zhUser)throws Exception;

	public Integer updateZhUser(ZhUser zhUser)throws Exception;


}
