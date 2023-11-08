public class MadLib {
    public static void main(String[] args) {
        System.out.println("Hello world");
        MadLib myStory = new MadLib("Jessica", "Seattle", "computer", "green",
                "toads", "axolotls", false, 8.4, 9,
                3, 3, "Ms. Latham", "Mr. Larocque", 'A',
                "winter");
    }

    public MadLib(String classmate, String city, String noun, String adjective, String pluralNoun, String pluralAnimal,
                  boolean trueOrFalse, double decimalBiggerThan1, int number1, int number2, int wholeNumberBetween1And4,
                  String miltonTeacher, String miltonDean, char letterGrade, String season) {
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

//now print story to the dos window
        System.out.println(story);

    }
}
