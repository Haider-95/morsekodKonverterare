package se.trixzta;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class morseService {
    private static HashMap<Character, String> CharToMorse = new HashMap<>();
    private static HashMap<Character, String> morseToChar= new HashMap<>();

    static {
        CharToMorse.put('A', ".-");
        CharToMorse.put('B', "-...");
        CharToMorse.put('C', "-.-.");
        CharToMorse.put('D', "-..");
        CharToMorse.put('E', ".");
        CharToMorse.put('F', "..-.");
        CharToMorse.put('G', "--.");
        CharToMorse.put('H', "....");
        CharToMorse.put('I', "..");
        CharToMorse.put('J', ".---");
        CharToMorse.put('K', "-.-");
        CharToMorse.put('L', ".-..");
        CharToMorse.put('M', "--");
        CharToMorse.put('N', "-.");
        CharToMorse.put('O', "---");
        CharToMorse.put('P', ".--.");
        CharToMorse.put('Q', "--.-");
        CharToMorse.put('R', ".-.");
        CharToMorse.put('S', "...");
        CharToMorse.put('T', "-");
        CharToMorse.put('U', "..-");
        CharToMorse.put('V', "...-");
        CharToMorse.put('W', ".--");
        CharToMorse.put('X', "-..-");
        CharToMorse.put('Y', "-.--");
        CharToMorse.put('Z', "--..");

        Scanner sc = new Scanner(System.in);
        System.out.println("1 text to morse");
        System.out.println("2 morse to text");
        String choice = sc.nextLine().trim();

        if(choice.equals("1")) {

            System.out.println("Enter sentence: ");
            String sentence = sc.nextLine().trim();

            char[] arr = sentence.toUpperCase().toCharArray();

            String result = "";

            for (char c : arr) {
                result += CharToMorse.get(c);
                System.out.println();
            }
            System.out.println("Your input " + sentence + " is converted to = " + result);
        }
        else if(choice.equals("2")) {
            System.out.println("Enter morse sentence: ");
            String sentence = sc.nextLine().trim();
            String result = "";

            char[] arr = sentence.toCharArray();
            for (char c : arr) {

                result += CharToMorse.get(c);
                System.out.println();
            }

            System.out.println("Your input " + sentence + " is converted to = " + result);


        }

    }

}
