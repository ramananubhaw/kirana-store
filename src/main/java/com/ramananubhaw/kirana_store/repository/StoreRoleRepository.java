package com.ramananubhaw.kirana_store.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramananubhaw.kirana_store.entity.StoreRole;

@Repository
public interface StoreRoleRepository extends JpaRepository<StoreRole, UUID> {
    List<StoreRole> findByStoreId(UUID storeId);
    Optional<StoreRole> findByStoreIdAndUserId(UUID storeId, UUID userId);
}
