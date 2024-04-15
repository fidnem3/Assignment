package com.javalab.domain;

/**
 * 사원 도메인 클래스
 * - 속성(멤버변수) : 직원id, 지원명, 직급명, 급여
 */
public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private int salary;

    // 기본 생성자
    public Employee() {

    }
    // 생성자
    public  Employee(int employeeId, String name, String position, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 4. getter setter 메소드
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId =employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }


}
