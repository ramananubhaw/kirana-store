package com.ramananubhaw.kirana_store.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import com.ramananubhaw.kirana_store.entity.enums.CurrencyEnum;
import com.ramananubhaw.kirana_store.entity.enums.TransactionCategoryEnum;
import com.ramananubhaw.kirana_store.entity.enums.TransactionTypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transactions")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    // @Column(name = "store_id", nullable = false)
    // private UUID storeId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;

    // @Column(name = "reference_refund_id")
    // private UUID referenceRefundId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reference_refund_id")
    private Refund referencRefund;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private TransactionTypeEnum type; // CREDIT, DEBIT

    @Enumerated(EnumType.STRING)
    @Column(name = "currency", nullable = false)
    private CurrencyEnum currency; // INR, USD, etc.

    @Column(name = "net_amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal netAmount;

    @Column(name = "amount_adjustment", precision = 10, scale = 2, nullable = false)
    @Builder.Default
    private BigDecimal amountAdjustment = BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private TransactionCategoryEnum category; // SALE, PURCHASE, REFUND

    @Column(name = "customer_phone", nullable = false)
    private String customerPhone;

    @Column(name = "customer_name")
    private String customerName;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
}
