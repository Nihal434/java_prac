/* */
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

// import java.util.jar.Attributes.Name;

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

/*oops in java */
/*Class name always start with capital and method name start with small alphabet */

/*In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. 
At the time of calling constructor, memory for the object is allocated in the memory.

Using constructor we can use same parameter for different methods same as python
There are two rules defined for the constructor.
1. Constructor name must be the same as its class name
2. A Constructor must have no explicit return type
3. A Java constructor cannot be abstract, static, final, and synchronized
4. A Java constructor cannot be private, protected, public, or package-private
5. A Java constructor cannot be varargs

There are two types of constructors in Java:
1. Default constructor (no-arg constructor) : A constructor is called "Default Constructor" when it doesn't have any parameter.
2. Parameterized constructor : A constructor which has a specific number of parameters is called a parameterized constructor.
3. Copy constructor : A constructor which copy data one object to another it is user defined
In Java, a class can have only one default constructor.

Why use the parameterized constructor?
The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.


*/
// class pen{ //creating class
//       String type;
//       int price;
//       String color;
//       public void write(){ //method inside class
//             System.out.println(type + " of rupees " + price);
//       }
//       public void printColor(){
//             System.out.println("Pen of color is " + this.color);
//       }

// /*default constructor */
//       pen() { //name of class and constructor must be same one class have only one constructor
//             System.out.println(" Default Constructor created");
//       }
// }


// public class Main{
//       public static void main(String[] args) {

//             pen mypen = new pen(); //Creating an object
//             mypen.type = "Ball pen"; //assigning value to object
//             mypen.price = 100;
//             mypen.write(); //calling the method for object

//             // pen mypen2 = new pen(); //new word creates new location in heap memory
//             // mypen2.type = "Gel pen";
//             // mypen2.color = "Red";
//             // mypen2.printColor();

            
            
//       }
// }


/*Parametrized constructor */

// class Student{ //Creating class
//       String name;
//       int age;

//       Student(String name , int age){ //parametrized constructor
//             this.name = name;
//             this.age = age;
//       }

//       public void printinfo(){ //creating class method
//             System.out.println(name + " and " + age);
//       }

//       public void age(){
//             System.out.println("Name is " + name);
//       }

// }
// public class Main{
//       public static void main(String[] args) {
//             // System.out.println("d");

//             Student s1 = new Student("Nihal" , 20); //passing value to parmetrized constructor
//             s1.printinfo();
//             s1.age();
//       }
// }

/*Polymorphism : same function with different purpose two types
1.compile time : error come while compiling
2.run time: error come while running
 1.compile time polymorphism :

 for compile polymorphism at least one parameter should be different
 for example we cah have different passing parameter or different return type
 such as one can have void and one can have static 
 * 
 * 
 * compile time poly gives error while compiling te code which developer can handle while run time poly gives error while running means after
  production of application which will impact the user so try to use compile time poly instead of run time poly
 
*/

// class Student{
//       String name;
//       int age;


//       public void printinfo(int age){
//             System.out.println("age : " + age);
//       }

//       public void printinfo(String name){
//             System.out.println("name : " + name);
//       }

//       public void printinfo(String name , int age){
//             System.out.println("name : " + name +" and " + "age : " + age);
//       }
// }

// public class Main{
//       public static void main(String[] args) {
//             Student s1 = new Student();
//             s1.name = "nihal";
//             s1.age = 20;
//             s1.printinfo(s1.age);
//             s1.printinfo(s1.name);
//             s1.printinfo(s1.name,s1.age);

//       }
// }


/*Inheritance : Increases reusibility */

//1. single level inheritance

/*class Shape{
      String color;
      public void area(){
            System.out.println("Displays area");
      }
}

class Triangle extends Shape{   //Triangle class inheriting property of shape class
      public void area(int l,int h){
            System.out.println(0.5*l*h);

      }



}

class Main{
      public static void main(String[] args) {

            Triangle tri = new Triangle();
            tri.color = "red";
            tri.area(2,3 );
            
      }
}
*/

//2.Multilevel inheritance

/*class Shape{
      String color;
      public void areadis(){
            System.out.println("Displays color " + color);
      }
}

class Triangle extends Shape{   //Triangle class inheriting property of shape class
      public void area(int l,int h){
            System.out.println(0.5*l*h);

      }
}

class EquilateralTriangle extends Triangle{
      public void area(int l,int h){
            System.out.println(0.5*l*h);
            
      }
}

class Main{
      public static void main(String[] args) {

            EquilateralTriangle tri = new EquilateralTriangle();
            tri.color = "red";
            tri.area(2,3 );
            tri.areadis();
            
      }
}*/

//3. hierarchial inheritance : only one parent have multiple child

/*class Shape{ //Parent class
      String color;
      public void areadis(){
            System.out.println("Displays color " + color);
      }
}

class Triangle extends Shape{   //Triangle class inheriting property of shape class
      public void area(int l,int h){
            System.out.println(0.5*l*h);

      }
}

class EquilateralTriangle extends Shape{ //child class
      public void area(int l,int h){
            System.out.println(0.5*l*h);
            
      }
}

class Main{
      public static void main(String[] args) {

            EquilateralTriangle tri = new EquilateralTriangle();
            tri.color = "red";
            tri.area(2,3 );
            tri.areadis();
            
      }
}*/

//4. hybrid inheritance : combination of all types of inheritance


/*Packages
 two type : built in and user built packages
 */
/*import bank.*;

public class Main{
      public static void main(String[] args) {
            bank.Account acc1 = new bank.Account();
            acc1.name = "asa";

            
      }
}
*/
//Abstraction
/*abstraction : concept of hiding the implementation details
 can be done using interfaces or by building abstract classes 
*/

class Pen{
      
}
public class Main{
      public static void main(String[] args) {
            
      }

}




  



