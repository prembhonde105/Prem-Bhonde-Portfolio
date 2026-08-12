// 1. Simple Inheritance
// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//         d.bark();
//     }
// }


// 2. Inheritance with Attributes
// class Person {
//     String name = "Prem";
// }

// class Student extends Person {
//     int age = 20;
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();

//         System.out.println("Name = " + s.name);
//         System.out.println("Age = " + s.age);
//     }
// }


// 3. Method Overriding
// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.sound();
//     }
// }


// 4. Method Overloading
// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Calculator c = new Calculator();

//         System.out.println(c.add(10, 20));
//         System.out.println(c.add(10, 20, 30));
//     }
// }


// 5. Multilevel Inheritance
// class Animal {
//     void eat() {
//         System.out.println("Animal eats");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// class Puppy extends Dog {
//     void play() {
//         System.out.println("Puppy plays");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Puppy p = new Puppy();

//         p.eat();
//         p.bark();
//         p.play();
//     }
// }


// 6. Runtime Polymorphism
// class Animal {
//     void sound() {
//         System.out.println("Animal sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal a = new Dog();

//         a.sound();
//     }
// }


// 7. Abstract Class
// abstract class Animal {
//     abstract void sound();

//     void eat() {
//         System.out.println("Animal eats");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();

//         d.sound();
//         d.eat();
//     }
// }


// 8. Interface
// interface Animal {
//     void sound();
// }

// class Dog implements Animal {
//     public void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();

//         d.sound();
//     }
// }


// 9. Multiple Interfaces
// interface Father {
//     void work();
// }

// interface Mother {
//     void cook();
// }

// class Child implements Father, Mother {

//     public void work() {
//         System.out.println("Child is working");
//     }

//     public void cook() {
//         System.out.println("Child is cooking");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Child c = new Child();

//         c.work();
//         c.cook();
//     }
// }


// 10. Complete OOP Example
abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {

    void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

public class javaday6 {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
        d.play();
    }
}