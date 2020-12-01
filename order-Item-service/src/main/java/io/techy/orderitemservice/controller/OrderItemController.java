package io.techy.orderitemservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import io.techy.orderitemservice.models.OrderItem;
import io.techy.orderitemservice.models.UserOrder;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WebClient.Builder webClientBuilder;

	@RequestMapping("/{orderId}")
	public List<OrderItem> getOrderItem(String userId) {

		// get all rated movieId.
		UserOrder order = restTemplate.getForObject("http://product-service/productdata/users/" + userId,
				UserOrder.class);

//		return order.getUserItem().stream().map(rating -> {
//			// for each order id, call order service and get product
//			Order orderProduct = restTemplate.getForObject("http://order-Item-service/orderId/" + rating,
//					Order.class);
//			// Put them all together 
//			return new OrderItem(order.getUserItem(), "Order product", rating.getProductName()));
//		}).collect(Collectors.toList());

		return nullO;
	}

}

/*
Movie movie = webClientBuilder.build()
	.get()
	.uri("http://localhost:9002/movies/" + rating.getMovieId())
	.retrieve()
	.bodyToMono(Movie.class)
	.block();
*/