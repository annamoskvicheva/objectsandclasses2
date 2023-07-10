package lesson1;

public class Main {
    public static void main(String[] args) {

        Author gogol = new Author("Николай","Гоголь");
        Book mertDushi = new Book("Мёртвые души", gogol, 1835);

        System.out.println(gogol);
        System.out.println(mertDushi);

        Author gogol2 = new Author("Николай","Гоголь");

        System.out.println(gogol.equals(gogol2));
        System.out.println(gogol.hashCode());
        System.out.println(gogol2.hashCode());
    }
}