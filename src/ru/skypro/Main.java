package ru.skypro;

public class Main {

    public static void main(String[] args) {
    Author author = new Author("Толстой", "Лев");
	Book voinaIMir = new Book("Война и Мир",1867,author);
    Author author1 = new Author("Пушкин", "Александр");
    Book evgenyOnegin = new Book("Евгений Онегин",1833,author1);
        System.out.println(voinaIMir.getAuthor().getFirstName());
        System.out.println(voinaIMir.getAuthor().getLastName());
        System.out.println(voinaIMir.getNameOfBook());
        System.out.println(voinaIMir.getDateOfBook());

        System.out.println(" ");

        System.out.println(evgenyOnegin.getAuthor().getFirstName());
        System.out.println(evgenyOnegin.getAuthor().getLastName());
        System.out.println(evgenyOnegin.getNameOfBook());
        System.out.println(evgenyOnegin.getDateOfBook());

        System.out.println(" ");

        voinaIMir.setDateOfBook(1866);
        System.out.println(voinaIMir.getDateOfBook());
    }
}
