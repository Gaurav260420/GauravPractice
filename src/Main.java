import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter yor sentence in camelCase");
        String str = sc.nextLine();
        int k=1;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                k++;
            }
        }
        System.out.println("No of word is " +k);
    }
}