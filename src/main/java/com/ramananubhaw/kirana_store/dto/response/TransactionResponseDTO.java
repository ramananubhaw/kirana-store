package com.ramananubhaw.kirana_store.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.ramananubhaw.kirana_store.entity.enums.CurrencyEnum;
import com.ramananubhaw.kirana_store.entity.enums.TransactionCategoryEnum;
import com.ramananubhaw.kirana_store.entity.enums.TransactionTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponseDTO {
    private String id;
    private String storeId;
    private TransactionTypeEnum type;
    private TransactionCategoryEnum category;
    private BigDecimal netAmount;
    private BigDecimal amountAdjustment;
    private CurrencyEnum currency;
    private String customerPhone;
    private String customerName;
    private LocalDateTime createdAt;
}
