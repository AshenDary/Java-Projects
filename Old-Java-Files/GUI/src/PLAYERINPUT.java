public class PLAYERINPUT {
    public static boolean isValidInput(int input, int[] validInputs) {
        for (int validInput : validInputs) {
            if (input == validInput) {
                return true;
            }
        }
        return false;
    }
}