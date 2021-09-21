package devOn;

public class Patient {
    private String id;
    private String name;
    private int age;
    private boolean covidPositive;

    public Patient(String id, String name, int age, boolean covidPositive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.covidPositive = covidPositive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCovidPositive() {
        return covidPositive;
    }

    public void setCovidPositive(boolean covidPositive) {
        this.covidPositive = covidPositive;
    }
}
