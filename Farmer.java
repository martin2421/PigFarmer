import java.time.LocalDate;
import java.util.Scanner;

public class Farmer {
    
    public static void public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // Variables
        int appleBins = 0;
        int potatoBins = 0; 
        char choiceChar;

        // Create two different types of feed, for example apple and patato
        Feed feed1 = new Feed("Apple", 5);
        Feed feed2 = new Feed("Potato", 10);

        // Create 3 different pigs
        Pig pig1 = new Pig("Junhan", 'M', "Red", LocalDate.of(2001, 10, 15));
        Pig pig2 = new Pig("Zichen", 'M', "Green", LocalDate.of(2002, 3, 10));
        Pig pig3 = new pig("martain", 'M', "Blue", LocalDate.of(2001, 12, 14));

        // Create a user input loop that asks the farmer to enter the following
        // information

        // How many new bins of apple do you have?
        System.out.println("How many new bins of " + feed1.nameFeed + "do you have?");
        do {
            while (!console.hasNextInt()) {
                System.out.println("Whoops! Try that again...")
                console.nextLine();
            }
            appleBins = console.nextInt();
            if (appleBins <0) {
                system.out.println("Number can't be negative. Try againg...")
        } while (appleBins < 0);

        // How many new bins of potato do you have
        System.out.println("How many new bins of " + feed1.nameFeed + "do you have?");
        do {
            while (!console.hasNextInt()) {
                System.out.println("Whoops! Try that again...")
                console.nextLine();
                potatoBins = console.nextInt();
                if (potatoBins <0) {
                    system.out.println("Number can't be negative. Try againg...")
            }
        } while (potatoBins < 0);

        // Would you like to feed the pigs?(Y/N)
        System.out.println("Would you like to feed the pigs?\t(Y/N)");
        do {
            choiceChar = console.next();
            choiceChar = choiceStr.toUpprtCase();
            choiceChar = choiceStr.charAt(0);

            if (choiceChar != 'Y' && choiceChar != 'N') {
                System.out.println("Wrong letter. Try Again...");
            }

        // If the answer is yes, pass the feed to each pig to consume
            if (choiceChar == 'Y') {
                pig1.feed(feed1);
                pig2.feed(feed2);
                pig3.feed(feed2);
            } else if (choiceChar == 'N') {
                break;
            }

        } while (choiceChar != 'Y' && choiceChar != 'N');

         console.close();

    }

}
    
