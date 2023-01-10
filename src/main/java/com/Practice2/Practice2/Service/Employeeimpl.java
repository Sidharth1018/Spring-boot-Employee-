package com.Practice2.Practice2.Service;

import com.Practice2.Practice2.Model.Employee;

import java.util.List;

public interface Employeeimpl {

     List<Employee> getAll();

     Employee getOne(int id);
     Employee create(Employee details);

     void  update(int id, Employee details);
     void delete(int id );



}
