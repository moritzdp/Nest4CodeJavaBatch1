public abstract class Bird {
  int height;
  int weight;
  String status;
  int sound; 


// whether birds sound same
  public abstract void sound();
  public abstract void swim();
// whether birds fly same
  public abstract void fly();

  public void eat() {
    System.out.println("Bird is eating");
  }

  public void sleep() {
    System.out.println("Bird is sleep");
  }


}
