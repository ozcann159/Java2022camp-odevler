package abstractClasses;

public abstract class GameCalculator {
	public abstract void Hesapla();

	
	public final void gameOver() {
		System.out.println("Oyun Bitti. ");
	}

}
