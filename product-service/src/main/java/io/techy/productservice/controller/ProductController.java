package io.techy.productservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.techy.productservice.models.Product;

@RestController

@RequestMapping("/productdata")
public class ProductController {

	@RequestMapping("/{productId}")
	public Product getProduct(@PathVariable("productId") String productId) {
		return new Product(0, productId, 4, 0, productId, false, 0);
	}

//	@RequestMapping("/users/{userId}")
//	public UserRating getUserRating(@PathVariable("userId") String userId) {
//		List<Product> ratings = Arrays.asList(
//				new Product("1234", 4), 
//				new Product("5678", 3));
//		UserRating userRating = new UserRating();
//		userRating.setUserRating(ratings);
//		return userRating;
//	}

}
