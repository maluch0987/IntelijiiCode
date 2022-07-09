package class23;

public class CarTester {
    public static void main(String[] args) {
       /* Car car=new Tesla();
        car=new Toyota();//re-assing the value
        car.start();*/
      /*  BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();
        Tesla tesla=new Tesla();
        tesla.start();
        tesla.park();
        tesla.stop();
        Toyota toyota=new Toyota();
        toyota.park();
        tesla.stop();
        tesla.start();*/

        /*Car car=new BMW();
        car.park();
        car.start();
        car.stop();*/
        Car[]cars={new BMW(),new Tesla(),new Toyota()};
        for(Car c:cars){
            c.stop();
            c.park();
            c.start();
        }
    }
}
