package org.komponente.rentalservice.domain;

//import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long clientid;

    @ManyToOne
    private Company company;

    private Integer stars;
    private String description;

}
