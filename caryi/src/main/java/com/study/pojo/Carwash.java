package com.study.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
public class Carwash {
    private int cid;
    private Integer empno;
    private Integer cusid;
    private Integer empEmpno;
    private Timestamp ctime;
    private String cnumber;
    private String cbilltype;
    private String cdispatchtype;
    private Integer cmoney;
    private Emp emp;

    @Id
    @Column(name = "cid", nullable = false)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "empno", nullable = true)
    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    @Basic
    @Column(name = "cusid", nullable = true)
    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    @Basic
    @Column(name = "emp_empno", nullable = true)
    public Integer getEmpEmpno() {
        return empEmpno;
    }

    public void setEmpEmpno(Integer empEmpno) {
        this.empEmpno = empEmpno;
    }

    @Basic
    @Column(name = "ctime", nullable = true)
    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    @Basic
    @Column(name = "cnumber", nullable = true, length = 200)
    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber;
    }

    @Basic
    @Column(name = "cbilltype", nullable = true, length = 50)
    public String getCbilltype() {
        return cbilltype;
    }

    public void setCbilltype(String cbilltype) {
        this.cbilltype = cbilltype;
    }

    @Basic
    @Column(name = "cdispatchtype", nullable = true, length = 50)
    public String getCdispatchtype() {
        return cdispatchtype;
    }

    public void setCdispatchtype(String cdispatchtype) {
        this.cdispatchtype = cdispatchtype;
    }

    @Basic
    @Column(name = "cmoney", nullable = true, precision = 0)
    public Integer getCmoney() {
        return cmoney;
    }

    public void setCmoney(Integer cmoney) {
        this.cmoney = cmoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carwash carwash = (Carwash) o;
        return cid == carwash.cid &&
                Objects.equals(empno, carwash.empno) &&
                Objects.equals(cusid, carwash.cusid) &&
                Objects.equals(empEmpno, carwash.empEmpno) &&
                Objects.equals(ctime, carwash.ctime) &&
                Objects.equals(cnumber, carwash.cnumber) &&
                Objects.equals(cbilltype, carwash.cbilltype) &&
                Objects.equals(cdispatchtype, carwash.cdispatchtype) &&
                Objects.equals(cmoney, carwash.cmoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, empno, cusid, empEmpno, ctime, cnumber, cbilltype, cdispatchtype, cmoney);
    }

    @ManyToOne
    @JoinColumn(name = "emp_empno", referencedColumnName = "empno")
    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

}
