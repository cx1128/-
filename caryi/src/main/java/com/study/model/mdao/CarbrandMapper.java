package com.study.model.mdao;

import com.study.pojo.Carbrand;
import java.util.List;

public interface CarbrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carbrand
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer brandid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carbrand
     *
     * @mbg.generated
     */
    int insert(Carbrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carbrand
     *
     * @mbg.generated
     */
    Carbrand selectByPrimaryKey(Integer brandid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carbrand
     *
     * @mbg.generated
     */
    List<Carbrand> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carbrand
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Carbrand record);
}