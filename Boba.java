public class Boba extends Drink {

// instantiated 3 private instance variables
  //to be used by every subclass
  private boolean hasBoba;

// no argument parameter constructor
  public Boba(){
    this ("milk tea", 1, "small", false);
  }

// argument parameter constuctors
  public Boba (String flavor, int numDrinks, String size, boolean hasBoba){
    super (flavor, numDrinks, size);
    this.hasBoba=hasBoba;
  }

  public Boba (String flavor, int numDrinks, String size){
    super (flavor, numDrinks, size);
    hasBoba=false;
  }

// acessor methods
  // allows users to access private variables
  public boolean getHasBoba(){
    return hasBoba;
  }

// mutator methods
  //allows users to set value of variables
  public void setHasBoba (boolean hasBoba){
    this.hasBoba=hasBoba;
  }

// toString() methods
  // prints all the info into a string
  public String toString(){
    return super.toString() + "\nHas boba: " + hasBoba;
  } 
  
}