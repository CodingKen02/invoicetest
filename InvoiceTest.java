/*
Name: Kennedy Keyes
Date: September 17, 2021
Program: InvoiceTest.java
Description: This program is a test app that demonstrates class Invoice's 
capabilities.
 */
package invoicetest;

/**
 *
 * @author codingken
 */
public class InvoiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create new invoice objects for Invoice1 and Invoice 2
        Invoice invoice1 = new Invoice("2238", "Hammer", 3, 14.95);
        Invoice invoice2 = new Invoice("5678", "Paint Brush", -5, -9.99);
        
        // Display current invoice 1
        System.out.println("Original Invoice Information: ");
        System.out.printf("Part number: %s%n", invoice1.getPartNumber());
        System.out.printf("Description: %s%n", invoice1.getPartDescription());
        System.out.printf("Quantity: %d%n", invoice1.getQuantity());
        System.out.printf("Price: %.2f%n", invoice1.getPricePerItem());
        
        // Display current invoice 2
        System.out.printf("Part number: %s%n", invoice2.getPartNumber());
        System.out.printf("Description: %s%n", invoice2.getPartDescription());
        System.out.printf("Quantity: %d%n", invoice2.getQuantity());
        System.out.printf("Price: %.2f%n", invoice2.getPricePerItem());
        System.out.printf("Invoice Amount: %.2f%n", invoice1.getInvoiceAmount() 
                + invoice2.getInvoiceAmount() );        
        
        // Change data for invoice 1
        invoice1.setPartNumber("002238");
        invoice1.setPartDescription("Yellow Hammer");
        invoice1.setQuantity(5);
        invoice1.setPricePerItem(19.99);
        
        // Change data for invoice 2
        invoice2.setPartNumber("005678");
        invoice2.setPartDescription("Wall Paint Brush");
        invoice2.setQuantity(4);
        invoice2.setPricePerItem(3.00);
        
        
        // Display invoice with new data
        System.out.printf(" %nUpdated Invoice Information: %n");
        System.out.printf("Part number: %s%n", invoice1.getPartNumber());
        System.out.printf("Description: %s%n", invoice1.getPartDescription());
        System.out.printf("Quantity: %d%n", invoice1.getQuantity());
        System.out.printf("Price: %.2f%n", invoice1.getPricePerItem());
        System.out.printf("Part number: %s%n", invoice2.getPartNumber());
        System.out.printf("Description: %s%n", invoice2.getPartDescription());
        System.out.printf("Quantity: %d%n", invoice2.getQuantity());
        System.out.printf("Price: %.2f%n", invoice2.getPricePerItem());
        System.out.printf("Invoice Amount: %.2f%n", invoice1.getInvoiceAmount() 
                + invoice2.getInvoiceAmount() );
    }
    
}
