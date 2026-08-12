// 1. Simple try-catch
// public class Main {
//     public static void main(String[] args) {
//         try {
//             int result = 10 / 0;
//             System.out.println(result);
//         } catch (ArithmeticException e) {
//             System.out.println("Cannot divide by zero");
//         }
//     }
// }


// 2. Handling Array Exception
// public class Main {
//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 30};

//         try {
//             System.out.println(numbers[5]);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array index is out of range");
//         }
//     }
// }


// 3. finally Block
// public class Main {
//     public static void main(String[] args) {
//         try {
//             int result = 10 / 2;
//             System.out.println("Result = " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Error occurred");
//         } finally {
//             System.out.println("Finally block executed");
//         }
//     }
// }


// 4. Multiple catch Blocks
// public class Main {
//     public static void main(String[] args) {
//         try {
//             int[] numbers = {10, 20, 30};
//             System.out.println(numbers[5]);
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic error");
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array index error");
//         }
//     }
// }


// 5. throw Keyword
// public class Main {
//     static void checkAge(int age) {
//         if (age < 18) {
//             throw new ArithmeticException("Age must be 18 or above");
//         }

//         System.out.println("Eligible");
//     }

//     public static void main(String[] args) {
//         checkAge(20);
//     }
// }


// 6. throws Keyword
// public class Main {

//     static void checkNumber() throws Exception {
//         System.out.println("Number checked");
//     }

//     public static void main(String[] args) throws Exception {
//         checkNumber();
//     }
// }


// 7. ArrayList
// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<String> names = new ArrayList<>();

//         names.add("Prem");
//         names.add("Rahul");
//         names.add("Amit");

//         System.out.println(names);
//     }
// }


// 8. ArrayList Operations
// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<>();

//         numbers.add(10);
//         numbers.add(20);
//         numbers.add(30);

//         System.out.println("ArrayList = " + numbers);
//         System.out.println("First element = " + numbers.get(0));

//         numbers.remove(1);

//         System.out.println("After removing = " + numbers);
//     }
// }


// 9. HashMap
// import java.util.HashMap;

// public class Main {
//     public static void main(String[] args) {
//         HashMap<Integer, String> students = new HashMap<>();

//         students.put(1, "Prem");
//         students.put(2, "Rahul");
//         students.put(3, "Amit");

//         System.out.println(students);
//     }
// }


// 10. Exception Handling with ArrayList
import java.util.ArrayList;

public class javaday7 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        try {
            System.out.println("Element: " + numbers.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }

        System.out.println("ArrayList: " + numbers);
    }
}