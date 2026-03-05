package com.ramananubhaw.kirana_store.dto.request;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RefundRequestDTO {
    @NotBlank(message = "Store ID is required")
    private String storeId;

    @NotBlank(message = "Original Transaction ID is required")
    private String transactionId;

    @NotEmpty(message = "At least one item must be included in the refund request")
    private List<RefundItemRequestDTO> items;

    private String description;
}
