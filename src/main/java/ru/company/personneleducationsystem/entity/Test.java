package ru.company.personneleducationsystem.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "TEST", indexes = {
        @Index(name = "IDX_TEST_COURSE", columnList = "COURSE_ID")
})
@Entity
public class Test {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "COURSE_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Course course;

    @OneToMany(mappedBy = "test")
    private List<Material> material;

    @Lob
    @Column(name = "CONTECT")
    private String contect;

    public String getContect() {
        return contect;
    }

    public void setContect(String contect) {
        this.contect = contect;
    }

    public List<Material> getMaterial() {
        return material;
    }

    public void setMaterial(List<Material> material) {
        this.material = material;
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