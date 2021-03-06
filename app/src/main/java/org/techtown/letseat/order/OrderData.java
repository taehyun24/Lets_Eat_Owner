package org.techtown.letseat.order;

public class OrderData {
    int orderId;
    String date, tableNumber, menu, request, price, orderCheck;

    public OrderData(String date, String tableNumber, String menu, String request,
                     String price, String orderCheck, int orderId) {
        this.date = date;
        this.tableNumber = tableNumber;
        this.menu = menu;
        this.request = request;
        this.price = price;
        this.orderCheck = orderCheck;
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public String getMenu() {
        return menu;
    }

    public String getRequest() {
        return request;
    }

    public String getPrice() {
        return price;
    }

    public String getOrderCheck() {
        return orderCheck;
    }

    public int getOrderId() {
        return orderId;
    }
}
