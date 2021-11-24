package uz.jurayev.academy.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "creative_potential")
@Entity
public class CreativePotential extends AbstractAuditable<User, Long> {
    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "student_id")
    private Long studentId;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}