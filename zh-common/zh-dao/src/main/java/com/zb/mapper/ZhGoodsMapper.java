package com.zb.mapper;
import com.zb.pojo.ZhGoods;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZhGoodsMapper {

	public ZhGoods getZhGoodsById(@Param(value = "id") Long id)throws Exception;

	public List<ZhGoods>	getZhGoodsListByMap(Map<String,Object> param)throws Exception;

	public Integer getZhGoodsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertZhGoods(ZhGoods zhGoods)throws Exception;

	public Integer updateZhGoods(ZhGoods zhGoods)throws Exception;


}
