package com.study.pojo;

import java.io.Serializable;

public class Baoxian implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baoxian.bxid
     *
     * @mbg.generated
     */
    private Integer bxid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baoxian.bxname
     *
     * @mbg.generated
     */
    private String bxname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baoxian.bxleibie
     *
     * @mbg.generated
     */
    private String bxleibie;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baoxian.bxbeizhu
     *
     * @mbg.generated
     */
    private String bxbeizhu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baoxian.bxstart
     *
     * @mbg.generated
     */
    private String bxstart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table baoxian
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baoxian.bxid
     *
     * @return the value of baoxian.bxid
     *
     * @mbg.generated
     */
    public Integer getBxid() {
        return bxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baoxian.bxid
     *
     * @param bxid the value for baoxian.bxid
     *
     * @mbg.generated
     */
    public void setBxid(Integer bxid) {
        this.bxid = bxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baoxian.bxname
     *
     * @return the value of baoxian.bxname
     *
     * @mbg.generated
     */
    public String getBxname() {
        return bxname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baoxian.bxname
     *
     * @param bxname the value for baoxian.bxname
     *
     * @mbg.generated
     */
    public void setBxname(String bxname) {
        this.bxname = bxname == null ? null : bxname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baoxian.bxleibie
     *
     * @return the value of baoxian.bxleibie
     *
     * @mbg.generated
     */
    public String getBxleibie() {
        return bxleibie;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baoxian.bxleibie
     *
     * @param bxleibie the value for baoxian.bxleibie
     *
     * @mbg.generated
     */
    public void setBxleibie(String bxleibie) {
        this.bxleibie = bxleibie == null ? null : bxleibie.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baoxian.bxbeizhu
     *
     * @return the value of baoxian.bxbeizhu
     *
     * @mbg.generated
     */
    public String getBxbeizhu() {
        return bxbeizhu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baoxian.bxbeizhu
     *
     * @param bxbeizhu the value for baoxian.bxbeizhu
     *
     * @mbg.generated
     */
    public void setBxbeizhu(String bxbeizhu) {
        this.bxbeizhu = bxbeizhu == null ? null : bxbeizhu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baoxian.bxstart
     *
     * @return the value of baoxian.bxstart
     *
     * @mbg.generated
     */
    public String getBxstart() {
        return bxstart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baoxian.bxstart
     *
     * @param bxstart the value for baoxian.bxstart
     *
     * @mbg.generated
     */
    public void setBxstart(String bxstart) {
        this.bxstart = bxstart == null ? null : bxstart.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baoxian
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bxid=").append(bxid);
        sb.append(", bxname=").append(bxname);
        sb.append(", bxleibie=").append(bxleibie);
        sb.append(", bxbeizhu=").append(bxbeizhu);
        sb.append(", bxstart=").append(bxstart);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}