package com.ramananubhaw.kirana_store.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramananubhaw.kirana_store.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, UUID> {
    List<Store> findByOwnerId(UUID ownerId);
    boolean existsByPhoneNo(String phoneNo);
}
