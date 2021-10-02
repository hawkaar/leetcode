package src;

/**
 * test
 */
public class test {

}

class Animal {
  public int length = 2;
}

class Jellyfish extends Animal {
  public int length = 5;

  public static void main(String[] args) {
    Jellyfish jellyfish = new Jellyfish();
    Animal animal = new Jellyfish();
    System.out.println(jellyfish.length);
    System.out.println(animal.length);
  }
}


class Parent{

}

class Child extends Parent{

public static void main(String[] args) {

  Parent p = new Parent();
  Child c = new Child();

  System.out.println(c instanceof Child);
  System.out.println(p instanceof Parent);
}

}


abstract class thisis{
  private void fly() { System.out.println("Bird is flying"); }
}


abstract interface thi{
  
}