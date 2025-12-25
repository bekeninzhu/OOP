public class Owner {
    // 1. PRIVATE FIELDS
    private int ownerId;
    private String name;
    private String phone;
    private int numberOfPets;

    // 2. CONSTRUCTOR WITH PARAMETERS
    public Owner(int ownerId, String name, String phone, int numberOfPets) {
        this.ownerId = ownerId;
        this.name = name;
        this.phone = phone;
        this.numberOfPets = numberOfPets;
    }

    // 3. DEFAULT CONSTRUCTOR (optional)
    public Owner() {
        this.name = "Unknown";
        this.phone = "Unknown";
        this.numberOfPets = 0;
    }

    // 4. GETTERS AND SETTERS
    public int getOwnerId() { return ownerId; }
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public int getNumberOfPets() { return numberOfPets; }
    public void setNumberOfPets(int numberOfPets) { this.numberOfPets = numberOfPets; }

    // 5. ADDITIONAL METHODS
    public void addPet() {
        this.numberOfPets++;
    }

    public void removePet() {
        if (this.numberOfPets > 0) {
            this.numberOfPets--;
        }
    }

    // 6. toString() METHOD
    @Override
    public String toString() {
        return "Owner{name='" + name + "', phone='" + phone + "', numberOfPets=" + numberOfPets + "}";
    }
}
