package com.snob.universityconsole.repository;

import com.snob.universityconsole.model.Department;
import com.snob.universityconsole.model.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, UUID> {
    @Query("SELECT d.headOfDepartment FROM Department d WHERE d.name = :departmentName")
    Lector findHeadOfDepartmentByName(String departmentName);
    @Query("SELECT AVG(l.salary) FROM Lector l JOIN l.departments d WHERE d.name = :departmentName")
    Double findAverageSalaryByDepartment(String departmentName);
    @Query("SELECT COUNT(l) FROM Lector l JOIN l.departments d WHERE d.name = :departmentName")
    Long countEmployeesByDepartment(String departmentName);
    Boolean existsByName(String departmentName);
}
