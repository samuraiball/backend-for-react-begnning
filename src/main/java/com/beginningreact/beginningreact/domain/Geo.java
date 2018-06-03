package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.seasar.doma.*;
import org.seasar.doma.jdbc.entity.NamingType;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(immutable = true, naming = NamingType.LENIENT_SNAKE_LOWER_CASE)
@Table(name = "geo")
public class Geo {

    @Id
    int geoId;

    @Column
    Double lat;

    @Column
    Double lng;
}
