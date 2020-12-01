package io.techy.productservice.models;

public class Product {

	private int id;
	private String productName;
	private int supplyId;
	private float unitPrice;
	private String packaging;
	private boolean isDiscontinued;
	private int initialStock;
	
	public Product(int id, String productName, int supplyId, float unitPrice, String packaging, boolean isDiscontinued,
			int initialStock) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplyId = supplyId;
		this.unitPrice = unitPrice;
		this.packaging = packaging;
		this.isDiscontinued = isDiscontinued;
		this.initialStock = initialStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getSupplyId() {
		return supplyId;
	}
	public void setSupplyId(int supplyId) {
		this.supplyId = supplyId;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getPackaging() {
		return packaging;
	}
	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}
	public boolean isDiscontinued() {
		return isDiscontinued;
	}
	public void setDiscontinued(boolean isDiscontinued) {
		this.isDiscontinued = isDiscontinued;
	}
	public int getInitialStock() {
		return initialStock;
	}
	public void setInitialStock(int initialStock) {
		this.initialStock = initialStock;
	}
	
	
	
	
}
