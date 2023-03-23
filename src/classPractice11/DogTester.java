package classPractice11;

public class DogTester {
   /* Create a Dog Class and create 3 different objects of it:
   Husky, Bulldog, Labrador  with specific  attributes and behaviors.
    */

    public static void main(String[] args) {
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Dog dog3=new Dog();
        dog1.name="Kanjer";
        dog1.breed="Husky";
        dog1.color="White";
        dog1.loyal=true;

        dog2.name="Munger";
        dog2.breed="Labador";
        dog2.color="Brown";
        dog2.size="large";

        dog3.name="Lyla";
        dog3.breed="Bulldog";
        dog3.sex='F';
        System.out.println(dog2.breed);
        System.out.println(dog1.name);
        System.out.println(dog3.sex);
        dog1.sleep();
        dog2.play();
        dog3.speak();

    }

        }


