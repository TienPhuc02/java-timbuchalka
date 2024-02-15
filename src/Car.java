public class Car {
    private String make="Tesla ";
    private String model ="Model X ";
    private String color = "Gray "; // private nen Main.java khong the dat gia tri
    private int doors=2;
    private boolean convertible=true;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake() {
        return make;
    }

    public void describeCar(){
        System.out.println(make + model + color +" " + doors+" " +  (convertible ? "convertible ":""));
    }
    // làm sao để làm mới casc giá trị thuộc tính mỗi khi tạo mới 1 ô tô? -> để public các thuộc tính trong class
}
