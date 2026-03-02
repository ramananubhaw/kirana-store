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
public class ProductCreateRequestDTO {
    @NotBlank(message = "Product name is required")
    private String name;

    private String brand;

    @NotBlank(message = "Category is required")
    private String category;

    @NotNull(message = "MRP is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "MRP must be a greater than 0")
    private BigDecimal mrp;

    private String description;
}
