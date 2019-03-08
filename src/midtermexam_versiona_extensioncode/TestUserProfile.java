

package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author naine
 */
public class TestUserProfile {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Enter your favourite genre (Comedy, Drama, Action, Mystery): ");
        String genre = input.nextLine();
        
        UserProfile up1 = new UserProfile(name, genre);
        
        System.out.println("Your profile was created!");
        
    }
}
