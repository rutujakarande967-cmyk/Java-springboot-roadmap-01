package Day_06;
// Methods in java

/*public class WelcomeMessage {
   void displayWelcomeMessage(){
        System.out.println(" =========== WELCOME TO JAVA APPLICATION ==============");
    }
    public static void main(String[]args){
       // WelcomeMessage obj = new WelcomeMessage();
        //obj.displayWelcomeMessage();
    }
}
*/
// Make the method static then dont need to create an object

public class WelcomeMessage{
   static void displayWelcomeMessage(){
       System.out.println("======================================");
       System.out.println("WELCOME TO JAVA APPLICATION");
       System.out.println("======================================");
   }
   public static void main(String[]args){
       displayWelcomeMessage();        // a static method can be called directly from main()
   }
}


