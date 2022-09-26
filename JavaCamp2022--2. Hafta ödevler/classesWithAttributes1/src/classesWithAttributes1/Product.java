package classesWithAttributes1;

public class Product {
	public Product(int id, String name, String desctription, double price, int stockAmount, String renk) {// Parametreli
		// constructor
		System.out.println("Yapıcı blok çalıştı.");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = desctription;
		this.stockAmount = stockAmount;
	}

	public Product() {// parametresiz constructor
// Bu şekilde yazarak aşağıdaki yazılı kodları kullanıp yukarıdakiyle aynı
// işlemi yapabiliriz.
	}

// attribute veya field deniyor.
	private int id;
	private String name;
	private String description;// açıklama
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
// This içerisinde bulunduğu class demek.
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
// Kod görünümü söyle olacak name'in ilk harfi + id numarası
		return this.name.substring(0, 1) + id;
	}
}
