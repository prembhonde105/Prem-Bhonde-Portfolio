// 1. Integer Variable
// public class IntegerExample {
//     public static void main(String[] args) {
//         int age = 20;
//         System.out.println("Age = " + age);
//     }
// }


// 2. Different Data Types
// public class DataTypes {
//     public static void main(String[] args) {
//         int age = 20;
//         double height = 5.8;
//         char grade = 'A';
//         boolean student = true;
//         String name = "Prem";

//         System.out.println("Name = " + name);
//         System.out.println("Age = " + age);
//         System.out.println("Height = " + height);
//         System.out.println("Grade = " + grade);
//         System.out.println("Student = " + student);
//     }
// }


// 3. Changing the Value of a Variable
// public class ChangeValue {
//     public static void main(String[] args) {
//         int number = 10;

//         System.out.println("Before = " + number);

//         number = 20;

//         System.out.println("After = " + number);
//     }
// }


// 4. Addition of Two Numbers
// public class Addition {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;

//         System.out.println("Sum = " + (a + b));
//     }
// }


// 5. Basic Arithmetic Operators
// public class Arithmetic {
//     public static void main(String[] args) {
//         int a = 20;
//         int b = 10;

//         System.out.println("Addition = " + (a + b));
//         System.out.println("Subtraction = " + (a - b));
//         System.out.println("Multiplication = " + (a * b));
//         System.out.println("Division = " + (a / b));
//         System.out.println("Remainder = " + (a % b));
//     }
// }


// 6. Taking Integer Input
// import java.util.Scanner;

// public class IntegerInput {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         System.out.println("Your age is " + age);
//     }
// }


// 7. Taking String Input
// import java.util.Scanner;

// public class StringInput {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();

//         System.out.println("Hello " + name);
//     }
// }


// 8. Relational Operators
// public class Relational {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;

//         System.out.println(a > b);
//         System.out.println(a < b);
//         System.out.println(a == b);
//         System.out.println(a != b);
//     }
// }


// 9. Logical Operators
// public class Logical {
//     public static void main(String[] args) {
//         int age = 20;

//         System.out.println(age > 18 && age < 30);
//         System.out.println(age < 18 || age > 60);
//         System.out.println(!(age < 18));
//     }
// }


// 10. Simple Calculator with User Input
import java.util.Scanner;

public class javaday2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
    }
}
