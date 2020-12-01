package io.techy.orderitemservice.models;

import java.util.List;

import org.apache.commons.math.stat.descriptive.summary.Product;

public class UserOrder {
	
	private int id;

	private List<Product> userItem;

	public UserOrder() {
	}

	public List<Product> getUserItem() {
		return userItem;
	}

	public void setUserItem(List<Product> userItem) {
		this.userItem = userItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
