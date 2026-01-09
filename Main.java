import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Veterinary Clinic Management System ===\n");

        // POLYMORPHISM: parent түрінің ArrayList-іне әртүрлі бала объектілерін сақтаймыз
        ArrayList<Person> people = new ArrayList<>();

        // child объектілерін жасау
        Owner owner = new Owner(1, "Alice", "+77771234567", 2);
        Veterinarian vet = new Veterinarian(2, "Smith", "Surgery", 10);

        // parent түрінің List-іне қосу (Polymorphism)
        people.add(owner);
        people.add(vet);

        // 1. Барлығын Person ретінде қарау
        System.out.println("=== All People (as Person) ===");
        for (Person p : people) {
            System.out.println(p);  // toString() автоматты түрде шақырылады
        }

        // 2. Polymorphic work() әдісі
        System.out.println("\n=== Polymorphic work() method ===");
        for (Person p : people) {
            p.work();  // Әр объектінің өз work() әдісі шақырылады
        }

        // 3. instanceof және casting
        System.out.println("\n=== instanceof and Casting ===");
        for (Person p : people) {
            if (p instanceof Owner) {
                Owner o = (Owner) p;  // Person-ды Owner-ге casting
                System.out.println(o.getName() + " has " + o.getPetCount() + " pets");
            } else if (p instanceof Veterinarian) {
                Veterinarian v = (Veterinarian) p;  // Person-ды Veterinarian-ға casting
                System.out.println(v.getName() + " specializes in " + v.getSpecialty());
            }
        }

        // 4. Pet жасау (бөлек класс)
        Pet pet = new Pet(101, "Rex", "Dog");
        System.out.println("\n=== Pet Info ===");
        System.out.println(pet);
    }
}