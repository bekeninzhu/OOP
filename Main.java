public class Main {
    public static void main(String[] args) {
        // 1. Welcome message
        System.out.println("=== Veterinary Clinic Management System ===");
        System.out.println();

        // 2. Create objects
        Pet pet1 = new Pet(101, "Rex", "Dog", 4);
        Pet pet2 = new Pet();

        Owner owner1 = new Owner(201, "Alice Johnson", "+77011234567", 2);
        Owner owner2 = new Owner();

        Veterinarian vet1 = new Veterinarian(301, "Dr. Smith", "Orthopedic", 7);
        Veterinarian vet2 = new Veterinarian();

        // 3. Display initial state
        System.out.println(" PETS ");
        System.out.println(pet1);
        System.out.println(pet2);

        System.out.println("OWNERS");
        System.out.println(owner1);
        System.out.println(owner2);

        System.out.println("VETERINARIANS");
        System.out.println(vet1);
        System.out.println(vet2);

        // 4. Test Getters
        System.out.println("TESTING GETTERS");
        System.out.println("Pet 1 name: " + pet1.getName());
        System.out.println("Owner 1 name: " + owner1.getName());
        System.out.println("Veterinarian 1 experience: " + vet1.getExperienceYears());

        // 5. Test Setters
        System.out.println("TESTING SETTERS");
        pet2.setName("Fluffy");
        pet2.setSpecies("Cat");
        pet2.setAge(3);
        System.out.println("Updated pet2: " + pet2);

        owner2.setName("Bob Williams");
        owner2.setPhone("+77012345678");
        System.out.println("Updated owner2: " + owner2);

        // 6. Test Additional Methods
        System.out.println("TESTING ADDITIONAL METHODS");
        System.out.println(pet1.getName() + " is young: " + pet1.isYoung());
        System.out.println(vet1.getName() + " is experienced: " + vet1.isExperienced());
        vet1.treatPet();

        // 7. Final Summary
        System.out.println("--- FINAL STATE ---");
        System.out.println("Pets:");
        System.out.println(pet1);
        System.out.println(pet2);

        System.out.println("Owners:");
        System.out.println(owner1);
        System.out.println(owner2);

        System.out.println("Veterinarians:");
        System.out.println(vet1);
        System.out.println(vet2);

        System.out.println("\n=== Program Complete ===");
    }
}
