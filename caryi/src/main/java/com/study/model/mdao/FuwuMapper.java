package com.study.model.mdao;

import com.study.pojo.Fuwu;
import java.util.List;

public interface FuwuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer fwid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated
     */
    int insert(Fuwu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated
     */
    Fuwu selectByPrimaryKey(Integer fwid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated
     */
    List<Fuwu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Fuwu record);
}