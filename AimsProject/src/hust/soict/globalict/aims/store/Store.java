package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int itemCount;

    public Store(int maxSize) {
        this.itemsInStore = new DigitalVideoDisc[maxSize];
        this.itemCount = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (itemCount < itemsInStore.length) {
            itemsInStore[itemCount++] = dvd;
            System.out.println("DVD has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    public void removeDVD(int index) {
        if (index >= 0 && index < itemCount) {
            for (int i = index; i < itemCount - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[itemCount - 1] = null;
            itemCount--;
            System.out.println("DVD has been removed from the store.");
        } else {
            System.out.println("DVD is not found.");
        }
    }

    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }

    public int getItemCount() {
        return itemCount;
    }
}