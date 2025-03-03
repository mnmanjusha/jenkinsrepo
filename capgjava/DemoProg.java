import java.lang.*;
import java.util.*;

class DemoProg{
public static void displayCities(String city[]){
	System.out.println("Cities from an array");

	for(int i=0; i<city.length;i++)
	{

	   System.out.println(city[i]);
	}
}

public static String[] getCities(){

      //building Scanner class object to get input

      Scanner sc=new Scanner(System.in);

      System.out.println("Enter no of elements :");
      int size=sc.nextInt();

      String arr[]=new String[size];

     //array initialization by accepting input

        System.out.println("Enter Data : ");
        for(int i=0; i<size; i++){
           arr[i]=sc.next();
           }

       return arr;
}
public static void main(String args[]){


    String cities[]=getCities();


 	

        displayCities(cities);
 


}
}











