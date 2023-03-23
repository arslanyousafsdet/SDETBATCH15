package classPractice23;

public abstract class Computer {
    /*  Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
      Define common behavior within and some fields in parent class and override some of the methods in child classes
              Define some methods specific to child classes
              Create objects of child classes and store them into array. Loop through each object and execute available methods.
              [3:07 PM]*/
    abstract void battery();

    abstract void screen();}

    class Apple extends Computer {
        void battery() {
            System.out.println("Apple has 12 hours bettery");


        }

        void screen() {
            System.out.println("Apple has 16 inch screen");
        }

    }

    class Lenovo extends Computer {
        @Override
        void battery() {
            System.out.println("Lenovo has 10 hours bettery ");
        }

        @Override
        void screen() {
            System.out.println("Lenovo has 12 inch screen");
        }
    }

    class Hp extends Computer {
        @Override
        void battery() {
            System.out.println("Hp has 14 hours bettery");
        }

        @Override
        void screen() {
            System.out.println("Hp has 12 inch screen ");
        }
    }

   class Dell extends Computer {
        @Override
        void battery() {
            System.out.println("Dell has 16 hours bettery");
        }

        @Override
        void screen() {
            System.out.println("Dell has 16 inch screen");
        }
    }









