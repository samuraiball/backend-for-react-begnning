package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;


@Table(name = "company")
@Entity(immutable = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id
    String companyName;

    @Column
    String catchPhrase;

    @Column
    String bs;
}
