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

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("dog walk");
    }
}
