package uz.jurayev.academy.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "nationality")
@Entity
public class Nationality extends AbstractAuditable<User, Long> {
    @Column(name = "nationality_name", length = 30)
    private String nationalityName;

    public String getNationalityName() {
        return nationalityName;
    }

    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName;
    }
}