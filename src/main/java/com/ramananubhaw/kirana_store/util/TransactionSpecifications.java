package com.ramananubhaw.kirana_store.util;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.jpa.domain.Specification;

import com.ramananubhaw.kirana_store.entity.Transaction;

public class TransactionSpecifications {
    // Filter by store ID
    public static Specification<Transaction> hasStoreId(UUID storeId) {
        return (root, query, cb) -> cb.equal(root.get("store").get("id"), storeId);
    }

    // Filter by customer phone
    public static Specification<Transaction> hasCustomerPhone(String customerPhone) {
        return (root, query, cb) -> cb.equal(root.get("customerPhone"), customerPhone);
    }

    // Filter by transaction date range
    public static Specification<Transaction> hasTransactionDateBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return (root, query, cb) -> {
            if (startDate == null && endDate == null) return cb.conjunction();
            if (startDate != null && endDate != null) return cb.between(root.get("createdAt"), startDate, endDate);
            if (startDate != null) return cb.greaterThanOrEqualTo(root.get("createdAt"), startDate);
            return cb.lessThanOrEqualTo(root.get("createdAt"), endDate);
        };
    }
}
