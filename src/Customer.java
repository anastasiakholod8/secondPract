import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<String> orderedDishes;



    public void orderDishes(String dish, Menu menu) {
        if (menu.getDishes().contains(dish)) {
            orderedDishes.add(dish);
            System.out.println( " Замовник замовив:" + dish);

        } else {
            System.out.println(dish + "немає в меню");
        }
    }
        public void showOrders(){
            System.out.println( "Замовник замовив:"+orderedDishes);
        }
    }

