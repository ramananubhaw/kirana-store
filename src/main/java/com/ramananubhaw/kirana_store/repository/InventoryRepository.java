package com.ramananubhaw.kirana_store.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramananubhaw.kirana_store.entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, UUID> {
    Optional<Inventory> findByStoreIdAndProductId(UUID storeId, UUID productId);
}
