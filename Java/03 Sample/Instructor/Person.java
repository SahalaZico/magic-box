public class Person{
    private String name;
    private String address;
    private String city;
    private int age;
    private char gender;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected String getCity() {
        return city;
    }

    protected void setCity(String city) {
        this.city = city;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected char getGender() {
        return gender;
    }

    protected void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", city=" + city + ", gender=" + gender + ", name="
                + name + "]";
    }

    
}