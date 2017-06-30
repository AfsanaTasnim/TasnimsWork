package thirdchapter;

public class Invoice {
	String partNumber;        //This is an instance variable.
	String partDescription;   //This is an instance variable.
	int quantityOfItem;       //This is an instance variable.
	int pricePerItem;         //This is an instance variable.
	
	public Invoice(String pNum, String pDes, int quantity, int pricePer) {    //This is a constructor
		partNumber = pNum;                     //The constructor initializes the four instance variable.
		partDescription = pDes;                    
		quantityOfItem = quantity;
		pricePerItem = pricePer;
	}
	
	public String getPartNumber() {               //This is a get method for the instance variable partNumber.
		return partNumber;
	}
	
	public void setPartNumber(String pNum) {	  //This is a set method for the instance variable partNumber.
		partNumber = pNum;
	}
	
	public String getPartDescription() {		  //This is a get method for the instance variable partDescription.
		return partDescription;
	}
	
	public void setPartDescription(String pDes) { //This is a set method for the instance variable partNumber.
		partDescription = pDes;
	}
	
	public int getQuantityOfItem() {              //This is a get method for the instance variable quantityOfItem.
		return quantityOfItem;
	}
	
	public void setQuantityOfItem(int quantity) { //This is a set method for the instance variable quantityOfItem.
		quantityOfItem = quantity;
	}
	
	public int getPricePerItem() {               //This is a get method for the instance variable pricePerItem.
		return pricePerItem;
	}
	
	public void setPricePerItem(int pricePer) {  //This is a set method for the instance variable pricePerItem.
		pricePerItem = pricePer;
	}
	
	
	public double InvoiceAmount() {           //This is a method named InvoiceAmount. This method calculates the invoice amount.
		double total;						 //i.e. multiplies the quantity by price per item. Then, it returns the value as a double value.
		if(quantityOfItem < 0) {    		//If the quantity is not positive, it is set to 0. 
			quantityOfItem = 0;					 
		}
		if(pricePerItem < 0) {				//If the price per item item is not positive, it is set to 0.
			pricePerItem = 0;
		}
		total = quantityOfItem * pricePerItem;
		
		return total;
	}
}
