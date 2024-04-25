package hust.soict.globalict.aims.media;

import java.util.*;


public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book(int id, String title, String category, float cost)  {
		super(id, title, category, cost);
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("The author's already there");
			return;
		}
		authors.add(authorName);
		System.out.println("Successfully added");
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Successfully removed");
			return;
		}
		System.out.println("Author's name not found");
	}
	
	public String toString() {
		return String.format("Book - %s - %s: %.2f$", this.getTitle(), this.getCategory(), this.getCost());
	}
}