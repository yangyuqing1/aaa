package com.zb.mapper;
import com.zb.pojo.ZhMessage;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZhMessageMapper {

	public ZhMessage getZhMessageById(@Param(value = "id") Long id)throws Exception;

	public List<ZhMessage>	getZhMessageListByMap(Map<String,Object> param)throws Exception;

	public Integer getZhMessageCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertZhMessage(ZhMessage zhMessage)throws Exception;

	public Integer updateZhMessage(ZhMessage zhMessage)throws Exception;


}
