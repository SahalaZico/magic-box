
public class Person implements Relation {

    private String name;
    private String address;
    private String city;
    private int age;
    private char gender;

    public Person() {
        name = "dummy name";
        address = "dummy address";
        city = "dummy city";
        age = 17;
        gender = 'M';
    }

    public Person(String varName, String varAddress, String varCity, int varAge, char varGender) {
        name = varName;
        address = varAddress;
        city = varCity;
        age = varAge;
        gender = varGender;
    }

    public Person(Person P) {
        name = P.getName();
        address = P.getAddress();
        city = P.getCity();
        age = P.getAge();
        gender = P.getGender();
    }

    protected void setName(String varName) {
        name = varName;
    }

    protected void setAddress(String varAddress) {
        address = varAddress;
    }

    protected void setCity(String varCity) {
        city = varCity;
    }

    protected void setAge(int varAge) {
        age = varAge;
    }

    protected void setGender(char varGender) {
        gender = varGender;
    }

    protected String getName() {
        return name;
    }

    protected String getAddress() {
        return address;
    }

    protected String getCity() {
        return city;
    }

    protected int getAge() {
        return age;
    }

    protected char getGender() {
        return gender;
    }

    public String toString() {
        return "Name:" + getName()
                + "\nAddress:" + getAddress()
                + "\nCity:" + getCity()
                + "\nAge:" + getAge()
                + "\nGender:" + getGender() + "\n";
    }

    @Override
    public boolean isEquals(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Person) {
            return (name.equals(((Person) o).getName()) && address.equals(((Person) o).getAddress())
                    && city.equals(((Person) o).getCity()) && age == ((Person) o).getAge() && gender == ((Person) o).getGender());
        } else {
            return false;
        }

    }

    //tidak bisa dibandingkan
    @Override
    public boolean isGreaterThan(Object o) {
        return false;
    }

    @Override
    public boolean isLessThan(Object o) {
            return false;
    }

}
