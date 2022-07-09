package class25;

public class DDR4 {

    interface DDR3{
        void read();
        void write();
    }

    public interface DDr4 extends DDR3{

        void speed();
    }

    class SamsungRam implements DDr4{

        @Override
        public void read() {
            System.out.println("Reading speed is now 3GBp/s");
        }

        @Override
        public void write() {
            System.out.println("Writing speed is now 3GBp/s");
        }

        @Override
        public void speed() {
            System.out.println("Extra speed of 1GBPs");
        }
    }

}
