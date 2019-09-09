package com.zb.mapper;
import com.zb.pojo.ZhEvaluation;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZhEvaluationMapper {

	public ZhEvaluation getZhEvaluationById(@Param(value = "id") Long id)throws Exception;

	public List<ZhEvaluation>	getZhEvaluationListByMap(Map<String,Object> param)throws Exception;

	public Integer getZhEvaluationCountByMap(Map<String,Object> param)throws Exception;

	public Integer insert`ZhEvaluation(ZhEvaluation zhEvaluation)throws Exception;

	public Integer updateZhEvaluation(ZhEvaluation zhEvaluation)throws Exception;


}
