public class ValidPin {

//    Create a function that will test if a string is a valid PIN or not via a regular expression.
//
//    A valid PIN has:
//
//    Exactly 4 or 6 characters.
//    Only numeric characters (0-9).
//    No whitespace.
//    Examples
//    validate("121317") ➞ true
//
//    validate("1234") ➞ true
//
//    validate("45135") ➞ false
//
//    validate("89abc1") ➞ false
//
//    validate("900876") ➞ true
//
//    validate(" 4983") ➞ false
//
//    Notes:
//    Empty strings should return 'false' when tested.
    public static void main(String[] args) {
        System.out.println(validate("121317")); //return true
        System.out.println(validate("1234")); //return true
        System.out.println(validate("45135")); //return false
        System.out.println(validate("89abc1")); //return false
        System.out.println(validate("900876")); //return true
        System.out.println(validate(" 4983")); //return false
        System.out.println(validate("")); // return false

    }

    public static boolean validate(String pin) {
        if (pin.length() == 4 || pin.length() == 6){
            for(int i = 0; i < pin.length(); i++) {
                try {
                    int pinValue = Integer.parseInt(pin.substring(i));
                } catch(Exception e) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
