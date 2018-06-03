package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.seasar.doma.*;
import org.seasar.doma.jdbc.entity.NamingType;

import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity(immutable = true, naming = NamingType.LENIENT_SNAKE_LOWER_CASE)
public class Users {

    @Id
    int Id;

    @Column
    @NotNull
    String name;

    @Column
    @NotNull
    String username;

    @Column
    @NotNull
    String email;


    @Column
    String phone;

    @Column
    String website;

    @Column(name = "address_id")
    int addressId;

    @Column(name = "company_id")
    int companyId;
}
