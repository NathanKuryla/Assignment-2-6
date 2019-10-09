package com.fileWriter;

public class ConsoleWriter {
	//Look at Lab 4 Library stuff to see how they formatted stuff.
	public void static main() {
	
		FlatFileReader reader = new FlatFileReader;
		
		/** Load Arrays for Processing */
		personArray = reader.getPersonArray(file location);
		customerArray = reader.getCustomerArray(file location);
		productArray = reader.getProductArray(file location);
		invoiceArray = reader.getInvoiceArray(file location);
		
		
		/** Writer for Summary */
		System.out.println("Invoice\tCustomer\t\tRealtor\t\tSubtotal\tFees\tTaxes\tDiscount\tTotal");
		for(invoiceArray: i) {
			customer = i.getCustomer();		//Assign variables to reduce code
			realtor = i.getRealtor();
			code = i.getInvoiceCode();
			if(customer.getType().equals("L")) {
				String type = "LowIncome"
			}
			else {
				String type = "General"
			}
			
			System.out.println(code + "\t" + customer.getName().getLast()+", "+customer.getName().getFirst()+" ["+type+"]\t" +
			realtor.getName().getLast()+", "+realtor.getName().getFirst()+"\t" + subTotal + "\t" + Fees + "\t" + Taxes + "\t" + Discount + "\t" + Total);
		}
		System.out.println("==========================================================================================================================");
		System.out.println("TOTALS\t\t\t\t\t\t\t\t")
		
		
		/** Print Empty Lines & Header */
		for(int i = 0, i < 4, i++) {	//Defines number of empty lines
			System.out.println("");
		}
		System.out.println("Individual Invoice Detail Reports");
		System.out.println("==========================================================================================================================");
		
		
		/** Writer for Individual Invoices */
	
	
	
}
