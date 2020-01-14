public class Artist {
	private String artistName;
	private int birthYear;
	private int deathYear;

	//Default constructor
	public Artist() {
		artistName = "None";
		birthYear = 0;
		deathYear = 0;
	}

	//Parameterized constructor
	public Artist(String artistName, int birthYear, int deathYear) {
		this.artistName = artistName;
		this.birthYear = birthYear;
		this.deathYear = deathYear;
	}

	//Gets artist name
	public String getName() {
		return artistName;
	}

	//Gets artist's birth year
	public int getBirthYear() {
		return birthYear;
	}

	//Gets artist's death year
	public int getDeathYear() {
		return deathYear;
	}

	//Prints out info about artist
	public void printInfo() {
		if (deathYear == -1) {
			System.out.println("Artist: " + artistName + ", born " + birthYear);
		}
		else {
			System.out.println("Artist: " + artistName + " (" + birthYear + "-" + deathYear + ")");
		}
	}
}