package com.study.model.mdao;

import com.study.pojo.Car;
import java.util.List;

public interface CarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer carid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    int insert(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    Car selectByPrimaryKey(Integer carid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    List<Car> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Car record);
}