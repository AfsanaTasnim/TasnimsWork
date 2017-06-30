package thirdchapter;
/*
 * This is a test application named InvoiceTest.
 * It demonstrates class Invoice's capabilities.
 */



public class InvoiceTest {

	public static void main(String[] args) {
		Invoice i = new Invoice("2", "Milk Can", 4, 280);
		
		System.out.println(i.InvoiceAmount());
		
		

	}

}
