package com.zb.mapper;
import com.zb.pojo.ZhNews;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZhNewsMapper {

	public ZhNews getZhNewsById(@Param(value = "id") Long id)throws Exception;

	public List<ZhNews>	getZhNewsListByMap(Map<String,Object> param)throws Exception;

	public Integer getZhNewsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertZhNews(ZhNews zhNews)throws Exception;

	public Integer updateZhNews(ZhNews zhNews)throws Exception;


}
