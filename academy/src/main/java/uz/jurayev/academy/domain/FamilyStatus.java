package uz.jurayev.academy.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "family_status")
@Entity
public class FamilyStatus extends AbstractAuditable<User, Long> {
    @Column(name = "family_condition_id")
    private Long familyConditionId;

    @Column(name = "low_income")
    private Boolean lowIncome;

    @Column(name = "lost_breadwinner_id")
    private Long lostBreadwinnerId;

    @Column(name = "invalid_id")
    private Long invalidId;

    public Long getInvalidId() {
        return invalidId;
    }

    public void setInvalidId(Long invalidId) {
        this.invalidId = invalidId;
    }

    public Long getLostBreadwinnerId() {
        return lostBreadwinnerId;
    }

    public void setLostBreadwinnerId(Long lostBreadwinnerId) {
        this.lostBreadwinnerId = lostBreadwinnerId;
    }

    public Boolean getLowIncome() {
        return lowIncome;
    }

    public void setLowIncome(Boolean lowIncome) {
        this.lowIncome = lowIncome;
    }

    public Long getFamilyConditionId() {
        return familyConditionId;
    }

    public void setFamilyConditionId(Long familyConditionId) {
        this.familyConditionId = familyConditionId;
    }
}