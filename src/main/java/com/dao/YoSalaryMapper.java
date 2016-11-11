package com.dao;

import com.model.YoSalary;
import com.model.YoSalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoSalaryMapper {
    int countByExample(YoSalaryExample example);

    int deleteByExample(YoSalaryExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(YoSalary record);

    int insertSelective(YoSalary record);

    List<YoSalary> selectByExample(YoSalary example);

    List<YoSalary> selectAllUser(YoSalary yoSalary);

    List<YoSalary> selectAllUser();

    YoSalary selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") YoSalary record, @Param("example") YoSalaryExample example);

    int updateByExample(@Param("record") YoSalary record, @Param("example") YoSalaryExample example);

    int updateByPrimaryKeySelective(YoSalary record);

    int updateByPrimaryKey(YoSalary record);
}