package com.foodstore.ecommerce.backend.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "local_user")
public class LocalUser implements UserDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    @JsonIgnore
    @Column(name = "password", nullable = false, length = 1000)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "email", nullable = false, unique = true, length = 320)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "first_name", nullable = false)
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Address> addresses = new ArrayList<>();

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("id desc")
    private List<VerificationToken> verificationTokens = new ArrayList<>();

    public List<VerificationToken> getVerificationTokens() {
        return verificationTokens;
    }

    public void setVerificationTokens(List<VerificationToken> verificationTokens) {
        this.verificationTokens = verificationTokens;
    }
    

    @Column(name = "email_verified", nullable = false)
        private Boolean emailVerified = false;

        public Boolean isEmailVerified() {
            return emailVerified;
        }

        public void setEmailVerified(Boolean emailVerified) {
            this.emailVerified = emailVerified;
        }

        @JsonIgnore
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return List.of();
        }

        @JsonIgnore
        public boolean isAccountNonExpired() {
            // TODO Auto-generated method stub
            return true;
        }

        @JsonIgnore
        public boolean isAccountNonLocked() {
            // TODO Auto-generated method stub
            return true;
        }

        @JsonIgnore
        public boolean isCredentialsNonExpired() {
            // TODO Auto-generated method stub
            return true;
        }

        @JsonIgnore
        public boolean isEnabled() {
            // TODO Auto-generated method stub
            return true;
        }

        
        
    }


