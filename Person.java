// parent класс - Owner және Veterinarian осыдан мұрагер болады
public class Person {
    private int id;
    private String name;

    // Constructor with parameters
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Default constructor
    public Person() {
        this.id = 0;
        this.name = "Unknown";
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Polymorphism үшін әдіс - әр child класста override болады
    public void work() {
        System.out.println(name + " is working.");
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}