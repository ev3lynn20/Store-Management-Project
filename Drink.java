public class Drink {
 // instantiated 3 private instance variables
  //to be used by every subclass
  private String flavor;
  private int numDrinks;
  private String size;
  
// no argument parameter constructor
  public Drink(){
    this("strawberry", 1, "small");
  }

// argument parameter constuctors
  public Drink(String flavor, int numDrinks, String size){
    this.flavor=flavor;
    this.numDrinks=numDrinks;
    this.size=size;
  }

  public Drink(String flavor, int numDrinks){
    this.flavor=flavor;
    this.numDrinks=numDrinks;
    size="small";
  }

// acessor methods
  // allows users to access private variables
  public String getFlavor(){
    return flavor;
  }

  public int numDrinks(){
    return numDrinks;
  }

  public String getSize(){
    return size;
  }

// mutator methods
  //allows users to set value of variables
  public void setDrink(String flavor){
    this.flavor=flavor;
  }

  public void setNumDrinks(int numDrinks){
    this.numDrinks=numDrinks;
  }

  public void setSize(String size){
    this.size=size;
  }

// toString() methods
  // prints all the info into a string
  public String toString(){
    return "Flavor: " + flavor + "\nnumDrinks: " + numDrinks + "\nsize: " + size;
  }
  
}