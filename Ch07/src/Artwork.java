public class Artwork {
	private String title;
	private int yearCreated;
	private Artist artist;

   //Default constructor
	public Artwork() {
		title = "None";
		yearCreated = 0;
	}
   
	//Parameterized constructor
	public Artwork(String title, int yearCreated, Artist artist) {
		this.title = title;
		this.yearCreated = yearCreated;
		this.artist = artist;
	}

	//Gets artwork title
	public String getTitle() {
		return title;
	}

	//Gets year created
	public int getYearCreated() {
		return yearCreated;
	}

	//Prints out artwork info
	public void printInfo() {
		artist.printInfo();
		System.out.println("Title: " + title + ", " + yearCreated);
	}
}