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


/*passing value to method */

// public class Main{
//       static void mymethod(String fname){
//             System.out.println(fname + " reference");
//       }
//       public static void main(String[] args) {

//             mymethod("Value passed");

            
//       }
// }

/*Passing multiple values to method */

// public class Main{
//       static void mymethod(String fname, int n){
//             System.out.println(fname + " age is " + n);
//       }
//       public static void main(String[] args) {

//             mymethod("Nihal",22);

            
//       }
// }

/*we use void when we dont return any thing */
/*if we want to return int then we have to use static int instead of static void */
/*whichever value we want to return we have to use it for int static int
 for double static double
 for string static string
 */

// public class Main{
//       static int mymethod(int x){
//             return 5 +x ;
            
//       }
//       public static void main(String[] args) {

//            System.out.println( mymethod(10));;

            
//       }
// }

/*Method overloading : With method overloading, multiple methods can have the same name with different parameters
*/
// public class Main{

//       static int plusmethod(int x, int y){
//             return x + y ;
//       }

//       static double plusmethod(double x, double y){
//             return x+ y ;
//       }
//       public static void main(String[] args) {

//             int mynum1 = plusmethod(10, 20);
//             double mynum2 = plusmethod(4.3, 3.4);
//             System.out.println("int " + mynum1);
//             System.out.println("double " + mynum2);
            
//       }
// }

/** taking Input from user */

// import java.util.Scanner;

// public class Main{
//       public static void main(String[] args) {
//             Scanner myObj = new Scanner(System.in);
//             System.out.println("Enter name, age and salary ");

//             String name = myObj.nextLine();

//             int age = myObj.nextInt();

//             double salary = myObj.nextDouble();

//             System.out.println("Name : " + name);
//             System.out.println("Age : " + age);
//             System.out.println("Salary : "  + salary);
//       }
// }
