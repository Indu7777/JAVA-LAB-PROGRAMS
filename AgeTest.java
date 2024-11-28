import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class InputScanner {
    static Scanner s = new Scanner(System.in);
}

class Father {
    int fatherAge;

    public Father(int fatherAge) throws WrongAge {
        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
        this.fatherAge = fatherAge;
    }

    public void display() {
        System.out.println("Father's age: " + fatherAge);
    }
}

class Son extends Father {
    int sonAge;

    public Son(int fatherAge) throws WrongAge {
        super(fatherAge);  // Pass the father's age to the Father constructor

        System.out.print("Enter Son's age: ");
        sonAge = InputScanner.s.nextInt();

       
        if (sonAge < 0) {
            throw new WrongAge("Age cannot be negative");
        } else if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to father's age");
        }
    }

    public void display() {
        System.out.println("Son's age: " + sonAge);
    }
}


public class AgeTest {
    public static void main(String[] args) {
        try {
            System.out.print("Enter Father's age: ");
            int fatherAge = InputScanner.s.nextInt();

            Father father = new Father(fatherAge);
            father.display();

            Son son = new Son(fatherAge);
            son.display();

        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
