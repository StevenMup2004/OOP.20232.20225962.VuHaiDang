package hust.soict.globalict.aims.Aims;

import hust.soict.globalict.aims.cart.Cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
   	 
   	Cart anOrder = new Cart();

       DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
       anOrder.addDigitalVideoDisc(dvd1);

   	DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
   	anOrder.addDigitalVideoDisc(dvd2);

   	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f); 
   	anOrder.addDigitalVideoDisc(dvd3);

   	anOrder.displayCartItems();
   	
		System.out.printf("   Total Cost:          %.2f%n", anOrder.totalCost());
   	
   
   	
    
    }
}