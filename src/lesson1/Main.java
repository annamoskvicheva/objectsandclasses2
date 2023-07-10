package lesson1;

public class Main {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        // System.out.println(author.firstName);
        // System.out.println(author.lastName);
       // System.out.println(dostoevsky.getFirstName());
       // System.out.println(dostoevsky.getLastName());

        Book prestuplenieNakazanie = new Book("Преступление и наказание",dostoevsky, 1866);

        Author gogol = new Author("Николай", "Гоголь");
        Book mertvyeDushi = new Book("Мёртвые души", gogol, 1835);

        System.out.println(prestuplenieNakazanie.getName());
        System.out.println(prestuplenieNakazanie.getYear());
        prestuplenieNakazanie.setYear(1866);
        System.out.println(prestuplenieNakazanie.getYear());

        System.out.println(mertvyeDushi.getName());
        System.out.println(mertvyeDushi.getYear());
        mertvyeDushi.setYear(1835);
        System.out.println(mertvyeDushi.getYear());

    }
}