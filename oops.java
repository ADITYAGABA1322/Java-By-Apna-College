


// import java.util.*;


// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("Writing...");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
// }

// class Student{
//     String name;
//     int age;
//     public void  printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);

//     }
//     // Student(String name , int age){
//     //     this.name = name;
//     //     this.age = age;
//     // }
//     // COPY CONSTRUCTOR
//     Student(Student s2){
//         this.name  = s2.name;
//         this.age = s2.age;
//     }
//     Student(){

//     }
// }
   





// public class oops{
//     public static void main(String[] args){
//         // Pen p = new Pen();
//         // p.color = "blue";
//         // p.type = "ballpoint";
//         // p.write();
//         // Pen p1 = new Pen();
//         // p1.color = "red";
//         // p1.type = "gel";

//         // p.printColor();
//         // p1.printColor();
//             Student s1 = new Student();
//             s1.name = "Rohan";
//             s1.age = 20;
//             //s1.printInfo();
     
//             Student s2 = new Student(s1);
//             s2.printInfo();

      

//     }

// }



// import java.util.*;


// class Student{
//     String name;
//     int age;
//     // Polymorphism
//     public void  printInfo(String name){
//         System.out.println(name);
//     }
//     public void  printInfo(int age){
//         System.out.println(age);
//     }
//     public void  printInfo(String name  , int age ){
//         System.out.println(name + " " + age);      
//     }
// }
   


// public class oops{
//     public static void main(String[] args){
      
//         Student s1 = new Student();
//         s1.name = "Rohan";
//         s1.age = 20;
//         s1.printInfo(s1.name  , s1.age);

//     }

// }


// Inheritance



// import java.util.*;

// class Shape{
//     String color;
// }

// class Triangle extends Shape {

// }

// public class oops{
//     public static void main(String[] args){
//         Triangle t1 = new Triangle();
//         t1.color = "red";
//         System.out.println(t1.color);
//     }
// }


// Single Level Inheritance


import java.util.*;

class Shape{
    public void area(){
        System.out.println("Area of shape");
    }
}

class Triangle extends Shape {
    public void area(int  l , int h){

        System.out.println(1/2*l*h);
    }
}


// Hirerchal Inheritance 

class circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
// Multi Level  Inheritance


// class EquilateralTriangle extends Triangle{
//     public void area(int l , int h){
//         System.out.println(1/2*l*h);
//     }
// }



public class oops{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
     
        

    }
}

