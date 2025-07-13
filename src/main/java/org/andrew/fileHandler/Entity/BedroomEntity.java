package org.andrew.fileHandler.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Data
@Table(name = "bedroom")
public class BedroomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime createdAt;

    @Column(name = "house_num")
    private String houseNum;

    @Column(name = "appliance_num")
    private String applianceNum;

    @Column(name = "is_available")
    private Boolean isAvailable;

    @Column(name = "is_repaired")
    private Boolean isRepaired;

    @Column(name = "repaired_report")
    private String repairedReport;

    // Getters and Setters
}