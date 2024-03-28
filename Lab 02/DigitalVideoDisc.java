package Aims;
public class DigitalVideoDisc {
	       
           private String title;
           private String category;
           private String director;
           private int length;
           private float cost;
           private static int nbDigitalVideoDiscs = 0;
	       private int id ;
	       
	       
		public String getTitle() {
			return title;
		}
		public String getCategory() {
			return category;
		}
		public String getDirector() {
			return director;
		}
		public int getLength() {
			return length;
		}
		public float getCost() {
			return cost;
		}
		public int getId() {
			return id;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public void setCost(float cost) {
			this.cost = cost;
		}
		public DigitalVideoDisc(String title) {
			
			this.title = title;
			nbDigitalVideoDiscs++;
            this.id = nbDigitalVideoDiscs;
		}
		public DigitalVideoDisc(String category, String title, float cost) {
		
			this.title = title;
			this.category = category;
			this.cost = cost;
			nbDigitalVideoDiscs++;
            this.id = nbDigitalVideoDiscs;
		}
		public DigitalVideoDisc(String director, String category, String title, float cost) {
			
			this.title = title;
			this.category = category;
			this.director = director;
			this.cost = cost;
			nbDigitalVideoDiscs++;
            this.id = nbDigitalVideoDiscs;
		}
		public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
			this.title = title;
			this.category = category;
			this.director = director;
			this.length = length;
			this.cost = cost;
			nbDigitalVideoDiscs++;
            this.id = nbDigitalVideoDiscs;
		}
		
		
		
           
}
