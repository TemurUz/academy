package uz.jurayev.academy.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "relatives")
@Entity
public class Relative extends AbstractAuditable<User, Long> {
    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "surname", length = 30)
    private String surname;

    @Column(name = "lastname", length = 30)
    private String lastname;

    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "invalid_id")
    private Long invalidId;

    @Column(name = "relatives_type_id")
    private Long relativesTypeId;

    @Column(name = "benefit_id")
    private Long benefitId;

    public Long getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(Long benefitId) {
        this.benefitId = benefitId;
    }

    public Long getRelativesTypeId() {
        return relativesTypeId;
    }

    public void setRelativesTypeId(Long relativesTypeId) {
        this.relativesTypeId = relativesTypeId;
    }

    public Long getInvalidId() {
        return invalidId;
    }

    public void setInvalidId(Long invalidId) {
        this.invalidId = invalidId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}