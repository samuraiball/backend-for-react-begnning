package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class Users {

    @Id
    String Id;

    @Column
    String name;

    @Column
    String userName;

    @Column
    String email;


    @Column
    String phone;

    @Column
    String website;

    @Column
    String addressId;
}
