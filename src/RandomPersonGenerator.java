public class RandomPersonGenerator {
    private final int MINWORKINGAGE = 16;
    private final int MAXWORKINGAGE = 68;
    private final int MAXAGE = 120;
    private final int MINWORKEXPERIENCE = 1;


    public Person getRandomWorkingPerson() {
        String fname = getRandomFirstName();
        String lname = getRandomLastName();
        int age = getRandomWorkingAge();
        int workExp = getRandomWorkExperience(age);
        String field = getRandomField();
        return new Person(fname, lname, age, workExp, field);
    }

    public String getRandomFirstName() {
        int rand = getRandomNumber(0, Data.firstNames.length);
        return Data.firstNames[rand];
    }

    public String getRandomLastName() {
        int rand = getRandomNumber(0, Data.lastNames.length);
        return Data.lastNames[rand];
    }

    public String getRandomField() {
        int rand = getRandomNumber(0, Data.fields.length);
        return Data.fields[rand];
    }

    public int getRandomWorkingAge() {
        return getRandomNumber(MINWORKINGAGE, MAXWORKINGAGE);
    }

    public int getRandomAge() {
        return getRandomNumber(0, MAXAGE);
    }

    public int getRandomWorkExperience(int age) {
        return getRandomNumber(MINWORKEXPERIENCE, age - MINWORKINGAGE + 1);
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}