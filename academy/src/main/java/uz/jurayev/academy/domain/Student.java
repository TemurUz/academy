package uz.jurayev.academy.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Table(name = "student")
@Entity
public class Student extends AbstractAuditable<User, Long> {
    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "surname", length = 30)
    private String surname;

    @Column(name = "lastname", length = 30)
    private String lastname;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "temporal_address_id")
    private Long temporalAddressId;

    @Column(name = "family_status_id")
    private Long familyStatusId;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(name = "education_id")
    private Long educationId;

    @Column(name = "gender_id")
    private Long genderId;

    @Column(name = "nationality_id")
    private Long nationalityId;

    @Column(name = "telegram_phone_number", length = 20)
    private String telegramPhoneNumber;

    @Column(name = "passport_data", length = 20)
    private String passportData;

    @Column(name = "relatives_id")
    private Long relativesId;

    @Column(name = "creative_potential_id")
    private Long creativePotentialId;

    @Column(name = "rating_status_id")
    private Long ratingStatusId;

    public Long getRatingStatusId() {
        return ratingStatusId;
    }

    public void setRatingStatusId(Long ratingStatusId) {
        this.ratingStatusId = ratingStatusId;
    }

    public Long getCreativePotentialId() {
        return creativePotentialId;
    }

    public void setCreativePotentialId(Long creativePotentialId) {
        this.creativePotentialId = creativePotentialId;
    }

    public Long getRelativesId() {
        return relativesId;
    }

    public void setRelativesId(Long relativesId) {
        this.relativesId = relativesId;
    }

    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    public String getTelegramPhoneNumber() {
        return telegramPhoneNumber;
    }

    public void setTelegramPhoneNumber(String telegramPhoneNumber) {
        this.telegramPhoneNumber = telegramPhoneNumber;
    }

    public Long getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(Long nationalityId) {
        this.nationalityId = nationalityId;
    }

    public Long getGenderId() {
        return genderId;
    }

    public void setGenderId(Long genderId) {
        this.genderId = genderId;
    }

    public Long getEducationId() {
        return educationId;
    }

    public void setEducationId(Long educationId) {
        this.educationId = educationId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getFamilyStatusId() {
        return familyStatusId;
    }

    public void setFamilyStatusId(Long familyStatusId) {
        this.familyStatusId = familyStatusId;
    }

    public Long getTemporalAddressId() {
        return temporalAddressId;
    }

    public void setTemporalAddressId(Long temporalAddressId) {
        this.temporalAddressId = temporalAddressId;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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