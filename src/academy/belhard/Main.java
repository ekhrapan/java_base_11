package academy.belhard;

public class Main {

    public static void main(String[] args) {
//        Person p1 = PersonConnector.byId(1);
//        Person p5 = PersonConnector.byId(8);
//
//        System.out.println(p1);
//        System.out.println(p5);

        Person person = Person.createFoSaving("user", "user_L", "address", "city", "email", 45);
        PersonConnector.save(person);
    }
}
