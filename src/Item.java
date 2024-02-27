public class Item {
    private String type;
    private String name;
    private double price;
    private String size ="MEDIUM";


    public String getName() {
        if(type.equals("SIZE")||type.equals("DRINK")){
            return this.size + " " + this.name;
        }
        return this.name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice(){
        return switch (size){
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE"->getBasePrice()+1;
            default -> getBasePrice();
        };
    }
    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;

    }
    public static void  printItem(String name ,double price){
        System.out.printf("%20s:%6.2f%n",name ,price);
    }
    public void printItem(){
        printItem(getName(),getAdjustedPrice());
    }
}
