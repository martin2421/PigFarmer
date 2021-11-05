import java.time.LocalDate;

public class Pig {

    // A private static variable keeping track of the number of pigs that the farmer has
    private static int count = 0; 

    // A private boolean variable called isFemale that is set in constructor as well
    private boolean isFemale; 

    private String name, color;
    private char sex;
    private LocalDate date;

    // A static public method named getCount()
    public static int getCount() {
        return count;
    }

    // Getters
    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public char getSex() {
        return sex;
    }

    public String getColor() {
        return color;
    }

    // A public method called isFemale that return true if pig is female
    public boolean isFemale() {
        boolean answer = false;
        return answer;
    }

    // A constructor that accepts name, sex and color of each pig. The constructor
    // also sets the date of birth for the pig to the current date
    // Color of pig which is a string set when initialized using the constructor
    Pig(String name_p, char sex_p, String color_p, LocalDate date_p) {
        name = name_p;
        sex = sex_p;
        color = color_p;
        date = date_p;
    }

    // A method feed that accepts an object of type Feed and calls the method
    // consume on the object
    public void feed(Feed feedObj) {
        feedObj.consume();
    }

}
