package com.matteonegri.subscription_tracker;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Subscription {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Double cost;
    private String date;
    private String category;
    private String paymentMethod;


    public Subscription(String name, Double cost,String date, String category, String paymentMethod){
        this.name = name;
        this.cost = cost;
        this.date = date;
        this.category = category;
        this.paymentMethod = paymentMethod;
    }

    public Subscription() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getId() {
        return id;
    }
}
