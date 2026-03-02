package com.ramananubhaw.kirana_store.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreResponseDTO {
    private String id;
    private String name;
    private String address;
    private String phoneNo;
    private String ownerId;
    private LocalDateTime createdAt;
}
