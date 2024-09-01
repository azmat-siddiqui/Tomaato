package com.azmat.onlinefoodordering.repository;

import com.azmat.onlinefoodordering.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
