package com.study.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Emp {
    private int empno;
    private String ename;
    private Long ephone;
    private Integer shangji;
    private String sex;
    private String estart;
    private List<Carwash> caiwashs;

    @Id
    @Column(name = "empno", nullable = false)
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    @Basic
    @Column(name = "ename", nullable = true, length = 255)
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    @Column(name = "ephone", nullable = true)
    public Long getEphone() {
        return ephone;
    }

    public void setEphone(Long ephone) {
        this.ephone = ephone;
    }

    @Basic
    @Column(name = "shangji", nullable = true)
    public Integer getShangji() {
        return shangji;
    }

    public void setShangji(Integer shangji) {
        this.shangji = shangji;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 255)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "estart", nullable = true, length = 255)
    public String getEstart() {
        return estart;
    }

    public void setEstart(String estart) {
        this.estart = estart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return empno == emp.empno &&
                Objects.equals(ename, emp.ename) &&
                Objects.equals(ephone, emp.ephone) &&
                Objects.equals(shangji, emp.shangji) &&
                Objects.equals(sex, emp.sex) &&
                Objects.equals(estart, emp.estart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, ename, ephone, shangji, sex, estart);
    }

    @OneToMany(mappedBy = "emp")
    public List<Carwash> getCaiwashs() {
        return caiwashs;
    }

    public void setCaiwashs(List<Carwash> caiwashs) {
        this.caiwashs = caiwashs;
    }
}
