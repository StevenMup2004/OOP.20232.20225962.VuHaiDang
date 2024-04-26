package hust.soict.globalict.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		}
	
	public boolean equals(Object t) {
		if (t instanceof Track) {
			Track T = (Track)t;
			return (this.title.equals(T.getTitle()) && this.length == T.getLength());
		}
		return false;
	}
}