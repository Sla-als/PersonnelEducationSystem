package ru.company.personneleducationsystem.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.UUID;

@JmixEntity
@Table(name = "CERTIFICATE", indexes = {
        @Index(name = "IDX_CERTIFICATE_COURSE", columnList = "COURSE_ID")
})
@Entity
public class Certificate {
    @InstanceName
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "GRADE")
    private Integer grade;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COURSE_ID")
    private Course course;

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}