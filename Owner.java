// Owner - Person-нен мұрагер (extends кілт сөзі)
public class Owner extends Person {
    private String phone;
    private int petCount;

    // Constructor - super() арқылы parent конструкторын шақырамыз
    public Owner(int id, String name, String phone, int petCount) {
        super(id, name);  // Person класстың конструкторын шақыру
        this.phone = phone;
        this.petCount = petCount;
    }

    // Default constructor
    public Owner() {
        super();  // Person-ның default конструкторын шақыру
        this.phone = "Unknown";
        this.petCount = 0;
    }

    // Getters and Setters
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPetCount() {
        return petCount;
    }

    public void setPetCount(int petCount) {
        this.petCount = petCount;
    }

    // Person-дің work() әдісін override жасаймыз
    @Override
    public void work() {
        System.out.println(getName() + " is taking care of " + petCount + " pets.");
    }

    // toString() әдісін override жасаймыз
    @Override
    public String toString() {
        return "Owner{" + super.toString() + ", phone='" + phone + "', pets=" + petCount + "}";
    }
}
