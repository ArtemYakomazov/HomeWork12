public class Book {
    private  String name;
    private  Author author;
    private  int yearOfPublication;

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Book (String name, Author author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String toString() {
        return "Название книги: " + this.name + "; Автор книги: " + this.author + "; Год публикации книги: " + this.yearOfPublication;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book1 = (Book) other;
        return name.equals(book1.name);
    }

    public int hashCode() {
        return java.util.Objects.hash(name);
    }

}
