package com.jsp.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
	@Column(nullable=false)
   private String item;
	@Column(nullable=false)
   private double cost;
	@CreationTimestamp
   private LocalDateTime ordertime;
	@UpdateTimestamp
   private LocalDateTime deltime;
   @Column(nullable=false)
   private String address;
   @ManyToOne
   @JoinColumn(name="customer_id")
   private Customer customer;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public LocalDateTime getOrdertime() {
	return ordertime;
}
public void setOrdertime(LocalDateTime ordertime) {
	this.ordertime = ordertime;
}
public LocalDateTime getDeltime() {
	return deltime;
}
public void setDeltime(LocalDateTime deltime) {
	this.deltime = deltime;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@Override
public String toString() {
	return "FoodOrder [id=" + id + ", item=" + item + ", cost=" + cost + ", ordertime=" + ordertime + ", deltime="
			+ deltime + ", address=" + address + "]";
}
   
   

}
