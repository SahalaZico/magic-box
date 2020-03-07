public class Person {

    private String name;
    private String address;
    private String city;
    private int age;
    private char gender;
    private String phoneNumber;

    public Person(String names, String addresses, String cities, int ages, char genders, String phoneNumbers) {
        name = names;
        address = addresses;
        city = cities;
        age = ages;
        gender = genders;
        phoneNumber = phoneNumbers;
    }  
    

    public String getCity() {
        return city;
    }

    public void setCity(String newCity) {
        city = newCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char newGender) {
        gender = newGender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    @Override
    public String toString() {
        return "Nama :" + getName()+
                "\nAlamat: " + getAddress()+
                "\nKota: "+getCity()+
                "\nUsia: " + getAge()+
                "\nGender: "+getGender() +
                "\nNo. Kontak: " + getPhoneNumber();
    }

}
