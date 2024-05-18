
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
			System.out.println("The media's already in the store");
			return;
		}
		itemsInStore.add(disc);
		System.out.println("The media's successfully added");
	}
	
	public void removeMedia(Media disc) {
		if (itemsInStore.contains(disc)) {
			itemsInStore.remove(disc);
			System.out.println("The media's successfully removed");
			return;
		}
		System.out.println("The media is not found in the store");
	}
	
	public void print() {
		System.out.println("**********************STORE**********************");
		System.out.println("Items In Store:");
		for (Media t: itemsInStore) {
			System.out.println(t);
		}
		System.out.println("*************************************************");
	}
}