class TestPerson{

   static{
    System.out.println("This will be done 1st");
    }
public static void main(String args[]){

//instance building

Person p1=new Person();



p1.setPname("Vaishali"); 
//  p1.setAddress("Nagpur");

   p1.setAge(20);
System.out.println("p1's data");
System.out.println(p1);


Person p2=new Person();


System.out.println("p2's data");
p2.setPname("Vishnu");
// p2.setAddress("Kerala");  
 p2.setAge(22);

System.out.println(p2);


Person p=p1.checkAge(p2);

if(p==null){
  System.out.println("Both have same age");
   }
else{
   System.out.println(p.getPname()+" is younger ");
    }
  


System.out.println("p1's data");

System.out.println(p1);

  
}

 static{
       System.out.println("2nd Block");
      }

}