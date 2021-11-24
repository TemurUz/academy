package uz.jurayev.academy.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;
import javax.persistence.*;

@Table(name = "relatives_type")
@Entity
public class RelativesType extends AbstractAuditable<User, Long> {

    @Column(name = "name", length = 30)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}