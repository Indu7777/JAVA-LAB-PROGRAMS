import java.util.Scanner;

abstract class Shape{

double l,b,result;

void PrintArea() {

Scanner in=new Scanner(System.in);

System.out.println("enter 1st dimension(length for rectangle, base for triangle, radius for circle):");

l=in.nextDouble();

System.out.println("enter 2nd dimension(breadth for rectangle, height for triangle, zero for circle):");

b=in.nextDouble();

}

abstract void Calc();

}


class Rectangle extends Shape{

void Calc() {

result=l*b;

System.out.println(" area of rectangle is=" + result); 

}

}


class Triangle extends Shape{

void Calc() {

result=0.5*l*b;

System.out.println(" area of triangle is=" + result);

}

}


class Circle extends Shape{

void Calc() {

result=3.14*l*l;

System.out.println(" area of circle is=" + result);

}

}


class Main_Shape{

public static void main(String args[]) {

Rectangle r=new Rectangle();

r.PrintArea();

r.Calc();

Triangle t=new Triangle();

t.PrintArea();

t.Calc();

Circle c=new Circle();

c.PrintArea();

c.Calc();
System.out.println("Name:K Indu");
System.out.println("USN:1BM23CS131");


}

}

