package com.stackroute.exercise2;

public class MemberVariable {
    public static void main(String[] args) {
        MemberClass obj = new MemberClass();           //object of "MemberClass"
        obj.setName("Harry");
        obj.setAge(30);
        obj.setSalary(2500.3);
        System.out.println(obj.getName());          //printing the values of variables
        System.out.println(obj.getAge());
        System.out.println(obj.getSalary());
    }
}
