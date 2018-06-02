package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;

import javax.persistence.Column;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(immutable = true, naming = NamingType.LENIENT_SNAKE_LOWER_CASE)
@Table(name = "geo")
public class Geo {

    @Id
    String geo_id;

    Double lat;

    @Column
    Double lng;


}
