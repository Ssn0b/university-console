package com.snob.universityconsole.repository;

import com.snob.universityconsole.model.Degree;
import com.snob.universityconsole.model.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LectorRepository extends JpaRepository<Lector, UUID> {
    @Query("SELECT COUNT(l) FROM Lector l JOIN l.departments d WHERE d.name = :departmentName AND l.degree = :degree")
    Long countLectorsByDepartmentAndDegree(String departmentName, Degree degree);
    @Query("SELECT CONCAT(l.firstName, ' ', l.lastName) FROM Lector l WHERE LOWER(CONCAT(l.firstName, ' ', l.lastName)) LIKE LOWER(CONCAT('%', :template, '%'))")
    List<String> globalSearch(String template);
}
