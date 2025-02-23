public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Aki", 31, "45 Starry Street");
        Person person2 = new Person("Peach", 26, "101 George Lane");
        Person person3 = new Person("Ray", 29, "67 Pine Road");
        Person person4 = new Person("Geani", 23, "252 Michin Avenue");
        Person person5 = new Person("Zae", 36, "81 Col Street");


        Person[] people = {person1, person2, person3, person4, person5};


        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
            
        }
    }
}