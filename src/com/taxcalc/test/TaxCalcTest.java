package com.taxcalc.test;

import com.taxcalc.app.ReceiptGenerator;
import com.taxcalc.receipt.Receipt;

class TaxCalcTest {  
    public static void main(String[] args) {
    	
    	ReceiptGenerator recipeGen = new ReceiptGenerator();
    	
    	String[] items = {"1 book at 12.49", "1 music CD at 14.99",
        "1 chocolate bar at 0.85"};
	
    	String[] importItems = {"1 imported box of chocolates at 10.00",
        "1 imported bottle of perfume at 47.50"};
    	
    	Receipt itemsReceipt = recipeGen.generateReceipt(items);
    	Receipt importReceipt = recipeGen.generateReceipt(importItems);
    	System.out.println("Input 1:");
    	for(String item :items)
    		System.out.println(item);
    	System.out.println("Input 2:");
    	for(String importItem :importItems)
    		System.out.println(importItem);
    	System.out.println("\n");
    	System.out.println(itemsReceipt);
    	System.out.println(importReceipt);
    }
}
