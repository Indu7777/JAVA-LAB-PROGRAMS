import java.util.Scanner;
class Quadratic{

int a,b,c;
double r1,r2,d;
void get()
{
Scanner in= new Scanner(System.in);
System.out.println("enter a");
a=in.nextInt();
System.out.println("enter b");
b=in.nextInt();
System.out.println("enter c");
c=in.nextInt();
}
void compute() 
{
if(a==0) {
System.out.println("value of a cannot be 0");
}
else {
d=(b*b)-(4*a*c);

if(d==0) {
r1=(-b)/(2*a);
System.out.print("roots are equal");
System.out.print("first and seconf roots are "+ r1);
}
else if(d>0) {
r1=(-b + Math.sqrt(d))/(2*a);
r2=(-b - Math.sqrt(d))/(2*a);
System.out.print("roots are real and distnct");
System.out.print("first root is" + r1 + " and second root is " + r2);
}
else 
{
double real=(-b)/(2*a);
double imaginary=((Math.sqrt(-d)))/(2*a);
System.out.print("roots are imaginary");
System.out.print("first root is" + real + "+" + imaginary +"i");
System.out.print("second root is" + real + "-" + imaginary +"i");
}
}
}
}
class QuadraticMain
{
public static void main(String s[])
{
Quadratic quad=new Quadratic();
quad.get();
quad.compute();
System.out.print("Name=Jiya Gupta");
System.out.print("USN=1BM23CS127");
}
}


 


