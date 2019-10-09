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
		
		double revenue = 0.00;
		double Taxes = 0.00;
		double Fees = 0.00;
		double Subtotals = 0.00;
		double Discounts = 0.00;
		System.out.println("Invoice\tCustomer\t\tRealtor\t\tSubtotals\tFees\tTaxes\tDiscount\tTotal");
		for(invoiceArray: i) {
			customer = i.getCustomer();		//Assign variables to reduce code
			realtor = i.getRealtor();
			code = i.getInvoiceCode();
			fee = i.customer.getFee();
			discount = 0 - i.customer.getDiscount();
			
			double subTotal = 0.00;			//Calculate tax and subtotal totals
			double tax = 0.00;
			products = i.getProductList();
			for(products: j) {				//Loop to sum up product aspects
				subTotal += customer.getSubTotal();
				tax += customer.getTax();
			}
			
			if(customer.getType().equals("L")) {	//Determine the string to use to define the customers' types
				String type = "LowIncome";
			}
			else {
				String type = "General";
			}
			
			double total = (subTotal + fee + tax) - discount;
			
			System.out.println(code + "\t" + customer.getName().getLast()+", "+customer.getName().getFirst()+" ["+type+"]\t" +
			realtor.getName().getLast()+", "+realtor.getName().getFirst()+"\t" + subTotal + "\t" + fee + "\t" + tax + "\t" + discount + "\t" + total);
			
			revenue += total;
			Taxes += tax;
			Subtotals += subTotal;
			Discounts += discount;
			Fees += fee;
		}
		
		System.out.println("==========================================================================================================================");
		System.out.println("TOTALS\t\t\t\t\t\t" + Subtotals + "\t" + Fees + "\t" + Taxes + "\t" + Discounts + "\t" + revenue);
		
		
		
		/** Print Empty Lines & Header */
		for(int i = 0, i < 4, i++) {	//Defines number of empty lines
			System.out.println("");
		}
		System.out.println("Individual Invoice Detail Reports");
		System.out.println("==========================================================================================================================");
		
		
		/** Writer for Individual Invoices */
	
		for(customerArray: k) {
			
			
		}
}
