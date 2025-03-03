class Test{
public static void meth(boolean b1){
  System.out.println("Boolean");
}

public static void meth(byte b1){
  System.out.println("Byte");
}

public static void meth(int b1){
  System.out.println("int");
}

public static void main(String args[]){
 byte b;

   meth(b=1);
    System.out.println(b);
   meth(b==1);
    
}
}