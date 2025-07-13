package org.andrew.fileHandler.Entity;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "house")
public class HouseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime createdAt;

    @Column(name = "address")
    private String address;

    @Column(name = "ownership")
    private String ownership;

    @Column(name = "bedroom_count")
    private Integer bedroomCount;

    @Column(name = "available_situation")
    private Integer availableSituation;
}
