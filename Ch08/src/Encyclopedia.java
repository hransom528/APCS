public class Encyclopedia extends Book {
	private String edition;
	private int numVolumes;

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public int getNumVolumes() {
		return numVolumes;
	}

	public void setNumVolumes(int numVolumes) {
		this.numVolumes = numVolumes;
	}

	@Override
	public void printInfo() {
		System.out.println("Book Information: ");
		System.out.println("   Book Title: " + title);
		System.out.println("   Author: " + author);
		System.out.println("   Publisher: " + publisher);
		System.out.println("   Publication Date: " + publicationDate);
		System.out.println("   Edition: " + edition);
		System.out.println("   Number of Volumes: " + numVolumes);
	}
}