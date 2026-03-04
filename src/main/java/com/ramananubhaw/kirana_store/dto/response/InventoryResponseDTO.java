package com.ramananubhaw.kirana_store.dto.response;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponseDTO {
    private String inventoryId;
    private String productId;
    private String productName;
    private String brand;
    private String category;
    private Integer quantity;
    private BigDecimal mrp;
    private BigDecimal sellingPrice;
}
