package com.Practice2.Practice2.Controller;

import com.Practice2.Practice2.Model.Employee;
import com.Practice2.Practice2.Service.Employeeimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Employeeimpl employeeimpl;

    @GetMapping("message")
    List<Employee> getAllEmployee(){
        return  employeeimpl.getAll();
    }

    @GetMapping("message/{id}")
    public Employee getOne(@PathVariable int id){
        return employeeimpl.getOne(id);
    }

    @PostMapping("/message")
    public void createAll(@RequestBody Employee details){
         employeeimpl.create(details);
    }

    @PutMapping("/message/{id}")
     public void  updateAll( @PathVariable int id,@RequestBody Employee details){
        employeeimpl.update(id,details);
    }
    @DeleteMapping("message/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeimpl.delete(id);
    }






}
