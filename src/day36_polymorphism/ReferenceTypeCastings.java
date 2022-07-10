package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.Developer;
import day33_abstraction.employeeTask.Driver;
import day33_abstraction.employeeTask.Employee;
import day33_abstraction.employeeTask.Tester;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

       Dog dog = new Dog();

      // Cat cat = new Dog();

        Animal animal = (Animal) new Dog(); // implicit casting

        System.out.println("-----------------------------------------------------");

        Animal animal1 = new Dog(); //upcasting ==> Polymorphism
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();

        (  (Dog)animal1  ).bark();  // down casting

      //  Dog dog1 = (Dog)animal1; // down casting
     //   dog1.bark();

      //  ( (Cat)animal1).scratch(); // Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat


        System.out.println("-------------------------------------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Blue", 350);

        phone.call(911);
        phone.text(123456);
        ((Nokia) phone).selfDefense();

    //    ( (IPhone)phone ).faceTime(123456); // Nokia can not be converted to Iphone, because there is not "IS A" relationship between Nokia and Iphone

        ((Nokia) phone).selfDefense();


        System.out.println("-------------------------------------------------------------");

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work();

        System.out.println( ((Developer) employee).getProgrammingLanguage() );


    //    Driver driver = (Driver) employee;




    }

}
