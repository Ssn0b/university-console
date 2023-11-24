package com.snob.universityconsole.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "_lectors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lector {
    @Id
    @GeneratedValue
    private UUID id;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Degree degree;
    private double salary;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "lectors_departments",
            joinColumns = { @JoinColumn(name = "lector_id") },
            inverseJoinColumns = { @JoinColumn(name = "department_id") }
    )
    private Set<Department> departments;
    public String getFullName(){
        return firstName + " " + lastName;
    }
}
