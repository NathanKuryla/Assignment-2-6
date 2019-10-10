package com.fileWriter;

public class ConsoleWriter {

	public void printInvoice() {
	
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
			realtor.getName().getLast()+", "+realtor.getName().getFirst()+"\t$" + subTotal + "\t$" + fee + "\t$" + tax + "\t$" + discount + "\t$" + total);
			
			revenue += total;
			Taxes += tax;
			Subtotals += subTotal;
			Discounts += discount;
			Fees += fee;
		}
		
		System.out.println("==========================================================================================================================");
		System.out.println("TOTALS\t\t\t\t\t\t$" + Subtotals + "\t$" + Fees + "\t$" + Taxes + "\t$" + Discounts + "\t$" + revenue);
		
		
		
		/** Print Empty Lines & Header */
		for(int i = 0, i < 4, i++) {	//Defines number of empty lines
			System.out.println("");
		}
		System.out.println("Individual Invoice Detail Reports");
		System.out.println("==========================================================================================================================");
		
		
		
		/** Writer for Individual Invoices */
	
		for(customerArray: k) {
			customer = i.getCustomer();		//Assign variables to reduce code
			realtor = i.getRealtor();
			invCode = i.getInvoiceCode();
			products = i.getProductList();
			
			System.out.println("Invoice " + invCode);
			System.out.println("==================================")
			System.out.println("Realtor: " + realtor.getName().getLast() + ", " + realtor.getName().getFirst())
			System.out.println("Customer Info:")
			
			if(customer.getType().equals("L")) {	//Determine the string to use to define the customers' types
				String type = "LowIncome";
			}
			else {
				String type = "General";
			}
			
			System.out.println("\t" + customer.getName() + "(" + customer.getCode() + ")");
			System.out.println("\t[" + type + "]");
			
			contact = customer.getContact();
			System.out.println("\t" + contact.getName().getLast() + ", " + contact.getName().getFirst());
			
			address = customer.getAddress();
			System.out.println("\t" + address.getStreet());
			System.out.println("\t" + address.getCity()+", "+address.getState()+" "+address.getZipCode()+" "+address.getCountry);
			System.out.println("-----------------------------------");
			
			System.out.println("Code\tItem\t\t\t\tSubtotal\tTax\tTotal");
			for(products: n) {
				item = reader.getProductFromCode();
				if(item.getType().equals("A")) {
					System.out.println(n.getCode()+"\t"+n.getName()+" (");
				}
				else if(item.getType().equals("P")) {
					
				}
				else if(item.getType().equals("S")) {
					
				}
				else 
			}
		}
}
