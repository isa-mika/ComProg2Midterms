public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Kouise", "Pomeranian");
        Dog dog2 = new Dog("Knel", "Samoyed Dog");


        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");


        dog1.setBreed("Toy Poodle");
        

        String originalName = dog2.getName();
        dog2.setName("Bucci");


        System.out.println("After updates:");
        System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
        System.out.println(originalName + " is now named " + dog2.getName() + ".");
    }
}
