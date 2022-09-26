package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();//customerManager = customerManager2 bu ifadeden dolayı buradaki new customer devre dışı.
		CustomerManager customerManager2 = new CustomerManager();

		//customermanagerde ki bilgiler customermanager2 deki bilgiye eşit olur. 
		//customermanagerdeki new devre dışı kalır.
		//customermanager, customarmanager2'nin adresini tutar.
		customerManager = customerManager2;

		// referans type
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);// 10

		// diziler referans tiptir.
		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);// 10

	}

}
