package com.krish.spring_boot_mysql_demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
@AttributeOverrides({@AttributeOverride(name = AbstractEntity.PRIMARY_KEY, column = @Column(name = Student.PRIMARY_KEY))})
@ToString
public class Student extends AbstractEntity{

    public static final String PRIMARY_KEY = "stud_id";

    private String firstName;
    private String lastName;

    @ElementCollection
    @CollectionTable(name = Address.TABLE, joinColumns = @JoinColumn(name = PRIMARY_KEY))
    private List<Address> address;

}
