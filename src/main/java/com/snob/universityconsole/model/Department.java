package com.snob.universityconsole.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "_departments")
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    @ManyToOne(fetch = FetchType.EAGER)
    private Lector headOfDepartment;
    @ManyToMany(mappedBy = "departments")
    private Set<Lector> employees = new HashSet<>();
}
