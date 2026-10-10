public class Lemonade extends Drink {

// instantiated 3 private instance variables
  //to be used by every subclass
  private int numLemonSlices;

// no argument parameter constructor
  public Lemonade(){
    this ("lemon", 1, "small", 1);
  }

// argument parameter constuctors
  public Lemonade (String flavor, int numDrinks, String size, int numLemonSlices){
    super (flavor, numDrinks, size);
    this.numLemonSlices=numLemonSlices;
  }

  public Lemonade (String flavor, int numDrinks, String size){
    super (flavor, numDrinks, size);
    numLemonSlices=1;
  }

// acessor methods
  // allows users to access private variables
  public int getNumLemonSlices(){
    return numLemonSlices;
  }

// mutator methods
  //allows users to set value of variables
  public void setNumLemonSlices (int numLemonSlices){
    this.numLemonSlices=numLemonSlices;
  }

// toString() methods
  // prints all the info into a string
  public String toString(){
    return super.toString() + "\nNumber of Lemon Slices: " + numLemonSlices;
  } 
  
}