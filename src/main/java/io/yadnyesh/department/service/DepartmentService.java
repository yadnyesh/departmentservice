package io.yadnyesh.department.service;

import io.yadnyesh.department.entity.Department;
import io.yadnyesh.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("SERVICE: Inside saveDepartment");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentId) {
        log.info("SERVICE: Inside getDepartmentById for: " + departmentId);
        return departmentRepository.findById(departmentId).get();
    }
}
