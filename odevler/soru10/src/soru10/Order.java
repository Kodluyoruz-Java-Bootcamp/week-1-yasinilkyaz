package soru10;

import java.util.List;

public class Order {
private Customer customer;
private List<Product> products;

public Order(Customer customer, List<Product> products) {
	super();
	this.customer = customer;
	this.products = products;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Order [customer=" + customer + ", products=" + products + "]";
}


}
