//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author authorAnt = new Author("John", "Smith");
        Author authorBeetle = new Author("Katy", "Parry");
        Book ant = new Book("Ant", authorAnt, 2025);
        Book beetle = new Book("Beetle", authorBeetle, 1997);
        System.out.println("Название книги " + ant.getName());
        System.out.println("Автор книги " + ant.getAuthor().getFirstName()+" "+ ant.getAuthor().getLastName());
        System.out.println("Год публикации книги " + ant.getYearOfPublication());
        ant.setYearOfPublication(2020);
        System.out.println("Год публикации книги "+ ant.getYearOfPublication());
        System.out.println("Название книги " + beetle.getName());
        System.out.println("Автор книги " + beetle.getAuthor().getFirstName()+" "+ beetle.getAuthor().getLastName());
        System.out.println("Год публикации книги " + beetle.getYearOfPublication());
    }
}