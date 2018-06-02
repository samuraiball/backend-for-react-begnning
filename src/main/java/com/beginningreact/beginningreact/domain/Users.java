package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity(immutable = true, naming = NamingType.LENIENT_SNAKE_LOWER_CASE)
public class Users {

    @Id
    String Id;

    @Column
    String name;

    @Column
    String username;

    @Column
    String email;


    @Column
    String phone;

    @Column
    String website;

    @Column(name = "address_id")
    String addressId;

    @Column(name = "company_id")
    String companyId;
}
