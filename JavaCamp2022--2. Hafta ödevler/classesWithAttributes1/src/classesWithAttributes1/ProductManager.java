package classesWithAttributes1;

public class ProductManager {
	public void Add(Product product) {
		//JDBC kodları yazarak veritabanına gönderebileceğiz. İleri ki zamanlarda
		
		System.out.println("Ürün eklendi " + product.getName());
	}
	
	//Bu şekilde kullanım doğru ve mnatıklı değildir.
	//public void Add2(int id, String name, String desctription, int stockAmount, double price, String yeniOzellik) {}
}
