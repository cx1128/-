package com.study.model.mdao;

import com.study.pojo.Collection;
import java.util.List;

public interface CollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer coid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated
     */
    int insert(Collection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated
     */
    Collection selectByPrimaryKey(Integer coid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated
     */
    List<Collection> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Collection record);
}