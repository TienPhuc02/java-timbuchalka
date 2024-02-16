// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    //inheritance
    Animal animal =new Animal("Generic Animal","Huge",400);
    doAnimalStuff(animal ,"slow");

    Dog dog =new Dog();
    doAnimalStuff(dog,"fast");
    //null null null....
    Dog yorkie= new Dog("yorkie" , 15);doAnimalStuff(yorkie,"fast");
    Dog retriever=new Dog("Labrador Retriever",65,"Floppy","Swimmer");
    doAnimalStuff(retriever,"slow");
    Dog wolf = new Dog("Wolf",40);
    doAnimalStuff(wolf,"slow");

    Fish goldie =new Fish("GoldFish",0.25,2,3);
    doAnimalStuff(goldie,"fast");
    }
    public  static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}