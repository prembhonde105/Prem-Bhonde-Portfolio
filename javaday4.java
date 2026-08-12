// 1. Simple if Statement
// public class IfExample {
//     public static void main(String[] args) {
//         int age = 20;

//         if (age >= 18) {
//             System.out.println("You are an adult");
//         }
//     }
// }


// 2. if-else Statement
// public class IfElseExample {
//     public static void main(String[] args) {
//         int number = 10;

//         if (number > 0) {
//             System.out.println("Positive number");
//         } else {
//             System.out.println("Negative number");
//         }
//     }
// }


// 3. Nested if Statement
// public class NestedIf {
//     public static void main(String[] args) {
//         int age = 20;
//         boolean idCard = true;

//         if (age >= 18) {
//             if (idCard) {
//                 System.out.println("Entry allowed");
//             }
//         }
//     }
// }


// 4. else-if Ladder
// public class ElseIfExample {
//     public static void main(String[] args) {
//         int marks = 75;

//         if (marks >= 90) {
//             System.out.println("Grade A");
//         } else if (marks >= 75) {
//             System.out.println("Grade B");
//         } else if (marks >= 50) {
//             System.out.println("Grade C");
//         } else {
//             System.out.println("Fail");
//         }
//     }
// }


// 5. switch Statement
// public class SwitchExample {
//     public static void main(String[] args) {
//         int day = 2;

//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//         }
//     }
// }


// 6. for Loop
// public class ForLoop {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(i);
//         }
//     }
// }


// 7. while Loop
// public class WhileLoop {
//     public static void main(String[] args) {
//         int i = 1;

//         while (i <= 5) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }


// 8. do-while Loop
// public class DoWhileLoop {
//     public static void main(String[] args) {
//         int i = 1;

//         do {
//             System.out.println(i);
//             i++;
//         } while (i <= 5);
//     }
// }


// 9. break and continue
// public class BreakContinue {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 10; i++) {

//             if (i == 5) {
//                 continue;
//             }

//             if (i == 8) {
//                 break;
//             }

//             System.out.println(i);
//         }
//     }
// }


// 10. Menu-Driven Program using switch
import java.util.Scanner;

public class javaday4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                System.out.println("Result = " + (a / b));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}