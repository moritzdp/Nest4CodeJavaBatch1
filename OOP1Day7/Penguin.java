public class Penguin extends Bird implements SwimBehavior {
  public void sound() {
    System.out.println("Penguin is honking");
  }
  
  public void swim(){
    System.out.println("penguins can swim");
  }

     @Override
  public void fly(){
    System.out.println("penguins cannot fly");
  }


}
