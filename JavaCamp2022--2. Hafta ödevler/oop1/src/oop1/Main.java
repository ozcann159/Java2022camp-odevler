package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oraı";

		Product product1 = new Product();// class böyle tanımlanır.
		                // set value
		product1.setName("Delonghi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("imagei.jpg");

		                     // get
		// System.out.println(product1.name);

		Product product2 = new Product();// class böyle tanımlanır.
		product2.setName("Sneg kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("imagei2.jpg");


		Product product3 = new Product();// class böyle tanımlanır.
		product3.setName("Kitchen Aid kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("imagei3.jpg");

		System.out.println("<ul>");
		Product[] products = { product1, product2, product3 };
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0545222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Okan");
		individualCustomer.setLastName("Avcı");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0542122224");
		corporateCustomer.setCustomerNumber("456789");
		corporateCustomer.setCompanyName("Prestij");
		corporateCustomer.setTaxNumber("01234567890");
		
		
		Customer[] customers = {corporateCustomer,individualCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber());
		}
		
	}

}
