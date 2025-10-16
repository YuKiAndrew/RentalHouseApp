package org.andrew.fileHandler.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class SellDto {

    private String category;

    private String productName;

    private Integer quantity;

    private BigDecimal totalAmount;

    private LocalDateTime sellTime;

    private String sellerName;

    private String remark;
}
