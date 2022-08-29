package com.mindtree.shoppingcart.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.shoppingcart.entity.Cart;
import com.mindtree.shoppingcart.entity.Product;
import com.mindtree.shoppingcart.entity.Quantity;

public interface QuantityRepository extends JpaRepository<Quantity, Integer>{
	
	Optional<List<Quantity>> findByCart(Cart cart);
	Optional<Quantity> findByProduct(Product product);

}
