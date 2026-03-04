package com.ramananubhaw.kirana_store.dto.request;

import java.math.BigDecimal;

import com.ramananubhaw.kirana_store.entity.enums.CurrencyEnum;
import com.ramananubhaw.kirana_store.entity.enums.TransactionCategoryEnum;
import com.ramananubhaw.kirana_store.entity.enums.TransactionTypeEnum;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequestDTO {
    @NotBlank(message = "Store ID is required")
    private String storeId;

    @NotNull(message = "Transaction type (CREDIT/DEBIT) is required")
    private TransactionTypeEnum type;

    @NotNull(message = "Transaction category (SALE/PURCHASE/REFUND) is required")
    private TransactionCategoryEnum category;

    @NotNull(message = "Net amount is required")
    private BigDecimal netAmount;

    // optional - defaults to 0 in DB
    private BigDecimal amountAdjustment;

    @NotNull(message = "Currency is required")
    private CurrencyEnum currency;

    @NotBlank(message = "Customer phone number is required")
    @Pattern(regexp = "^\\+?[0-9]{10}$", message = "Invalid phone number format")
    private String customerPhone;

    // optional
    private String customerName;
}
