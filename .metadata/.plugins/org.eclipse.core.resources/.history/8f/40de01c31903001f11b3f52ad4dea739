
package  hust.soict.globalict.aims.store;
import java.util.ArrayList;
import hust.soict.globalict.aims.media.*;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}

	public void setItemsInStore(ArrayList<Media> itemsInStore) {
		this.itemsInStore = itemsInStore;
	}

	public void addMedia(Media disc) {
		if (itemsInStore.contains(disc)) {
			System.out.println("The disc's already there");
			return;
		}
		itemsInStore.add(disc);
		System.out.println("Successfully added");
	}
	
	public void removeMedia(Media disc) {
		if (itemsInStore.contains(disc)) {
			itemsInStore.remove(disc);
			System.out.println("Successfully removed");
			return;
		}
		System.out.println("Disc not found");
	}
	
	public void print() {
		System.out.println("**********************STORE**********************");
		System.out.println("Items In Store:");
		for (Media m: itemsInStore) {
			System.out.println(m);
		}
		System.out.println("*************************************************");
	}
}