/*First we have to create a file with .java extension
 class name and file name must be same and should start with Capital
 to extecute we to to run first javac filename.java it convert filename.java to filename.class file which can run on any os
 then run java filename for final execution
 javac convert file to machine readeable file
 */

 /** 
  types of data type

  1] primitive data type
  1.1 : integer type
        1.1.1 byte bits : 8 or bytes :2 space required (1 byte = 8 bits)
        1.1.2 short bits: 16
        1.1.3 int bits : 32
        1.1.4 long bits:64
  1.2 : floating type
        1.2.1 float bits:32
        1.2.2 double bits:64
  1.3 : character type
        1.3.1 char bits:16
  1.4 : boolean datatype
        1.4.1 boolean
  */

  /**
   declaration :
   two type of declaration of variable
   1. local declaration : 
   declaration made inside a method 
   local variable must be initialized to a value before it used

   2. class declaration:
   declaration made outside the class
   class variable is automatically assigned a default value
   */

   /*typecasting is also possible in java small var can be converted into large 
   but vice versa is not true */

// public class Main {
//     public static void main(String[] args) {
//       // System.out.println(2+4);
//       int x = 100;
//       int y = 20;
//       if(x>y){
//             System.out.println("is large" + x);
//       }
//       else{
//             System.out.println(y + "is large");
//       }
//     }
//   }

/*public private default and protected all are classifier */
/*all global variable occupy memory in heap memory all local var occupy memory in stack */

/*java method
 void means that this method does not have return value
 static method means that the method belongs to main class and not an object class
 */
// public class Main{
//       //Creathing a new method
//       static void mymethod(){
//             System.out.println("methos is executed");

//       }
//       public static void main(String[] args) {
//             // System.out.println("null");
//             mymethod(); //calling a method
            
//       }
// }

public class Main{
      static void mymethod(String fname){
            System.out.println(fname + " reference");
      }
      public static void main(String[] args) {

            mymethod("Value passed");

            
      }
}