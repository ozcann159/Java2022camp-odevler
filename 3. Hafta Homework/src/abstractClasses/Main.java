package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		//womanGameCalculator.Hesapla();
		//womanGameCalculator.gameOver();
		
		GameCalculator womangameCalculators = new WomanGameCalculator();
		womangameCalculators.Hesapla();
		womanGameCalculator.gameOver();
		
		System.out.println("-----------------------");
		
		GameCalculator mangameCalculators = new ManGameCalculator();
		mangameCalculators.Hesapla();
		mangameCalculators.gameOver();
		
		System.out.println("-----------------------");
		
		GameCalculator kidsgameCalculators = new KidsGameCalculator();
		kidsgameCalculators.Hesapla();
		kidsgameCalculators.gameOver();
		

	}

}
