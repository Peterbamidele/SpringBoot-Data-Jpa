package com.springdatajpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "students",
        uniqueConstraints = {
            @UniqueConstraint(name = "students_emil_unique", columnNames = "email")
})
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"

    )

//    @Column(name = "id",
//    updatable = false)
//    private Long id;

    @Column(name  = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;

    @Column(name = "last_name,",
                nullable = false,
                columnDefinition = "TEXT"
                )
    private String lastName;

    @Column(name = "email",
    nullable = false,
    columnDefinition = "TEXT",
    unique = true)
    private String email;

    @Column(name = "age",
        nullable = false)
    private Integer age;

    }

