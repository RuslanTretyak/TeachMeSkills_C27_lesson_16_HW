package order;

public class Order {
    private String description;
    private String article;
    private double price;

    public Order(String description, String article, double price) {
        this.description = description;
        this.article = article;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Заказ: " + description + ", арт. " + article + ", стоимость " + price;
    }
}
