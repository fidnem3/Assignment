package com.javalab.homeworks;
public class EmployeData { // 사원데이터
    private int num; // 사원번호
    private String employee; // 사원명
    private String rank; // 직급
    private int salary; // 급여

    public EmployeData() {

    }


    public EmployeData(int num, String employee, String rank, int salary){
        this.num = num;
        this.employee = employee;
        this.rank = rank;
        this.salary = salary;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public String getEmployee() {
        return employee;
    }
    public void setEmployee(String employee){
        this.employee = employee;
    }
    public  String getRank() {
        return rank;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
}
