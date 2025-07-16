class Base extends Exception {
   public int bnum;
}
class Derived extends Base  {
   public int num;
}

public class Example1
{
  public static void main(String args[]) {
   try {
      throw new Derived();
   // } catch(Derived d) {
   //    System.out.println("Caught derived class exception");
   } catch(Base b) {
      System.out.println("Caught base class exception :"+b.bnum); 
   // } catch(Derived d) { 
   //    System.out.println("Caught derived class exception");
   }
  }
}
