package com.microservices.inventory_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Integer, Long> {
    static boolean existsBySkuCodeAndQuantityIsGreaterThanEquals(String skuCode, Integer quantity) {
        return false;
    }
}