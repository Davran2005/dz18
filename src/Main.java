import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat(new Person[]{
                new Person("Davran", "Аламидин-1"),
                new Person("Nurik", "Байтик Батыр "),
                new Person("Erbol", "Чапаева"),
                new Person("Abuali", "Абдурахманов")});

        Hotel hotel = new Hotel(new Person[]{
                new Person("Atay", "Азия-7"),
                new Person("Kutman", "Киевский"),
                new Person("Erlan", "Джал")});

        Hostel hostel = new Hostel(new Person[]{
                new Person("Siymyk", "Абдурахманова"),
                new Person("Khafiz", "Октябрский"),
        });


        Apartment[] apartments = {flat, hotel, hostel};

        for (Apartment apartment : apartments) {
            if (apartment instanceof Flat) {
                System.out.println(apartment);
                System.out.println("length : " + apartment.getPeopleLength());
            }
        }
        System.out.println(flat.getComSer());
        System.out.println();

        for (Apartment apartment1 : apartments) {
            if (apartment1 instanceof Hotel) {
                System.out.println(apartment1);
                System.out.println("length : " + apartment1.getPeopleLength());
            }
        }
        System.out.println(hotel.getRent());
        System.out.println();

        for (Apartment apartment2 : apartments) {
            if (apartment2 instanceof Hostel) {
                System.out.println(apartment2);
                System.out.println("length : " + apartment2.getPeopleLength());
            }
        }
        System.out.println(hostel.getRent());
        System.out.println();

    }
}

