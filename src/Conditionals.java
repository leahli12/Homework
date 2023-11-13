public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();
    }

    public Conditionals(){
        String question = "Will I get a good grade on my test?";
        System.out.println(question);
        int randomInt = (int)(Math.random() * 11);
        System.out.println(randomInt);
        if (randomInt == 0 || randomInt == 10){
            System.out.println("Only time will tell.");
        }
        else if (randomInt == 1) {
            System.out.println("It is inevitable.");
        }
        else if (randomInt == 2) {
            System.out.println("The chances are near impossible.");
        }
        else if (randomInt == 3 || randomInt == 4){
            System.out.println("The odds are even on either side.");
        }
        else if (randomInt == 5) {
            System.out.println("Fates are in your favor.");
        }
        else if (randomInt == 6) {
            System.out.println("Signals unclear; try again.");
        }
        else if (randomInt == 7 || randomInt == 8){
            System.out.println("It is less likely to happen than it is to occur.");
        }
        else {
            System.out.println("Yes, but in an unexpected manner.");
        }
    }
}
