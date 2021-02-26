
public class FunWithNamesV2 {
   public static void main(String[] args) {
       System.out.println("Enter your first name: ");
       String firstName = Given.getString();
       
       System.out.println("Enter your middle name: ");
       String middleName = Given.getString();
       
       System.out.println("Enter your last name: ");
       String lastName = Given.getString();
       
       String fullName = firstName + " " + middleName + " " + lastName;
       int characterCount = firstName.length() + middleName.length() + lastName.length();
       String login = lastName + firstName.charAt(0) + middleName.charAt(0);
       
       login = login.toLowerCase();
       
       System.out.println("Name: " + fullName + "\nNumber of characters in full name: " + characterCount + "\nLogin id: " + login);
   }
}
