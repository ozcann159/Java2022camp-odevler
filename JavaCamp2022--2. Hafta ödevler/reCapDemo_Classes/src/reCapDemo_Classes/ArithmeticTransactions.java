package reCapDemo_Classes;

public class ArithmeticTransactions {

	private double toplama;
	private double cıkarma;
	private double carpma;
	private double bolme;

	public double getToplama() {
		return toplama;
	}

	public void setToplama(double toplama, double sayi) {
		// toplama = toplama + sayi;
		// Yukarıdaki işlemle aynı görevi görüyor.
		this.toplama = toplama + sayi;
	}

	public double getCıkarma() {
		return cıkarma;
	}

	public void setCıkarma(double cıkarma, double sayi) {
		// cıkarma = cıkarma - sayi;
		// Yukarıdaki işlemle aynı görevi görüyor.
		this.cıkarma = cıkarma - sayi;
	}

	public double getCarpma() {
		return carpma;
	}

	public void setCarpma(double carpma, double sayi) {
		// carpma = carpma * sayi;
		// Yukarıdaki işlemle aynı görevi görüyor.
		this.carpma = carpma * sayi;
	}

	public double getBolme() {
		return bolme;
	}

	public void setBolme(double bolme, double sayi) {
		// bolme = bolme / sayi;
		// Yukarıdaki işlemle aynı görevi görüyor.
		this.bolme = bolme / sayi;
	}
}
