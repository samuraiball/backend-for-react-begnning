package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "company")
public class Company {

    @Id
    String companyName;

    @Column
    String catchPhrase;

    @Column
    String bs;


}
