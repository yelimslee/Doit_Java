package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원이고, " + customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10011, "KIM", 100);
		price = customerKim.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원이고, " +customerKim.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
	}

}
