public class CopyConstructor {
    static class Person{
        String name;
        int age;

        // Default constructor
       Person(){
            this.name = "Unknown";
            this.age = 0;
        }

        //Perameterized constructor
        Person(String name, int age){
           this.name = name;
           this.age = age;
        }

        //copy constructor
         Person(Person otherPerson){
           this.name = otherPerson.name;
           this.age = otherPerson.age;
        }

        void Display(){
            System.out.println("Name : "+this.name);
            System.out.println("Age : "+this.age);
        }

    }

    public static void main(String[] args) {
        Person person3 = new Person();
        person3.name = "Bruce Wayne";
        person3.age = 35;

        Person person1 = new Person("Tony",23); //paramerterized constructor
        Person person2 = new Person(person1);

        person3.Display();
        person1.Display();
        System.out.println("Copy constructor");
        person2.Display(); // copy constructor called
    }
}
