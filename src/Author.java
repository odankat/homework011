public class Author {
    private String name;
    private String surname;

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

}
