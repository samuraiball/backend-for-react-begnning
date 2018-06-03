package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.seasar.doma.*;
import org.seasar.doma.jdbc.entity.NamingType;

@Table(name = "company")
@Entity(immutable = true, naming = NamingType.LENIENT_SNAKE_LOWER_CASE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id
    int companyId;

    @Column
    String companyName;

    @Column
    String catchPhrase;

    @Column
    String bs;
}
