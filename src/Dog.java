public class Dog extends  Animal{
    private String earShape;
    private String tailShape;
    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<15 ? "small" :(weight<35 ?"medium":"large"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
    public Dog(String type,double weight ){
        this(type,weight,"Perky","Curled");
    }
    public Dog(){
        super("Mutt","Big",50); // goi ham tao cua Animal
    }


    public void makeNoise() {
        if(type=="Wolf"){
            System.out.println("ow wooo ! Wolf");
        }
        bark();
//        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("dog walk");
        if(speed=="slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }
    private void bark(){
        System.out.println("woof!   ");
    }
    private void run(){
        System.out.println("Dog running....");
    }
    private void walk(){
        System.out.println("Dog walking....");
    }
    private void wagTail(){
        System.out.println("Dog wagTailing....");
    }
}
