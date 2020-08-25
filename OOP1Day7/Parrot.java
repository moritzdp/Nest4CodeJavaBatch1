//Parrot is extending / inheriting from Bird

public class Parrot extends Bird implements FlyBehavior {

  public void sound(){
    System.out.println("parrot is talking like human");
  }

    @Override
  public void swim(){
    System.out.println("parrot cannot swim");
  }

  public void fly(){
    System.out.println("parrot can fly");
  }
  
}
