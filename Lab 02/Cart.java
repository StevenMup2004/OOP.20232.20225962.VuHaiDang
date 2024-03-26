package Aims;
import java.util.*;
public class Cart {
    private List<DigitalVideoDisc> item;
    private int num;
    private final static int MAX_VALUE=20;
    
    public Cart() {
    	item= new ArrayList<>();
    	num =0;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    if(num < MAX_VALUE) {
    	item.add(disc);
    	num++;
    	 System.out.println("This disc has been added"); 
    }
    else {
       System.out.println("The cart is almost full");
    }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    	if(item.remove(disc)) System.out.println("Removed");
    	else System.out.println("The cart is empty");
    }
    
    public float totalCost(){
    	float m=0;
    	for(DigitalVideoDisc i: item) {
    		m +=  i.getCost();
    	}
    	return m;
    }
   
}
    

