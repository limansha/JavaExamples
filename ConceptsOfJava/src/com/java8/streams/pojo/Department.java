package com.java8.streams.pojo;

public class Department {
    int deptID;
    int empId;
    String deptName;
    public Department(int deptID, int empId, String deptName) {
        this.deptID = deptID;
        this.empId = empId;
        this.deptName = deptName;
    }
    public int getDeptID() {
        return deptID;
    }
    public int getEmpId() {
        return empId;
    }
    public String getDeptName() {
        return deptName;
    }
    @Override
    public String toString() {
        return "Department [deptID=" + deptID + ", empId=" + empId + ", deptName=" + deptName + "]";
    }
  
}
