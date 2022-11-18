public class Flat extends Apartment implements ComSer {

    public Flat(Person[] family) {
        super(family);
    }

    @Override
    public int getPeopleLength() {
        return getFamily().length;
    }

    @Override
    public String getComSer() {
        return " жашагандар кварплата  толошот ";
    }

}
