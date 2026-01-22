package gr.aueb.cf.ch17.builder;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book.Builder(1, "1234").build();
        Book book2 = new Book.Builder(2,"6789")
                .author("author")
                .title("title")
                .build();
    }
}
