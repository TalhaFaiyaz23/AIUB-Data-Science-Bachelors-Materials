package Entity;

public class Member extends Person {
    private String memberId;
    private String shift;
    private double payment;
    private Trainer trainer;

    public Member(String memberId, String name, int age, String phoneNumber, String gender, String shift, double payment) {
        super(name, age, phoneNumber, gender);
        this.memberId = memberId;
        this.shift = shift;
        this.payment = payment;
    }

    public void assignTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getMemberId() {
        return memberId;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    @Override
    public String getDetails() {
        String trainerInfo = (trainer != null) ? trainer.getDetails() : "No trainer assigned";

        return "----------------------------------Member Info----------------------------------" + "\nMember ID : " + memberId + "\nMember Name : " + name + "\nAge : "+ age + "\nPhone Number : " + phoneNumber + "\nGender : " + gender + "\nTime Shift : " + shift + "\nTrainer : " + trainerInfo;

    }

    public String toFileFormat() {
        return memberId + ";" + name + ";" + age + ";" + phoneNumber + ";" + gender + ";" + shift + ";" + payment;
    }
}
