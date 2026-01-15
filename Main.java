import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Пайдаланушыдан енгізу алу үшін Scanner объектісін бастаймыз
        Scanner scanner = new Scanner(System.in);

        // Ветеринарлық клиникаға қажетті деректерді сақтау үшін тізімдер
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Owner> owners = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();

        // Кейбір мысалдарды қосамыз
        Owner owner = new Owner(1, "Alice", "+77771234567", 2);
        Veterinarian vet = new Veterinarian(2, "Smith", "Surgery", 10);

        people.add(owner);
        people.add(vet);
        pets.add(new Pet(101, "Rex", "Dog"));

        // Негізгі мәзір циклі
        while (true) {
            // Мәзірді шығару
            System.out.println("\n=== VET CLINIC SYSTEM ===");
            System.out.println("1. Add Pet");
            System.out.println("2. View All Pets");
            System.out.println("3. Add Owner");
            System.out.println("4. View All Owners");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 

            switch (choice) {
                case 1: // Ит қосу
                    System.out.print("Enter Pet ID: ");
                    int petId = scanner.nextInt();
                    scanner.nextLine(); // Қалған жаңа жолды сіңіру
                    System.out.print("Enter Pet Name: ");
                    String petName = scanner.nextLine();
                    System.out.print("Enter Pet Species: ");
                    String petSpecies = scanner.nextLine();
                    pets.add(new Pet(petId, petName, petSpecies));
                    System.out.println("Pet added successfully!");
                    break;

                case 2: // Барлық иттерді көрсету
                    System.out.println("\n--- All Pets ---");
                    for (Pet petItem : pets) {
                        System.out.println(petItem);
                    }
                    break;

                case 3: // Иесі қосу
                    System.out.print("Enter Owner ID: ");
                    int ownerId = scanner.nextInt();
                    scanner.nextLine(); // 
                    System.out.print("Enter Owner Name: ");
                    String ownerName = scanner.nextLine();
                    System.out.print("Enter Owner Phone: ");
                    String ownerPhone = scanner.nextLine();
                    System.out.print("Enter Number of Pets: ");
                    int numPets = scanner.nextInt();
                    owners.add(new Owner(ownerId, ownerName, ownerPhone, numPets));
                    System.out.println("Owner added successfully!");
                    break;

                case 4: // Барлық иелерді көрсету
                    System.out.println("\n--- All Owners ---");
                    for (Owner ownerItem : owners) {
                        System.out.println(ownerItem);
                    }
                    break;

                case 0: // Шығу
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
