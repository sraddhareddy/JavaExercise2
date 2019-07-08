package com.stackroute.exercise2;

public class MemberClass {
    private String name;
    private int age;
    private double salary;
    public String getName(){                            //get methods to print the value of variables
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){                  //set methods to initialize the variables
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}
