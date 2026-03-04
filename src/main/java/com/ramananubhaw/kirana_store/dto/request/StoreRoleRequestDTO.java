package com.ramananubhaw.kirana_store.dto.request;

import com.ramananubhaw.kirana_store.entity.enums.StoreRoleEnum;

import jakarta.validation.constraints.NotBlank;

public class StoreRoleRequestDTO {
    @NotBlank(message = "Store Role ID is required")
    private String storeRoleId;

    @NotBlank(message = "Role is required")
    private StoreRoleEnum role;
}
