package org.andrew.fileHandler.Entity;

import javax.persistence.*;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import java.time.OffsetDateTime;

@Entity
@Table(name = "appliance")
@Data
public class ApplianceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "appliance_name", nullable = false)
    private String applianceName;

    @Column(name = "bed_id")
    private Long bedId;

    @Column(name = "is_repair")
    private Boolean isRepair;

    @Column(name = "original_price")
    private Long originalPrice;

    /**
     * quoting is only needed if your dialect treats CONDITION as reserved;
     * otherwise @Column(name="condition") is fine.
     */
    @Column(name = "condition")
    private String condition;

    @Column(name = "purchase_year")
    private Long purchaseYear;

    // —— getters & setters —— //


}