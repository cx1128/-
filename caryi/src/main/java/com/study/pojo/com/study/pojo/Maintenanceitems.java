package com.study.pojo;

import java.io.Serializable;

public class Maintenanceitems implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maintenanceitems.mid
     *
     * @mbg.generated
     */
    private Integer mid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maintenanceitems.mcategory
     *
     * @mbg.generated
     */
    private String mcategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maintenanceitems.mname
     *
     * @mbg.generated
     */
    private String mname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maintenanceitems.mmoney
     *
     * @mbg.generated
     */
    private Integer mmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table maintenanceitems
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maintenanceitems.mid
     *
     * @return the value of maintenanceitems.mid
     *
     * @mbg.generated
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maintenanceitems.mid
     *
     * @param mid the value for maintenanceitems.mid
     *
     * @mbg.generated
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maintenanceitems.mcategory
     *
     * @return the value of maintenanceitems.mcategory
     *
     * @mbg.generated
     */
    public String getMcategory() {
        return mcategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maintenanceitems.mcategory
     *
     * @param mcategory the value for maintenanceitems.mcategory
     *
     * @mbg.generated
     */
    public void setMcategory(String mcategory) {
        this.mcategory = mcategory == null ? null : mcategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maintenanceitems.mname
     *
     * @return the value of maintenanceitems.mname
     *
     * @mbg.generated
     */
    public String getMname() {
        return mname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maintenanceitems.mname
     *
     * @param mname the value for maintenanceitems.mname
     *
     * @mbg.generated
     */
    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maintenanceitems.mmoney
     *
     * @return the value of maintenanceitems.mmoney
     *
     * @mbg.generated
     */
    public Integer getMmoney() {
        return mmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maintenanceitems.mmoney
     *
     * @param mmoney the value for maintenanceitems.mmoney
     *
     * @mbg.generated
     */
    public void setMmoney(Integer mmoney) {
        this.mmoney = mmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintenanceitems
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mid=").append(mid);
        sb.append(", mcategory=").append(mcategory);
        sb.append(", mname=").append(mname);
        sb.append(", mmoney=").append(mmoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}