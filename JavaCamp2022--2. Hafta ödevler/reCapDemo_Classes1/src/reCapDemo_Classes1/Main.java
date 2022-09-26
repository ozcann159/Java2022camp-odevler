package reCapDemo_Classes1;

public class Main {

	public static void main(String[] args) {

		Transactions transactions = new Transactions();
		/*
		 * System.out.println(transactions.toplamaIslemi(5, 6));
		 * System.out.println(transactions.cıkarmaIslemi(5, 6));
		 * System.out.println(transactions.carpmaIslemi(5, 6));
		 * System.out.println(transactions.bolmeIslemi(5, 6));
		 */

		// Yukarıdaki işlemle aynı görevi yapar

		double toplamSonuc = transactions.toplamaIslemi(5, 6);
		double cıkarmaSonuc = transactions.cıkarmaIslemi(5, 6);
		double carpmaSonuc = transactions.carpmaIslemi(5, 6);
		double bolmeSonuc = transactions.bolmeIslemi(5, 6);

		System.out.println(toplamSonuc);
		System.out.println(cıkarmaSonuc);
		System.out.println(carpmaSonuc);
		System.out.println(bolmeSonuc);

	}

}
