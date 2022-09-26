package classesWithAttributes1;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1 , "Laptop", "Asus Laptop", 3000, 3, "Siyah");
		
		//yukarıdaki yapı parametreli constructor ile kullanır.
		//aşagıdaki yapı parametresiz constructor ile kullanılır.
		
		/*Product product = new Product();
		product.setName("Laptop");
		product.setId(1); 
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setRenk("Beyaz");*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

		//Bu kısım hata verir her bir kısma yeniOzelliği eklemek gerekir.
		//Bu doğru bir kullanım değildir.
		//Yukarıdaki kullanım doğrudur.
		/*productManager.Add2(1, null, null, 2, 200);
		productManager.Add2(1, null, null, 2, 200);
		productManager.Add2(1, null, null, 2, 200);
		productManager.Add2(1, null, null, 2, 200);
		productManager.Add2(1, null, null, 2, 200);*/
	}

}