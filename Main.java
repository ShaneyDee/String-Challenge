import java.util.*;

class ArithmeticTask {

    public static void main (String[] args){
          
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(str);
        
        //1. Find and print the length of the string
        System.out.println("Problem 1: " + str.length());
        //2. Convert the string to uppercase and print it
        System.out.println("Problem 2: " + str.toUpperCase());
        //3. Convert the string to lowercase and print it
        System.out.println("Problem 3: " + str.toLowerCase());
        //4. Print the first character of the string
        System.out.println("Problem 4: " + str.charAt(0));
        //5. Print the last character of the string
        System.out.println("Problem 5: " + str.substring(str.length()-1));
        //6. Print the substring starting from the second character to the fifth character of the string
        System.out.println("Problem 6: " + str.substring(1, 5));
    }
}
