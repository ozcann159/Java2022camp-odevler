package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
	}
	//camel Caseing
	public static void sayiBulmaca() {
		
		int[] sayilar = new int[]{1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi=false;
		
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi= true;
				break;
			}		
		}
		
		if(varMi) {
			mesajVer("Değer mevcut: "+aranacak);
		}else {
			mesajVer("Değer mevcut değildir: "+aranacak);
		}

	}
	
	public static void mesajVer(String mesaj) {//parametreli metot denir.
		
		System.out.println(mesaj);
	}

}
