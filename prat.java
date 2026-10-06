public class prat{
    public static void main(String[] args){
      Pen p1=new Pen();
      Pen p2=new Pen("Red");
      System.out.println(p2.color);
       Pen p3=new Pen(5);
       System.out.println(p3.tip);

    }
}

class Pen{
    String color;
    int tip;
    Pen(){
        System.out.println("default constructor is called");
    }
    Pen(String color){
        this.color=color;
    }
    Pen(int tip){
        this.tip=tip;
    }
}