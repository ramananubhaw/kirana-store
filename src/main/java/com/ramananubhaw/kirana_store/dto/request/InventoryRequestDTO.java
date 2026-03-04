package com.ramananubhaw.kirana_store.dto.request;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryRequestDTO {
    @NotBlank(message = "Product ID is required")
    private String productId;

    @NotNull(message = "Selling Price is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Selling Price must be greater than zero")
    private BigDecimal sellingPrice;

    @NotNull(message = "Quantity is required")
    private Integer quantity;
}
