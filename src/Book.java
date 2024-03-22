public class Book {
    private String name;
    private Author author;
    private int releaseData;

    public Book(String name, Author author, int releaseData) {
        this.name = name;
        this.author = author;
        this.releaseData = releaseData;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;

    }


    public int getReleaseData() {
        return this.releaseData;
    }

    public void setReleaseData(int releaseData) {

        this.releaseData = releaseData;
    }
}

