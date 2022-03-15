
 class InvoiceBilling {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	public InvoiceBilling(String pNum, String pDesc, int qty, double prc) {
		if(pNum !=null) partNumber=pNum; else partNumber="0";
		if(pDesc !=null) partDescription=pDesc; else partDescription="0";
		if(qty>0) quantity = qty; else quantity=0;
		if(prc>0.0) price=prc; else price=0;
	}
	public String getPartnum() {
		return partNumber;
	}
	public String getPartDesc() {
		return partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	
	public void setPartNum(String pNum) {
		if(pNum!=null) {partNumber=pNum;}
		else {partNumber="0";}
	}
	public void setPartDesc(String pDesc) {
		if (pDesc !=null) {partDescription=pDesc;}
		else {partDescription="0";}
	}
	public void setQuantity(int qty) {
		if(qty>0) {quantity=qty;}
		else {quantity=0;}
	}
	public void setPrice(double prc) {
		if(prc>0.0 ) {price=prc;}
		else {price=0.0;}
	}
	public double getInvoiveAmount() {
		return (double)quantity*price;
	}

}

class Invoice extends InvoiceBilling{

	public Invoice(String pNum, String pDesc, int qty, double prc) {
		super(pNum, pDesc, qty, prc);
	}
	public static void main(String[]args) {
		Invoice invoice1= new Invoice("2022D0007","Java assignment CSS", 19, 500.00);
		
		System.out.printf("Invoice 1 : %s\t%s\t%d\t$%.2f\n",invoice1.getPartnum(),invoice1.getPartDesc(),invoice1.getQuantity(),invoice1.getPrice());
	}
}


