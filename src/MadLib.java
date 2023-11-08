public class MadLib {
    public static void main(String[] args) {
        System.out.println("Hello world");
        MadLib myStory = new MadLib("Jessica", "Seattle", "computer", "green",
                "toads", "axolotls", false, 8.4, 9,
                3, 3, "Ms. Latham", "Mr. Larocque", 'A',
                "winter", "computer chips", "Hot Cheetos", false, "unicorn",
                "Apple HQ", "Seinxpei", 750, "elated");
    }

    public MadLib(String classmate, String city, String noun, String adjective, String pluralNoun, String pluralAnimal,
                  boolean trueOrFalse, double decimalBiggerThan1, int number1, int number2, int wholeNumberBetween1And4,
                  String miltonTeacher, String miltonDean, char letterGrade, String season, String pluralNoun1,
                  String foodItem, boolean onWater, String flyingAnimal, String location, String madeUpSpell,
                  int wholeNumberBetween1And800, String emotion) {
        System.out.println("Halo varld");
        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                + classmate + ".\nWe are going to a campsite in "
                +city+ ". \nI packed my "+noun+ " and "
                +pluralNoun + ".\nThe forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit.\nSo it should be a "
                +adjective+" day!\nThis year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous.\n"
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ".\nBut, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times.\nWish us luck!\nIf we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";

        String ifWater = "didn't include";
        String ifNeeded = "left my " + flyingAnimal + " behind.\n";
        if (onWater){
            ifWater = "included";
            ifNeeded = "got on my " + flyingAnimal + " and began flying.\n";
        }

        String mortality = "The dragon disappeared with a roar into the abyss.\nI was victorious!\nI took my loot of " + pluralNoun1 + " and left.";
        if (wholeNumberBetween1And800 < 400){
            mortality = "The fall was too little, and the dragon survived.\nI was forced to retreat, defeated.";
        }

        String bonusStory = "\n\nI heard online that there was a massive pile of " + pluralNoun1 + " hidden at a certain location.\n" +
                "I quickly scarfed down a massive meal of " + foodItem + " and got ready.\n" +
                "My route " + ifWater + " a stint over the water, so I " + ifNeeded +
                "Once I got to the " + location + ", I pointed my wand and yelled \"" + madeUpSpell + "!\" at the dragon.\n" +
                "The monster fell " + wholeNumberBetween1And800 + " feet in a shower of sparks.\n" +
                mortality + "\nAfter such a long day, I felt " + emotion + ".";

//now print story to the dos window
        System.out.println(story);
        System.out.println(bonusStory);
    }
}
