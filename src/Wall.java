public class Wall {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Wall(){
        System.out.println("Wall constructor empty called.");
    }

    public Wall(double width,double height){
        if(width<0){
            this.width=0.0;
        } else if(height<0){
            this.height=0.0;
        }
        setWidth(width);
        setHeight(height);
    }
    public void setWidth(double width) {
        this.width = width;
        if(width<0){
            this.width=0.0;
        }
    }
    public void setHeight(double height) {
        this.height = height;
        if (height<0){
            this.height=0.0;
        }
    }
    public double getArea(){
        if(this.height<0){
            this.height=0;
        } else if(this.width<0){
            this.width=0;
        }
        return this.height*this.width;
    }
}
