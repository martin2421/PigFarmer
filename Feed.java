public class Feed {

     // Variables
    private boolean isFull;
    private double weight;
    private String nameFeed;
    
    // Getters & Setters
    public String getNameFeed() {
        return nameFeed;
    }
   
    public void setNameFeed(String nameFeed) {
        this.nameFeed = nameFeed;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFull() {
          return isFull;
    }
   
    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }
    
    // Decreases the amount of feed by 1.
    public void consume() {
        isFull = false;
    }
    
     // Name for the feed and a value representing the # of bins
    Feed(String nameFeed_p) {
        nameFeed = nameFeed_p;
        isFull = true;
    }

}
