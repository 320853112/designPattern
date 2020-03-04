package com.xu.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuhang
 * @Date: 2020/2/27 12:27
 * @Description:
 **/

//打印学校的员工和学院的员工
public class Demeter1 {
    public static void main(String[] args) {
        CollegeManager collegeManager = new CollegeManager();
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(collegeManager);
    }
}

class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {
    public List<CollegeEmployee> getAllCollegeEmployee() {
        List<CollegeEmployee> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    public void PrintCollegeEmployee(){
        List<CollegeEmployee> allCollegeEmployee = this.getAllCollegeEmployee();
        for (CollegeEmployee collegeEmployee : allCollegeEmployee) {
            System.out.println(collegeEmployee.getId());
        }
    }
}

class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Employee emp = new Employee();
            emp.setId("学校员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    public void printAllEmployee(CollegeManager sub){
        /*
        1.CollegeEmployee不是SchoolManager的直接朋友
        2.CollegeEmployee是以局部变量的形式出现在方法中
        3.所以违反了demeter法则
         */
        System.out.println("----学院员工----");
        sub.PrintCollegeEmployee();
        System.out.println("----学校员工----");
        List<Employee> allEmployee = this.getAllEmployee();
        for (Employee employee : allEmployee) {
            System.out.println(employee.getId());
        }
    }
}


