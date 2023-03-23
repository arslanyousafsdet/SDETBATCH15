package classPractice23;




public abstract class ComputerTester {
    public static void main(String[] args) {
        Computer []computer={new Apple(),new Lenovo(),new Hp(),new Dell()};

        for (Computer com:computer
             ) {
          com.battery();
          com.screen();

        }
    }
}