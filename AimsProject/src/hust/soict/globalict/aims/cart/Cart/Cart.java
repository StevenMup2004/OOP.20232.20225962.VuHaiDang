package hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;
import java.util.ArrayList;

public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	public void addMedia(Media disc) {
		if (itemsOrdered.contains(disc)) {
			System.out.println("The disc's already there");
			return;
		}
		itemsOrdered.add(disc);
		System.out.println("Successfully added");
	}
	
	public void addMedia(Media[] dvdList) {
		for (Media d: dvdList) {
			if (!itemsOrdered.contains(d)) {
				itemsOrdered.add(d);				
			}
		}
		System.out.println("Successfully added");
	}
	
	public void addMedia(Media dvd1, Media dvd2) {
		addMedia(dvd1);
		addMedia(dvd2);
	}
	
	public void removeMedia(Media disc) {
		if (itemsOrdered.contains(disc)) {
			itemsOrdered.remove(disc);			
			System.out.println("Successfully removed");
			return;
		}
		System.out.println("Disc not found.");
	}
	
	public double totalCost() {
		double ret = 0;
		for (Media d: itemsOrdered) {
			ret += d.getCost();
		}
		return ret;
	}
	
	public void print() {
		System.out.println("***********************CART***********************\n" + "Ordered Items:");
		int i = 0;
		for (Media d: itemsOrdered) {
			System.out.printf("%d. %s", ++i, d);
		}
		System.out.printf("\nTotal cost: %.2f\n***************************************************\n",
										 this.totalCost());
	}
	
	public boolean search(int ID) {
		for (Media d: itemsOrdered) {
			if (d == null) {break;}
			if (d.getId() ==  ID) {
				System.out.println(d);
				return true;
			}
		}
		System.out.println("No match is found.");
		return false;		
	}
	
	public boolean search(String title) {
		for (Media d: itemsOrdered) {
			if (d == null) {break;}
			if (d.getTitle() ==  title) {
				System.out.println(d);
				return true;
			}
		}
		System.out.println("No match is found.");
		return false;
	}
}