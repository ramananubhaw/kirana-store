package com.ramananubhaw.kirana_store.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreRoleCreateRequestDTO {

    @NotBlank(message = "Store ID is required")
    private String storeId;

    @NotBlank(message = "User ID is required")
    private String userId;

    @NotBlank(message = "Role is required")
    private String role;
}
