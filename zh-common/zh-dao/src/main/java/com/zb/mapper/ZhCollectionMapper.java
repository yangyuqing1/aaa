package com.zb.mapper;
import com.zb.pojo.ZhCollection;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZhCollectionMapper {

	public ZhCollection getZhCollectionById(@Param(value = "id") Long id)throws Exception;

	public List<ZhCollection>	getZhCollectionListByMap(Map<String,Object> param)throws Exception;

	public Integer getZhCollectionCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertZhCollection(ZhCollection zhCollection)throws Exception;

	public Integer updateZhCollection(ZhCollection zhCollection)throws Exception;


}
