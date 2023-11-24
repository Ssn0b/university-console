package com.snob.universityconsole.service;

import com.snob.universityconsole.model.Degree;
import com.snob.universityconsole.model.Lector;
import com.snob.universityconsole.repository.DepartmentRepository;
import com.snob.universityconsole.repository.LectorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UniversityService {
    private final DepartmentRepository departmentRepository;
    private final LectorRepository lectorRepository;

    public String findHeadOfDepartment(String departmentName) {
        Lector headOfDepartment = departmentRepository.findHeadOfDepartmentByName(departmentName);
        return headOfDepartment.getFullName();
    }

    public Map<String, Long> showDepartmentStatistics(String departmentName) {
        Map<String, Long> statisticsMap = new HashMap<>();
        statisticsMap.put("Assistant", lectorRepository.countLectorsByDepartmentAndDegree(departmentName, Degree.ASSISTANT));
        statisticsMap.put("Associate professor", lectorRepository.countLectorsByDepartmentAndDegree(departmentName, Degree.ASSOCIATE_PROFESSOR));
        statisticsMap.put("Professor", lectorRepository.countLectorsByDepartmentAndDegree(departmentName, Degree.PROFESSOR));
        return statisticsMap;
    }

    public Double findAverageSalaryByDepartment(String departmentName) {
        return departmentRepository.findAverageSalaryByDepartment(departmentName);
    }

    public Long countEmployeesByDepartment(String departmentName) {
        return departmentRepository.countEmployeesByDepartment(departmentName);
    }

    public List<String> globalSearch(String template) {
        return lectorRepository.globalSearch(template);
    }

    public boolean isValidDepartment(String departmentName) {
        return departmentRepository.existsByName(departmentName);
    }
}
