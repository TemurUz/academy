package uz.jurayev.academy.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "category")
@Entity
public class Category extends AbstractAuditable<User, Long> {
    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "creative_potential_id")
    private Long creativePotentialId;

    public Long getCreativePotentialId() {
        return creativePotentialId;
    }

    public void setCreativePotentialId(Long creativePotentialId) {
        this.creativePotentialId = creativePotentialId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}