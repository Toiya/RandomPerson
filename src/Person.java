public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int workExperience;
    private String fieldOfWork;

    public Person(String firstName, String lastName, int age, int workExperience, String fieldOfWork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.workExperience = workExperience;
        this.fieldOfWork = fieldOfWork;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public String getFieldOfWork() {
        return fieldOfWork;
    }

    public String toString() {
        return firstName + " " +
                lastName + ", " +
                age + ". Has worked in " +
                fieldOfWork + " for " +
                workExperience + " year(s).";
    }
}
