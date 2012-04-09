package org.dyndns.phpusr.contactmanager.entity;

import javax.persistence.*;

/**
 * @author phpusr
 *         Date: 07.04.12
 *         Time: 20:11
 */

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String studGroup;

    public Student() {
    }

    public Student(String name, String surname, String studGroup) {
        this.name = name;
        this.surname = surname;
        this.studGroup = studGroup;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudGroup() {
        return studGroup;
    }

    public void setStudGroup(String group) {
        this.studGroup = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studGroup='" + studGroup + '\'' +
                '}';
    }
}
