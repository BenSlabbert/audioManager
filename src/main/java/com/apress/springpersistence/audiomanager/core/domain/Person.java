package com.apress.springpersistence.audiomanager.core.domain;

import java.util.Optional;

import javax.persistence.*;

import org.hibernate.validator.constraints.Email;

import com.apress.springpersistence.audiomanager.core.domain.components.PersonName;


@Entity
@PrimaryKeyJoinColumn(name = "THING_URL")
@Inheritance(strategy = InheritanceType.JOINED)

public class Person extends Thing {
    
    @Embedded
    private PersonName personName;
    @Email
    private String email;
    private String gender;
    private String telephone;
    
    @Transient
    public Optional<String> getGivenName() {
        return Optional.ofNullable(this.personName.getFirstName());
    }
    
    @Transient
    public Optional<String> getAdditionalName() {
        return Optional.ofNullable(this.personName.getLastName());
    }
    
    public PersonName getPersonName() {
        return personName;
    }
    
    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    
    
}
