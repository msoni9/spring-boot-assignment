package io.techy.orderservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.techy.orderservice.models.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

	@RequestMapping("/{orderId}")
	public Order getOrder(@PathVariable("orderId") String orderId) {
		return new Order(3, "23/04/2019", 5, 786, 500);
	}

}
