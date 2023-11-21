package core;
import java.util.Random;
import util.PersonDiedException;
import util.PersonInterface;
import util.ThingInterface;

import java.util.Objects;

public class Person implements PersonInterface {
    private final String name;

    public Person(String name) throws PersonDiedException {
        this.name = name;
        Random random = new Random();
        if (random.nextDouble() <= 0.15){
            throw new PersonDiedException("Мужик помер(");
        }
    }

    @Override
    public void say(String phrase) {
        System.out.println("\"" + this.getName() + "\" сказал \"" + phrase + "\"");
    }

    @Override
    public void seeObject(ThingInterface object) {
        System.out.println("\"" + this.getName() + "\" видит объект \"" + object + "\"");
    }

    @Override
    public void reminds(ThingInterface object1, ThingInterface object2) {
        System.out.println("\"" + object1 + "\" напоминает персонажу \"" + this.getName() + "\" объект \"" + object2 + "\"");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "персонаж \"" + name + "\"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public void remindsBook(String bookname, String author){
        class Book {
            private String bookname;
            private String author;
            public Book(String bookname, String author){
                this.author = author;
                this.bookname = bookname;
            }

            @Override
            public String toString() {
                return bookname + ", ее написал " + author;
            }
        }
        Book book = new Book(bookname, author);
        System.out.println(getName() + " вспомнил книгу " + book);
    }
}
