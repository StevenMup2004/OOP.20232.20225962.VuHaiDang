package hust.soict.globalict.aims.media;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title, String category, String director, int length, String artist, float cost) {
		super(title, category, director, length, cost);
		this.artist = artist;
	}
	
	public CompactDisc(String title, String category, float cost) {
		super(title, category, null, 0, 0.0f);
	}
	
	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void addTrack(Track aTrack) {
		if (tracks.contains(aTrack)) {
			System.out.println("The track's already there.");
			return;
		}
		tracks.add(aTrack);
		System.out.println("Successfully added");
	}
	
	public void removeTrack(Track aTrack) {
		if (tracks.contains(aTrack)) {
			tracks.remove(aTrack);
			System.out.println("Successfully removed");
			return;		
		}
		System.out.println("Track is not found");
	}
	
	public int getLength() {
		int sum = 0;
		for (Track t: tracks) {
			sum += t.getLength();
		}
		return sum;
	}
	
	public void play() {
		System.out.printf("CD %s from artist %s.\nThis CD contains %dtracks.",
										  this.getTitle(), this.artist, this.tracks.size());
		for (Track t: tracks) {
			t.play();
		}
	}
	
	public String toString() {
	    String s = "CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + String.format("%.2f", this.getCost()) + " $";
	    return s;
	}

}