package hust.soict.globalict.aims.media;

import java.util.Comparator;

public abstract class Media {

	private int id;
	private String title;
	private String category;
	private float cost;
	private static int nbMedia;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	public Media() {
		// TODO Auto-generated constructor stub
	}

	
	public Media(String title, String category, float cost) {
		this.id = ++nbMedia;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	
	public String getCategory() {
		return category;
	}
	
	public float getCost() {
		return cost;
	}
	

	public boolean equals(Object o) {
		if (o instanceof Media) {
			Media O = (Media)o;
			return this.title.equals(O.getTitle());
		}
		return false;		
	}
	
	public String toString() {
		String s = "Book - " + this.getTitle() + " - " + this.getCategory() + ": " + this.getCost() + " $";
	    return s;
	}
	public boolean filterProperty(String filter, String type) {
        if (filter == null || filter.isEmpty()) {
            return true;
        } else {
    		if (type == "title") {
    			if (this.getTitle().toLowerCase().indexOf(filter.toLowerCase()) != -1) {
    				return true;
    			}
    		} else if (type == "id") {
    			if(Integer.toString(this.getId()).toLowerCase().indexOf(filter.toLowerCase()) != -1) {
    				return true;
    			}
    		}
        }
        return false;
	}
}