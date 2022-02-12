/**
 * ExerciseSheetTwoQuestions
 */
public class ExerciseSheetTwoQuestions {
    private static int[] myArrayOfThings = { 3, 4, 5, 6, 7 };

    public static void main(String[] args) {
        int myTotal = 0;
        for (int number : myArrayOfThings) {
            myTotal += number;
        }
        System.out.println(myTotal);
    }
}