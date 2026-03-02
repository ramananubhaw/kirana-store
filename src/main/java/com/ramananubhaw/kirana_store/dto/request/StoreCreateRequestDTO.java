package com.ramananubhaw.kirana_store.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreCreateRequestDTO {
    @NotBlank(message = "Store name is required")
    private String name;

    @NotBlank(message = "Store address is required")
    private String address;

    @NotBlank(message = "Owner ID is required")
    private String ownerId;

    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String phoneNo;
}
