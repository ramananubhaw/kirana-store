package com.ramananubhaw.kirana_store.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StaffResponseDTO {
    private String storeRoleId;
    private String userId;
    private String name;
    private String email;
    private String phoneNo;
    private String role;
}