package com.example.finalproject.Nhansu;

public class Employee {
    private String name,id,department,email,phone;

    public Employee(String name, String id, String department, String email, String phone)
    {
        this.name = name;
        this.id = id;
        this.department = department;
        this.email = email;
        this.phone = phone;
    }

    public Employee(){}

    public String getName(){return name;}
    public String getId(){return id;}
    public String getDepartment(){return department;}
    public String getEmail(){return email;}
    public String getPhone(){return phone;}

    public void setName(String name){this.name = name;}
    public void setId(String id){this.id = id;}
    public void setDepartment(String department){this.department = department;}
    public void setEmail(String email){this.email = email;}
    public void setPhone(String phone){this.phone = phone;}
}
