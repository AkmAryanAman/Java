public class DataType {
    public static void main(String[] args) {
        integerLiteral();
        floatingPointLiterals();
        characterLiteral();
    }


    private static void integerLiteral(){
        //Integer Literal
        int days = 365;
        System.out.println("No of Days : " + days);

        byte byte1 = 1;
        System.out.println("byte value : " + byte1);

        short short1 = 100;
        System.out.println("short value : " + short1);

        long value = 12345678901234567L;
        System.out.println("The value : " + value);

        int octalValue = 020;
        System.out.println("Octal value : " + octalValue + " in Decimal");

        int hexaDecimalValue = 0x10;
        System.out.println("Hexadecimal value : " + hexaDecimalValue + " in Decimal");


        //Binary Literal
        int binaryValue = 0b01101010101010101;
        System.out.println("Binary no store here as " + binaryValue);

        //underscore numeric Digit
        long card = 1234_5678_9123_4567L;
        System.out.println("Card number (Underscore Numeric) : " + card);
    }

    private static void floatingPointLiterals(){
        //Floating-Point Literals

        // by default floating point number used as type double
        //float value = 1.5  >It will show error
        float value = 1.5f;
        System.out.println("Floating point number : " + value);

        double doubleValue = 1.5;
        System.out.println("Double type : " + doubleValue);

        //1.35E10 is same as 1.35 X 10^10
        double doubleValueE = 1.35E10;
        System.out.println("Double Type in E formate : " + doubleValueE);

        float float1 = 1.11111111111111111f;
        System.out.println("Exceeded precision in float. So rounded value is " + float1);
    }

    private static void characterLiteral(){
        //Character Literal

        //storing value that corresponds to a character in unicode character
        char value = 67;
        System.out.println("The character value : " + value);

        char value2 = 'C';
        System.out.println("The character value : " + value2);

        //Special character escape sequences
        char singleQuoteValue = '\'';
        char doubleQuoteValue = '\"';
        char backslashValue = '\\';
        char backspaceValue = '\b';
        char newlineValue = '\n';
        char carriageReturn = '\r';
        char tabValue = '\t';

        System.out.println("Single Quote " + singleQuoteValue + " here");
        System.out.println("Double Quote " + doubleQuoteValue + " here");
        System.out.println("Backslash : " + backslashValue + "here");
        System.out.println("Backspace : " + backspaceValue + "here");
        System.out.println("New Line " + newlineValue + "here");
        System.out.println("Carriage Return " + carriageReturn + "here");
        System.out.println("Tab value" + tabValue + "here");

        char char1 = 65;
        char char2 = 5;
        System.out.println("Char1 = " + char1);
        System.out.println("Char2 = " + char1 + 1);
        System.out.println("Char3 = " + (char1 + 1));
        System.out.println("Char4 = " + ++char1);
        System.out.println("Char5 = " + (char1 + char2));
        System.out.println("Char5 = " + char1 + char2);
    }
}
