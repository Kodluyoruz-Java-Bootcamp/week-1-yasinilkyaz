package soru10;

public class Product {
private String name;
private String category;
private double price;
private int stockAmount;

public Product(String name, String category, double price, int stockAmount) {
	super();
	this.name = name;
	this.category = category;
	this.price = price;
	this.stockAmount = stockAmount;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getStockAmount() {
	return stockAmount;
}
public void setStockAmount(int stockAmount) {
	this.stockAmount = stockAmount;
}
@Override
public String toString() {
	return "Product [name=" + name + ", category=" + category + ", price=" + price + ", stockAmount=" + stockAmount
			+ "]";
}


}
