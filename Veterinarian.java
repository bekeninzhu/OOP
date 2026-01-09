// Veterinarian - Person-нен мұрагер (extends кілт сөзі)
public class Veterinarian extends Person {
    private String specialty;
    private int experience;

    // Constructor - super() арқылы parent конструкторын шақырамыз
    public Veterinarian(int id, String name, String specialty, int experience) {
        super(id, name);  // Person класстың конструкторын шақыру
        this.specialty = specialty;
        this.experience = experience;
    }

    // Default constructor
    public Veterinarian() {
        super();  // Person-ның default конструкторын шақыру
        this.specialty = "General";
        this.experience = 0;
    }

    // Getters and Setters
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // Person-дің work() әдісін override жасаймыз
    @Override
    public void work() {
        System.out.println("Dr. " + getName() + " is performing surgery.");
    }

    // toString() әдісін override жасаймыз
    @Override
    public String toString() {
        return "Vet{" + super.toString() + ", specialty='" + specialty + "', exp=" + experience + "}";
    }
}