public class Test {
    public static void main(String[] args) {
        RandomPersonGenerator rpg = new RandomPersonGenerator();

        for (int i = 0; i < 100; i++) {
            System.out.println(rpg.getRandomWorkingPerson());
        }
    }
}
