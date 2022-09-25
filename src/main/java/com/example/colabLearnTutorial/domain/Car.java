package com.example.colabLearnTutorial.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String brand, model, color, registerNumber;
    private int year, price;

    public Car(String brand, String model, String color, String registerNumber, int year, int price, Owner owner){
        super();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.year = year;
        this.price = price;
        this.owner = owner;
//        this.owners=Set.of(owners);
    }

    public Car() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }
//Demonstrates how to use @Column annotation to define custom attributes for our database column
    //@Column(name = "explanation", nullable = false, length = 512)
    //private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner")
    private Owner owner;

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

//    @ManyToMany(mappedBy = "cars")
//    private Set<Owner> owners = new HashSet<Owner>();
//
//    public Set<Owner> getOwners() {
//        return owners;
//    }
//
//    public void setOwners(Set<Owner> owners) {
//        this.owners = owners;
//    }
}
