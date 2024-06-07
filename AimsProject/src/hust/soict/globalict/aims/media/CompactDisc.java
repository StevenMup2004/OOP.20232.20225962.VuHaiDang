package hust.soict.globalict.aims.media;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title, String category, float cost, int length, String artist, String director) {
		super(title, category, director, length, cost);
		this.artist = artist;
	}
	
	public CompactDisc(String title, String category, float cost) {
		super(title, category, null, 0, 0.0f);
	}
	
	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public String getArtist() {
		return artist;
	}

	public int getLength() {
		int sum = 0;
		for (Track t: tracks) {
			sum += t.getLength();
		}
		return sum;
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
	
	public StringBuffer play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing CD: " + this.getTitle());
			System.out.println("CD length: " + this.getLength());
			
			StringBuffer info = new StringBuffer("");
			info.append("Playing CD: " + this.getTitle() + "\n" + "CD length: " + this.getLength() + "\n");
			
			for (Track t : tracks) {
				try {
					StringBuffer trackInfo = t.play();
					info.append(trackInfo + "\n");
				} catch (PlayerException e) {
					throw e;
				}
			}
			return info;
		} else {
			throw new PlayerException("ERROR: CD length is non-positive!");
		}
		
	}
	
	
	public String toString() {
	    String s = "CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + String.format("%.2f", this.getCost()) + " $";
	    return s;
	}

}