package de.woroschbitj.city.data;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public String name;
    //alpha3
    public String country;

}
