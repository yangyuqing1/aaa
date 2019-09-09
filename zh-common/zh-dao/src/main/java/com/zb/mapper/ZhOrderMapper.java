package com.zb.mapper;
import com.zb.pojo.ZhOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZhOrderMapper {

	public ZhOrder getZhOrderById(@Param(value = "id") Long id)throws Exception;

	public List<ZhOrder>	getZhOrderListByMap(Map<String,Object> param)throws Exception;

	public Integer getZhOrderCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertZhOrder(ZhOrder zhOrder)throws Exception;

	public Integer updateZhOrder(ZhOrder zhOrder)throws Exception;


}
