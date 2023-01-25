/*
Name: Kennedy Keyes
Date: September 17, 2021
Program: Invoice.class
Description: This class has a constructor that initializes four instance 
variables and represents an item(s) sold at a store.
 */
package invoicetest;

/**
 *
 * @author codingken
 */
public class Invoice 
{
    // Declare instance variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    // Create the constructor
    public Invoice(String partNumber, String partDescription, int quantity,
            double pricePerItem)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        
        // Determine if the quantity is positive
        if (quantity > 0)
        {
            this.quantity = quantity;
        }
        
        // Determine if the pricePerItem is positive
        if(pricePerItem > 0.0)
        {
            this.pricePerItem = pricePerItem;
        } 
    } // end constructor
    
    // Set part number
    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }
    
    // Get part number
    public String getPartNumber()
    {
        return partNumber;
    }
    
    // Set part description
    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }
    
    // Get part description
    public String getPartDescription()
    {
        return partDescription;
    }
    
    // Set quantity 
    public void setQuantity(int quantity)
    {
        if (quantity > 0) // quantity is positive
        {
            this.quantity = quantity;
        }
        
        if (quantity <= 0) // quantity is 0 or negative
        {
            this.quantity = 0;
        }
    }
    
    // Get quantity
    public int getQuantity()
    {
        return quantity;
    }
    
    // Set price per item
    public void setPricePerItem(double pricePerItem)
    {
        // Determine if its positive
        if (pricePerItem > 0.0)
        {
            this.pricePerItem = pricePerItem;
        }
        
        // Determine if it's 0 or negative
        if (pricePerItem <= 0.0)
        {
            this.pricePerItem = 0.0;
        }
    }
    
    // Get price per item
    public double getPricePerItem()
    {
        return pricePerItem;
    }
    
    // Calculate and return invoice amount
    public double getInvoiceAmount()
    {
        return getQuantity() * getPricePerItem();
    }
}
