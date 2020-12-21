package com.study.pojo;

import java.io.Serializable;

public class Units implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column units.jlid
     *
     * @mbg.generated
     */
    private Integer jlid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column units.jlname
     *
     * @mbg.generated
     */
    private String jlname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column units.jlstart
     *
     * @mbg.generated
     */
    private String jlstart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table units
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column units.jlid
     *
     * @return the value of units.jlid
     *
     * @mbg.generated
     */
    public Integer getJlid() {
        return jlid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column units.jlid
     *
     * @param jlid the value for units.jlid
     *
     * @mbg.generated
     */
    public void setJlid(Integer jlid) {
        this.jlid = jlid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column units.jlname
     *
     * @return the value of units.jlname
     *
     * @mbg.generated
     */
    public String getJlname() {
        return jlname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column units.jlname
     *
     * @param jlname the value for units.jlname
     *
     * @mbg.generated
     */
    public void setJlname(String jlname) {
        this.jlname = jlname == null ? null : jlname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column units.jlstart
     *
     * @return the value of units.jlstart
     *
     * @mbg.generated
     */
    public String getJlstart() {
        return jlstart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column units.jlstart
     *
     * @param jlstart the value for units.jlstart
     *
     * @mbg.generated
     */
    public void setJlstart(String jlstart) {
        this.jlstart = jlstart == null ? null : jlstart.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jlid=").append(jlid);
        sb.append(", jlname=").append(jlname);
        sb.append(", jlstart=").append(jlstart);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}