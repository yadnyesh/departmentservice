package io.yadnyesh.department.controller;

import io.yadnyesh.department.entity.Department;
import io.yadnyesh.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("CONTROLLER: Inside saveDepartment");
        log.info(department.toString());
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentbyId(@PathVariable("id") Long departmentId) {
        log.info("CONTROLLER: Inside getDepartmentbyId for: " + departmentId);
        return departmentService.getDepartmentById(departmentId);
    }

}
