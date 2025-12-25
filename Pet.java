public class Pet {
    // 1. PRIVATE FIELDS
    private int petId;
    private String name;
    private String species;
    private int age;

    // 2. CONSTRUCTOR WITH PARAMETERS
    public Pet(int petId, String name, String species, int age) {
        this.petId = petId;
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // 3. DEFAULT CONSTRUCTOR (optional)
    public Pet() {
        this.name = "Unknown";
        this.species = "Unknown";
        this.age = 0;
    }

    // 4. GETTERS AND SETTERS
    public int getPetId() { return petId; }
    public void setPetId(int petId) { this.petId = petId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // 5. ADDITIONAL METHODS
    public boolean isYoung() {
        return age < 5;
    }

    public String getLifeStage() {
        if (age < 2) return "Young";
        if (age < 7) return "Adult";
        return "Senior";
    }

    // 6. toString() METHOD
    @Override
    public String toString() {
        return "Pet{name='" + name + "', species='" + species + "', age=" + age + "}";
    }
}
