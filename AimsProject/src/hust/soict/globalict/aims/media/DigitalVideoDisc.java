package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, 0, cost);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, null, 0, cost);
	}
	public DigitalVideoDisc(String title) {
		super(title, null, null, 0, 0.0f);
	}
	
	public boolean isMatch(String title) {
		String s = this.getTitle().toLowerCase();
		boolean result = false;
		String[] titleList = title.split(" ");
		for (String titleListPart : titleList) {
				if (s.contains(titleListPart.toLowerCase())) {
					result = true;
				}
			}
		return result;
	}
	public String toString() {
		String s = "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + " $";
		return s;
	}
	
	 public StringBuffer play() throws PlayerException {
	        if (this.getLength() > 0) {
	            System.out.println("Playing DVD: " + this.getTitle());
	            System.out.println("DVD length: " + this.getLength());

	            StringBuffer info = new StringBuffer("");
	            info.append("Playing DVD: " + this.getTitle() + "\n" + "DVD length: " + this.getLength());
	            return info;
	        } else {
	            throw new PlayerException("ERROR: DVD length is non-positive!");
	        }

	    }

	
}