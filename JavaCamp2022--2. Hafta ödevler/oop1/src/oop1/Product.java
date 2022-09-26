package oop1;

//PascalCase standartında isimlendirilir. Her şeyin baş harfi büyük.
public class Product {
	private String name;
	// camelCase şeklinde yazılır.
	private double unitPrice;// birim fiyatı
	private double discount;// indirim oranı
	private String imageUrl;
	private int unitsInStock;// Stok miktarı

	public String getName() {// get okumak
		return name;
	}

	public void setName(String name) {//set yazmak
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
