//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author authorBook1 = new Author("John", "Smith");
        Author authorBook2 = new Author("Katy", "Smith");
        Book book1 = new Book("Ant", authorBook1, 2025);
        Book book2 = new Book("Beetle", authorBook2, 1997);
//        System.out.println("Название книги " + book1.getName());
//        System.out.println("Автор книги " + book1.getAuthor().getFirstName()+" "+ book1.getAuthor().getLastName());
//        System.out.println("Год публикации книги " + book1.getYearOfPublication());
//        book1.setYearOfPublication(2020);
//        System.out.println("Год публикации книги "+ book1.getYearOfPublication());
//        System.out.println("Название книги " + book2.getName());
//        System.out.println("Автор книги " + book2.getAuthor().getFirstName()+" "+ book2.getAuthor().getLastName());
//        System.out.println("Год публикации книги " + book2.getYearOfPublication());
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2));
        System.out.println(authorBook1.equals(authorBook2));
    }
}