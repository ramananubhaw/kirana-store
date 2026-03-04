package com.ramananubhaw.kirana_store.dto.request;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryUpdateRequestDTO {
    @NotBlank(message = "Inventory ID is required")
    private String inventoryId;

    @Min(value = 0, message = "Quantity must be non-negative")
    private Integer quantity;

    @DecimalMin(value = "0.0", inclusive = false, message = "Selling Price must be greater than zero")
    private BigDecimal sellingPrice;
}
