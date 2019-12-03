public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstNumberWhole = (int) (firstNumber * 1000);
        int secondNumberWhole = (int) (secondNumber * 1000);
        return firstNumberWhole == secondNumberWhole;
    }
}