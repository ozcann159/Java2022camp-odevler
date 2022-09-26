package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {

		ArithmeticTransactions artihmeticTransactions = new ArithmeticTransactions();
		artihmeticTransactions.setToplama(5, 6);
		artihmeticTransactions.setCıkarma(5, 6);
		artihmeticTransactions.setCarpma(5, 6);
		artihmeticTransactions.setBolme(5, 6);

		System.out.println(artihmeticTransactions.getToplama());
		System.out.println(artihmeticTransactions.getCıkarma());
		System.out.println(artihmeticTransactions.getCarpma());
		System.out.println(artihmeticTransactions.getBolme());

	}

}
