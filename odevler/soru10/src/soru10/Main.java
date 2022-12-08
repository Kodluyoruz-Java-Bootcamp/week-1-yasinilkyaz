package soru10;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Cem", 26);
		Customer customer2 = new Customer("Cem", 27);
		Customer customer3 = new Customer("Cenk", 27);
		List<Customer> customers = new ArrayList<>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);

		System.out.println("Toplam müşteri sayısı: " + customers.size());

		Product product1 = new Product("Pc1", "Elektorik", 1600, 10);
		Product product2 = new Product("Pc2", "Elektorik", 2000, 5);
		Product product3 = new Product("Halı", "dekorasyon", 1000, 50);

		List<Product> order1 = new ArrayList<>();
		order1.add(product1);
		order1.add(product2);

		Order order = new Order(customer1, order1);
		List<Invoice> invoices = new ArrayList<>();
		Invoice invoice = new Invoice(order);
		invoices.add(invoice);

		int totalProductCount = 0;
		for(Invoice invoice2 : invoices){
		    if(invoice2.getCustomer().getName() == "Cem"){
		        totalProductCount += invoice2.getProduct().size();
		    }
		}
		System.out.println(totalProductCount);
		
		double totalProductPrice = 0;
		for(Invoice invoice3 : invoices){
		    if(invoice3.getCustomer().getName() == "Cem"&&(invoice3.getCustomer().getAge()<30&&invoice3.getCustomer().getAge()>25)){
		    	totalProductPrice += invoice3.getProduct().stream().mapToDouble(o -> o.getPrice()).sum();
		    }
		}
		System.out.println(totalProductPrice);
		
		for(Invoice invoice4 : invoices){
		    if(invoice4.getTotalPrice()>1500){
		    	System.out.println(invoice4.toString()); 
		    	
		    }
		}
		
	}

	
}
