package Aims;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED=20;
    private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    public Cart() {
    	qtyOrdered=0;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    if(qtyOrdered < MAX_NUMBERS_ORDERED) {
    	itemsOrdered[qtyOrdered] = disc;
    	qtyOrdered++;
    	System.out.println("This disc has been added"); 
    }
    else {
       System.out.println("The cart is almost full");
    }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        int total = qtyOrdered + dvdList.length;
        if (total > MAX_NUMBERS_ORDERED) {
            System.out.println(" The cart doesn't have enough space to add these discs");
            return;
        }
        else {
        for (DigitalVideoDisc dvd : dvdList) {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("The disc has been added.");
            }
        System.out.println(" Discs have been added.");
        }
    }
    
    /* public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
    int total = qtyOrdered + dvds.length;
    if (total > MAX_NUMBERS_ORDERED) {
        System.out.println("The cart doesn't have enough space to add these discs");
        return;
    } else {
        for (DigitalVideoDisc dvd : dvds) {
            itemsOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
        }
        System.out.println("Discs have been added.");
    }
}
 */
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	if(qtyOrdered +2 <= MAX_NUMBERS_ORDERED) {
        	itemsOrdered[qtyOrdered] = dvd1;
        	itemsOrdered[qtyOrdered+1] = dvd2;
        	qtyOrdered +=2;
        	System.out.println("These discs have been added"); 
        }
        else {
            System.out.println(" The cart doesn't have enough space to add these discs");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    	 int found = 0;
         for (int i = 0; i < qtyOrdered; i++) {
             if (itemsOrdered[i].equals(disc)) {
                 found = 1;
                 for (int j = i; j < qtyOrdered - 1; j++) {
                	 itemsOrdered[j] = itemsOrdered[j + 1];
                 }
                 qtyOrdered--;
                 System.out.println("The disc has been removed.");
                 break;
             }
         }
         if (found==0) {
             System.out.println("The disc is not in the cart.");
         }
     }
        
    
    public float totalCost(){
    	float m=0;
    	for(int  i=0; i< qtyOrdered; i++ ) {
    		m +=  itemsOrdered[i].getCost();
    	}
    	return m;
    }
    
    public void displayCartItems() {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }

        System.out.println("Cart items:");
        for (int i = 0; i < qtyOrdered; i++) {
        	System.out.printf("%-2d %-20s %.2f%n", (i + 1), itemsOrdered[i].getTitle(), itemsOrdered[i].getCost()); 
        }
    }

   
}
    

