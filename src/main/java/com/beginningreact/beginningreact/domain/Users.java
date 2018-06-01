package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class Users {

    @Id
    String Id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String userName;

    @Column
    String email;


    @Column(nullable = false)
    String userAddressId;

    @Column(nullable = false)
    String phone;

    @Column(nullable = false)
    String website;

    @OneToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(nullable = true, name = "addressId")
    Address address;

    @OneToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(nullable = true, name = "companyName")
    Company company;
}
