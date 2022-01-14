package io.yadnyesh.department.repository;

import io.yadnyesh.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
