//**
  // printing the states of various instantiated objects

public class StoreRunner {
  public static void main(String[] args) {

  Drink plainDrink = new Drink();
    System.out.println(plainDrink);
    System.out.println();
      Drink flavorDrink= new Drink("chocolate", 2, "medium");
      System.out.println(flavorDrink);
      System.out.println();

   Boba plainBoba = new Boba();
    System.out.println(plainBoba);
    System.out.println();
      Boba flavorBoba= new Boba("coffee", 3, "small", true);
      System.out.println(flavorBoba);
      System.out.println();
      Boba anotherBoba = new Boba("green apple", 1, "large");
      System.out.println(anotherBoba);
      System.out.println();

   Lemonade plainLemonade = new Lemonade();
    System.out.println(plainLemonade);
    System.out.println();
      Lemonade flavorLemonade= new Lemonade("blueberry", 2, "small");
      flavorLemonade.setNumLemonSlices(5);
      System.out.println(flavorLemonade);
      System.out.println();  
  }
}