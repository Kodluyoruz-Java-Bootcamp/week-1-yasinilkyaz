package soru10;

import java.util.List;

public class Invoice {

	private Order order;
	private double totalPrice;
	
	public Invoice(Order order) {
		super();
		this.order = order;
		this.totalPrice=order.getProducts().stream().mapToDouble(o -> o.getPrice()).sum();
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Customer getCustomer() {
		
		return this.order.getCustomer();
	}

	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return this.order.getProducts();
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Invoice [order=" + order + ", totalPrice=" + totalPrice + "]";
	}

	
	
	
}
