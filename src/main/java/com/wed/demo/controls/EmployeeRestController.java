package com.wed.demo.controls;

import com.wed.demo.records.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeRestController {

    @GetMapping("helloWorld")
    public String helloWorld(){
        return "hello World";
    }

    //helloWorld
    @GetMapping("helloWorld/{salary}/{id}/{sal}")
    public String helloWorld(@RequestParam("name") String name,
                             @RequestParam("id") int id,
                             @PathVariable int salary,
                             @PathVariable double sal){
        return "hello World";
    }

    @PostMapping("saveEmp")
    public String saveExmployee(@Validated @RequestBody Employee employee){
        return "EMployee";
    }
}

