package com.example.musical;

import java.util.List;

public class Order {
    private User user;
    private List<Product> products;
    private double totalPrice;
    private PaymentMethod paymentMethod;
    private OrderStatus status;

    public Order() {
        this.user = user;
        this.products = products;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.status = OrderStatus.PENDING;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
