package hust.soict.globalict.aims.cart;
import hust.soict.globalict.aims.exception.LimitExceededException;
import hust.soict.globalict.aims.media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 2;
	private ObservableList<Media> itemsOrdered = 
			FXCollections.observableArrayList();
	
	public  ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered( ObservableList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	
	public int addMedia(Media media) throws LimitExceededException {
		if (itemsOrdered.size() <  MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(media);
			System.out.println("The media has been added to the cart");
			return 1;
		} else {
			throw new LimitExceededException("ERROR: The cart is almost full"); 
		}
	}
	public int addMedia(Media media1, Media media2) throws LimitExceededException {
		int countAdded = 0;
		try {
			countAdded += addMedia(media1);
			countAdded += addMedia(media2);
		} catch (LimitExceededException e) {
			throw e;
		}
		
		return countAdded;		
	}
	public int addMedia(ArrayList<Media> medias) throws LimitExceededException {
		int countAdded = 0;
		for (int i=0; i<medias.size(); i++) {
			try {
				countAdded += addMedia(medias.get(i));
			} catch (LimitExceededException e) {
				throw e;
			}
		}
		return countAdded;
	}
	
	public int removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("The media has been removed from the cart");
			return 1;
		}
		System.out.println("The media is not in the cart");
		return 0;
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
			System.out.printf("%d. %s\n", ++i, d);
		}
		System.out.printf("\nTotal cost: %.2f\n***************************************************",
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
	public Media getALuckyItem() {
		if (itemsOrdered.size() >= 5) {
			int index = (int)(Math.random() * itemsOrdered.size());
			Media luckyItem = itemsOrdered.get(index);
			System.out.println("The lucky item: " + luckyItem);
			
			removeMedia(luckyItem);
			System.out.println("The bill of this order is now " + totalCost());
			
			return luckyItem;
		}
		return null;
	}
}