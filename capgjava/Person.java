class Person{
     //instance variables
     protected String pname;
     protected static final String address="Pune";
     protected int age;

     static{
         System.out.println("static of Person");
      }
     //setters
     void setPname(String pname){
         this.pname=pname;
      }
     /*void setAddress(String address){
         
         this.address=address;
        }*/
     void setAge(int age){
         this.age=age;
        }
     //getters
     String getPname(){
         return pname; }
     
     String getAddress(){
	 return address; }
     int getAge(){
	 return age;}

     //business logic

     Person checkAge(Person p){
          if(age < p.age){
             //System.out.println(pname +" is younger than "+p.pname);
              return this;  
            }
          else if(p.age<age){
             //System.out.println(p.pname +" is younger than "+pname);
              return p;
            }
          else{
             //System.out.println(pname +" and "+p.pname+" have same age");
             return null;
             }  
          }

     public String toString(){
         return "\nName : "+pname+"\nAddress : "+address+"\nAge : "+age;
        }

}
	
  
 

     



