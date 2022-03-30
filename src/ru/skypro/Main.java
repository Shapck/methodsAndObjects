package ru.skypro;

public class Main {

    public static void main(String[] args) {
	Book voinaIMir = new Book("Война и Мир",1867,new Author("Толстой", "Лев"));
    Book voinaIMir2 = new Book("Война и Мир",1867,new Author("Толстой", "Лев"));
    Author author1 = new Author("Пушкин", "Александр");
    Author author2 = new Author("Пушкин", "Александр");
    Book evgenyOnegin = new Book("Евгений Онегин",1833,new Author("Пушкин","Александр"));
    Book evgenyOnegin2 = new Book("Евгений Онегин",1833,new Author("Пушкин","Александр"));

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

        System.out.println(voinaIMir.getDateOfBook());

        System.out.println(voinaIMir.equals(voinaIMir2));
        System.out.println(voinaIMir.hashCode());
        System.out.println(voinaIMir2.hashCode());
        System.out.println(voinaIMir);
        System.out.println(author1.equals(author2));
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(author1);
    }
}
