public class Book {
    private String name;
    private String author;
    private int releaseData;

    public Book(String name, String author, int releaseData) {
        this.name = name;
        this.author = author;
        this.releaseData = releaseData;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getReleaseData() {
        return this.releaseData;
    }

    public void setReleaseData(int releaseData) {
        this.releaseData = releaseData;
    }
}

