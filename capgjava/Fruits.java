package fruitpack;

public class Fruits{

   protected String name;
   protected String color;
   protected int seed_no;


   public Fruits(){}
   public Fruits(String name, String color, int sno){
     this.name=name;
     this.color=color;
     this.seed_no=sno;
   }     

   public String toString(){
      return "Fruit Name : "+name+"\nColor : "+color;
   }
}