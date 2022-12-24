package outros_exercicios_da_internet;

public class LocalClassExample {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

        final int numberLength = 10;

        // Válido no JDK 8 e posterior:

        // int numberLength = 10;

        class PhoneNumber {

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){
                // numberLength = 7;
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        // Válido no JDK 8 e posterior:

// myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null)
            System.out.println("O primeiro número é inválido");
        else
            System.out.println("O primeiro número é " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Segundo número é inválido");
        else
            System.out.println("Segundo número é " + myNumber2.getNumber());

    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}