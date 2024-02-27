public class Main {

    public static void main(String[] args) {

//    Item coke = new Item("drink", "coke",1.5);
//    coke.printItem();
//    coke.setSize("LARGE");
//    coke.printItem();
//
//    Item avocado = new Item("Topping","avocado",1.5);
//    avocado.printItem();

//        Burger burger =new Burger("regular",4.00);
//        burger.addTopping("BACON","CHEESE","MAYO");
//        burger.printItem(); // 6.5 = 2.5(topping) + 4(base price)



//        MealOrder regular =new MealOrder();
//        regular.addBurgerTopping("BACON","CHEESE","MAYO");
//        regular.setDrinkSize("LARGE");
//        regular.printItemizedList();

//        MealOrder secondMeal= new MealOrder("turkey","7-up","chili");
//        secondMeal.addBurgerTopping("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();


        MealOrder deluxeMeal =new MealOrder("deluxe","7-up","chili");
        deluxeMeal.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }


}
