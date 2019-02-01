
package methods;

import java.util.Scanner;
public class Methods {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimMethod meth = new SimMethod();
        System.out.println("Enter tour name:");
        String name = input.nextLine();
        meth.simpleMessage(name);
    }
    
}
