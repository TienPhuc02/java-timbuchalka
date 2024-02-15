// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Car car =new Car();
//        car.make="Porche";//error vì không thể đặt giá trị các thuộc tính vì các thuộc tính trong class Car đang private
//        System.out.println(car.make);// error vì không thể truy cập các giá trị thuộc tính trong class vì  các thuộc tính đang để private
        System.out.println("make = " + car.getMake()); // lấy được giá trị private trong class vì có hàm trả về giá trị đó để public
        car.describeCar();

    }
}