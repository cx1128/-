package com.study.pojo;

import java.io.Serializable;
import java.util.Date;

public class Acharge implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acharge.acid
     *
     * @mbg.generated
     */
    private Integer acid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acharge.cusid
     *
     * @mbg.generated
     */
    private Integer cusid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acharge.actime
     *
     * @mbg.generated
     */
    private Date actime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acharge.acuser
     *
     * @mbg.generated
     */
    private String acuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acharge.acremarks
     *
     * @mbg.generated
     */
    private String acremarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table acharge
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acharge.acid
     *
     * @return the value of acharge.acid
     *
     * @mbg.generated
     */
    public Integer getAcid() {
        return acid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acharge.acid
     *
     * @param acid the value for acharge.acid
     *
     * @mbg.generated
     */
    public void setAcid(Integer acid) {
        this.acid = acid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acharge.cusid
     *
     * @return the value of acharge.cusid
     *
     * @mbg.generated
     */
    public Integer getCusid() {
        return cusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acharge.cusid
     *
     * @param cusid the value for acharge.cusid
     *
     * @mbg.generated
     */
    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acharge.actime
     *
     * @return the value of acharge.actime
     *
     * @mbg.generated
     */
    public Date getActime() {
        return actime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acharge.actime
     *
     * @param actime the value for acharge.actime
     *
     * @mbg.generated
     */
    public void setActime(Date actime) {
        this.actime = actime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acharge.acuser
     *
     * @return the value of acharge.acuser
     *
     * @mbg.generated
     */
    public String getAcuser() {
        return acuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acharge.acuser
     *
     * @param acuser the value for acharge.acuser
     *
     * @mbg.generated
     */
    public void setAcuser(String acuser) {
        this.acuser = acuser == null ? null : acuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acharge.acremarks
     *
     * @return the value of acharge.acremarks
     *
     * @mbg.generated
     */
    public String getAcremarks() {
        return acremarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acharge.acremarks
     *
     * @param acremarks the value for acharge.acremarks
     *
     * @mbg.generated
     */
    public void setAcremarks(String acremarks) {
        this.acremarks = acremarks == null ? null : acremarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acharge
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acid=").append(acid);
        sb.append(", cusid=").append(cusid);
        sb.append(", actime=").append(actime);
        sb.append(", acuser=").append(acuser);
        sb.append(", acremarks=").append(acremarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}