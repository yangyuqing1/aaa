package com.zb.mapper;
import com.zb.pojo.ZhNeeds;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZhNeedsMapper {

	public ZhNeeds getZhNeedsById(@Param(value = "id") Long id)throws Exception;

	public List<ZhNeeds>	getZhNeedsListByMap(Map<String,Object> param)throws Exception;

	public Integer getZhNeedsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertZhNeeds(ZhNeeds zhNeeds)throws Exception;

	public Integer updateZhNeeds(ZhNeeds zhNeeds)throws Exception;


}
