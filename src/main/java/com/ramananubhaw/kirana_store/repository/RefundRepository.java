package com.ramananubhaw.kirana_store.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramananubhaw.kirana_store.entity.Refund;

@Repository
public interface RefundRepository extends JpaRepository<Refund, UUID> {
    List<Refund> findByOriginalTransactionId(UUID originalTransactionId);
}
