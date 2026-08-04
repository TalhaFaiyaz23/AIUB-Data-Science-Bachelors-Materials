package Entity;

public abstract class Person {
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String gender;

    public Person(String name, int age, String phoneNumber, String gender) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public abstract String getDetails();
}
