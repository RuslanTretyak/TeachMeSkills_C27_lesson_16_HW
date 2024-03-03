package client;

import order.Order;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
    private String name;
    private String surname;
    private String passNumber;
    private int age;
    private Date dateOfReg;
    private List<Order> orderList;

    public Client(String name, String surname, String passNumber, int age, Date dateOfReg) {
        this.name = name;
        this.surname = surname;
        this.passNumber = passNumber;
        this.age = age;
        this.dateOfReg = dateOfReg;
        this.orderList = new ArrayList<>();
    }
    public void addOrder(Order order) {
        this.orderList.add(order);
    }

    public String getPassNumber() {
        return passNumber;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return "Клиент " + name + " " + surname + ", возраст " + age + ", дата регистрации " + sdf.format(dateOfReg) +
                ", текущие заказы: " + orderList;
    }
}
