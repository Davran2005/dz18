public class Hotel extends Apartment implements Rent {
    public Hotel(Person[] family) {
        super(family);
    }

    @Override
    public int getPeopleLength() {
        return getFamily().length;
    }

    @Override
    public String getRent() {
        return " Жашагандар аренрда толошот ";
    }


}
