import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    String name, usn;
    double marks[] = new double[8];
    double credit[] = new double[8];

    void stdinfo() {
        System.out.print("Enter the name of the student:");
        name = sc.next();
        System.out.print("Enter the USN of the student:");
        usn = sc.next();

        System.out.print("Enter the marks of the student");
        for (int i = 0; i < 8; i++) {
   System.out.print("Subject "+(i+1)+":");
            marks[i] = sc.nextDouble();
        }
System.out.print("Enter the credits of the subjects respectively");
for (int i = 0; i < 8; i++) {
   System.out.print("Subject "+(i+1)+":");
   credit[i] = sc.nextDouble();
}
    }

    void printinfo() {
        System.out.print("Name of the student is " + name);
        System.out.print("USN: " + usn);
        System.out.print("The marks and credits of the subjects are:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Subject" + (i + 1) + ":" + marks[i] + " Credit: " + credit[i]);
        }
    }

    double sgpa() {
        double sum = 0;
        double cred = 0;
        for (int i = 0; i < 8; i++) {
            sum += calculateGrade(marks[i]) * credit[i];
            cred += credit[i];
        }
        return cred == 0 ? 0 : sum / cred;
    }

    int calculateGrade(double mark) {
        if (mark >= 90) return 10;
        if (mark >= 80) return 9;
        if (mark >= 70) return 8;
        if (mark >= 60) return 7;
        if (mark >= 50) return 6;
        if (mark >= 40) return 5;
        return 0;
    }
}

class Display {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.stdinfo();
        s1.printinfo();
        double sgh = s1.sgpa();
        System.out.println("The SGPA of the student is: " + sgh);
System.out.println("Name: K. Indu");
System.out.println("USN:1BM23CS131");
    }
}