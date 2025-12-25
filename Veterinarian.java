public class Veterinarian {
    // 1. PRIVATE FIELDS
    private int vetId;
    private String name;
    private String specialization;
    private int experienceYears;

    // 2. CONSTRUCTOR WITH PARAMETERS
    public Veterinarian(int vetId, String name, String specialization, int experienceYears) {
        this.vetId = vetId;
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    // 3. DEFAULT CONSTRUCTOR (optional)
    public Veterinarian() {
        this.name = "Unknown";
        this.specialization = "General";
        this.experienceYears = 0;
    }

    // 4. GETTERS AND SETTERS
    public int getVetId() { return vetId; }
    public void setVetId(int vetId) { this.vetId = vetId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public int getExperienceYears() { return experienceYears; }
    public void setExperienceYears(int experienceYears) { this.experienceYears = experienceYears; }

    // 5. ADDITIONAL METHODS
    public boolean isExperienced() {
        return experienceYears > 5;
    }

    public void treatPet() {
        System.out.println(name + " is treating the pet.");
    }

    // 6. toString() METHOD
    @Override
    public String toString() {
        return "Veterinarian{name='" + name + "', specialization='" + specialization + "', experienceYears=" + experienceYears + "}";
    }
}
