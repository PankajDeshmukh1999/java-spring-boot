package com.codekul.java28SeptFullStack.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired  // connect
    private EmployeeRepository employeeRepository;

    @PostMapping("saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee saved";
    }
    @GetMapping("getEmployee")
    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }
    @PutMapping("updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){

        Employee obj = employeeRepository.getById(employee.getId());
        obj.setAddress(employee.getAddress());
        obj.setName(employee.getName());
        obj.setContact(employee.getContact());
        employeeRepository.save(obj);
        return "updated...";
    }

    @DeleteMapping("deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value="id") Integer id){
        employeeRepository.deleteById(id);
        return "deleted employee ";
    }

    @GetMapping ("getEmployee/{id}")
    public Optional<Employee> getEmpById(@PathVariable(value="id") Integer id){
        return employeeRepository.findById(id);

    }

    @GetMapping ("getEmpByIdAndName")
    public Employee getEmpByIdAndName(@RequestParam("id")Integer id,
                                      @RequestParam("name")String name){
        return employeeRepository.findByIdAndName(id,name);

    }

    @GetMapping ("getEmpByIdOrName")
    public List<Employee> getEmpByIdOrName(@RequestParam("id")Integer id,
                                      @RequestParam("name")String name){
        return employeeRepository.findByIdOrName(id,name);
    }

    @GetMapping("getNameStartingWith")
    public List<Employee> getByNameStartingWith(@RequestParam("name")String name){
        return employeeRepository.findByNameStartingWith(name);
    }

}
