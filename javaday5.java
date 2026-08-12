// 1. Create a Class
// class Student {
//     String name;
//     int age;
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();
//         System.out.println("Student object created");
//     }
// }


// 2. Create an Object
// class Student {
//     String name = "Prem";
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();

//         System.out.println("Name = " + s.name);
//     }
// }


// 3. Class with Attributes
// class Student {
//     String name = "Prem";
//     int age = 20;
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();

//         System.out.println("Name = " + s.name);
//         System.out.println("Age = " + s.age);
//     }
// }


// 4. Class with a Method
// class Student {
//     void display() {
//         System.out.println("Welcome to Java OOP");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.display();
//     }
// }


// 5. Constructor
// class Student {

//     Student() {
//         System.out.println("Object Created");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();
//     }
// }


// 6. Constructor with Parameters
// class Student {
//     String name;
//     int age;

//     Student(String n, int a) {
//         name = n;
//         age = a;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student("Prem", 20);

//         System.out.println("Name = " + s.name);
//         System.out.println("Age = " + s.age);
//     }
// }


// 7. Encapsulation
// class Student {
//     private int age;

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public int getAge() {
//         return age;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();

//         s.setAge(20);

//         System.out.println("Age = " + s.getAge());
//     }
// }


// 8. Access Modifiers
// class Student {
//     public String name = "Prem";
//     private int age = 20;

//     public void displayAge() {
//         System.out.println("Age = " + age);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();

//         System.out.println("Name = " + s.name);
//         s.displayAge();
//     }
// }


// 9. this Keyword
// class Student {
//     String name;
//     int age;

//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     void display() {
//         System.out.println("Name = " + this.name);
//         System.out.println("Age = " + this.age);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student("Prem", 20);

//         s.display();
//     }
// }


// 10. Student Class using OOP
class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class javaday5 {
    public static void main(String[] args) {
        Student s = new Student("Prem", 20);

        s.display();
    }
}