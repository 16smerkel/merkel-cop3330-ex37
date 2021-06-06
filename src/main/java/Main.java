import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static <thePasswordHelloObject> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String[] specChar = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};
        int specLen = specChar.length;
        System.out.println("What's the minimum length?");
        int minLen = scanner.nextInt();
        System.out.println("How many special characters?");
        int specCount = scanner.nextInt();
        System.out.println("How many numbers? ");
        int numCount = scanner.nextInt();
        List<String> thePassword = new ArrayList<>();
        for (int i = 0; i < minLen; i++) {
            if (numCount != 0 && i % 3 == 1) {
                int newNum = rand.nextInt(10);
                String theNum = String.valueOf(newNum);
                thePassword.add(theNum);
                numCount--;
            } else if (specCount != 0 && i % 3 == 0) {
                int newSpec = rand.nextInt(specLen);
                String theSpec = specChar[newSpec];
                thePassword.add(theSpec);
                specCount--;
            } else {
                int newLetter = rand.nextInt(26);
                char c = (char) (newLetter + 'a');
                String theLetter = ("" + c);
                thePassword.add(theLetter);
            }
        }
        System.out.print("Your password is ");
        String array[] = new String[minLen];
        for(int j =0;j<minLen;j++)
        {
            array[j] = thePassword.get(j);
            System.out.print(array[j]);
        }
    }
}
