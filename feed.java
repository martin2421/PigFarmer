Feed.java
public class Feed {

    // A private static int variable keeping track of the amount of feed that the farmer has in terms of number of bins
    private static int bins;

    String nameFeed;
    //int numBins;

    // A static public method named getAmount() that returns how many bins of feeed are left
    public static int getAmount() {
        bin = 0;
        return bins; 
    }

    // A public method called consume that decreases the amount of feed by 1. If the amount of feed is already 0 it 
    // prints a warning to the farmer that thr are no bins left to be consumed
    public void consum(){
        if (bins > 0) {
            bins--;
        } else{
            System.out.println("WARNING! \tNo more bins left to be consumed!")
        }
    }
    // A constructor that acceptss two parameters: A name for the feed which is of type tring, and an int value representing the number of bins
    Feed(String nameFeed_p, int numBin_p) {
        nameFeed = nameFeed_p;
        Bins += numBins_p;
    }

    // A public method called add which receives an int value and adds that to the number of bins
    public void add(int addBin) {
        bins += addBins;
    }


}
