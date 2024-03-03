import client.Client;
import order.CurrentOrder;
import order.Order;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Иванов", "Иван", "КН1111111", 21, new Date());
        Client client2 = new Client("Петров", "Пётр", "КН1111112", 22, new Date());
        Client client3 = new Client("Семёнов", "Семён", "КН1111113", 23, new Date());

        client1.addOrder(new Order("тормозная колодка", "bp123", 20.0));
        client1.addOrder(new Order("тормозной диск", "bd321", 50.0));

        client2.addOrder(new Order("амортизатор", "sa593", 30.5));
        client2.addOrder(new Order("лампа", "l125", 1.5));
        client2.addOrder(new Order("рачаг", "r645", 1.5));

        client3.addOrder(new Order("радиатор", "rd978", 40.0));
        client3.addOrder(new Order("фара", "l589", 60.0));

        CurrentOrder.addClientWithOrder(client1);
        CurrentOrder.addClientWithOrder(client2);
        CurrentOrder.addClientWithOrder(client3);

        CurrentOrder.printPairWithMapEntry();
        CurrentOrder.printPairWithIterator();
        CurrentOrder.printKeys();
        CurrentOrder.printValues();



    }
}
