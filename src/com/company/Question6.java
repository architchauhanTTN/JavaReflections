package com.company;
import java.util.ArrayList;
import java.util.*;

import static java.util.Locale.filter;

class Employee1
{
    String name;
    int age;

    Employee1(String name , int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
}

public class Question6
{
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();

        Employee1 emp = new Employee1("Yash Chauhan",28);

        list.add(new Employee1("vanshaj", 22));
        list.add(new Employee1("pushkar", 23));
        list.add(new Employee1("nikita", 27));
        list.add(new Employee1("archit", 26));
        list.add(new Employee1("namit", 21));
        list.add(new Employee1("naman", 25));


        System.out.println("The required employees are: ");

        list.stream().filter(p -> p.getName().startsWith("n")).filter(p ->p.getAge()> 24)
                .map(p ->p.getName())
                .forEach(System.out::println);
    }
}
