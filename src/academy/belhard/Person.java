package academy.belhard;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String email;
    private int age;

    public Person(int id, String firstName, String lastName, String address, String city, String email, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public static Person createFoSaving(String firstName, String lastName, String address, String city, String email, int age) {
        return new Person(-1, firstName, lastName, address, city, email, age);
    }
}
