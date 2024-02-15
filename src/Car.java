public class Car {
    private String make="Tesla ";
    private String model ="Model X ";
    private String color = "Gray "; // private nen Main.java khong the dat gia tri
    private int doors=2;
    private boolean convertible=true;
    //code -> generate -> getter
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


    //setter

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMake(String make){
//        this.make =make;
        if(make==null ) make="Unkown";
        String lowerCaseMake=make.toLowerCase();
        switch (lowerCaseMake){
            case "holden","porsche","tesla" -> this.make=make;
            default -> {
                this.make ="Unsupported";
            }
        }
    }
    // đóng gói là kiểu không cho phép truy cập ở ngoài -> phải đi qua kieerm soát
    public void describeCar(){
        System.out.println(make + " " + model + " " + color + " " + doors+ " " +  (convertible ? "convertible ":""));
    }
    // làm sao để làm mới casc giá trị thuộc tính mỗi khi tạo mới 1 ô tô? -> để public các thuộc tính trong class
}
