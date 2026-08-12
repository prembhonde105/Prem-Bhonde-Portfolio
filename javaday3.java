// 1. Simple Method
// public class SimpleMethod {
//     static void greet() {
//         System.out.println("Hello from method");
//     }

//     public static void main(String[] args) {
//         greet();
//     }
// }


// 2. Method with a Parameter
// public class ParameterMethod {
//     static void greet(String name) {
//         System.out.println("Hello " + name);
//     }

//     public static void main(String[] args) {
//         greet("Prem");
//     }
// }


// 3. Method with Two Parameters
// public class AddMethod {
//     static void add(int a, int b) {
//         System.out.println("Sum = " + (a + b));
//     }

//     public static void main(String[] args) {
//         add(10, 20);
//     }
// }


// 4. Method with Return Value
// public class ReturnMethod {
//     static int add(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         int result = add(10, 20);
//         System.out.println("Result = " + result);
//     }
// }


// 5. Method to Find Square
// public class SquareMethod {
//     static int square(int number) {
//         return number * number;
//     }

//     public static void main(String[] args) {
//         System.out.println("Square = " + square(5));
//     }
// }


// 6. Create an Array
// public class ArrayExample {
//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 30, 40, 50};

//         System.out.println(numbers[0]);
//         System.out.println(numbers[1]);
//         System.out.println(numbers[2]);
//         System.out.println(numbers[3]);
//         System.out.println(numbers[4]);
//     }
// }


// 7. Array Traversal
// public class ArrayTraversal {
//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 30, 40, 50};

//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println(numbers[i]);
//         }
//     }
// }


// 8. Find Sum of Array Elements
// public class ArraySum {
//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 30, 40, 50};
//         int sum = 0;

//         for (int i = 0; i < numbers.length; i++) {
//             sum = sum + numbers[i];
//         }

//         System.out.println("Sum = " + sum);
//     }
// }


// 9. Find Largest Element in Array
// public class LargestArray {
//     public static void main(String[] args) {
//         int[] numbers = {10, 25, 15, 40, 30};
//         int largest = numbers[0];

//         for (int i = 1; i < numbers.length; i++) {
//             if (numbers[i] > largest) {
//                 largest = numbers[i];
//             }
//         }

//         System.out.println("Largest = " + largest);
//     }
// }


// 10. Method with Array
public class javaday3 {
    static void displayArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        displayArray(numbers);
    }
}