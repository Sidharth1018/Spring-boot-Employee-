package com.Practice2.Practice2.Service;

import com.Practice2.Practice2.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class impl implements Employeeimpl {




                List<Employee> list1 =new ArrayList<>( Arrays.asList(
                new Employee(1, "Sidharth1", "kozhikode", "kerala"),
                new Employee(2, "Sidharth2", "kannur", "kerala"),
                new Employee(3, "Sidharth3", "kochi", "kerala")));




        @Override
        public List<Employee> getAll () {

            return list1;
        }

    @Override
    public Employee getOne(int id) {
        return list1.stream().filter(i->i.getId()==id).findFirst().get();
    }

    @Override
        public Employee create (Employee details){
            list1.add(details);
            return details;
        }

    @Override
    public void update(int id, Employee details) {

            list1.stream().filter(i->i.getId()==id).findFirst().ifPresent(o->o.setName("Sidharth8"));
        list1.stream().filter(i->i.getId()==id).findFirst().ifPresent(o->o.setDis("Kasargod"));
        list1.stream().filter(i->i.getId()==id).findFirst().ifPresent(o->o.setState("Gujrat"));
//        for (Employee t : list1) {
//            int i = 0;
//            Employee employee1 = t;
//            if (employee1.getId() == id) {
//                list1.set(i, details);
//                i++;
//                return;
//            }
//        }

    }

    @Override
    public void delete(int id) {
            list1.removeIf(i->i.getId()==id);

    }

}





