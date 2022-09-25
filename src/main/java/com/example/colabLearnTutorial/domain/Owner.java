package com.example.colabLearnTutorial.domain;

import javax.persistence.*;
import java.util.List;


@Entity
public class Owner {
    public Owner(String firstname, String lastname) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Owner() {
    }

    public void setOwnerid(long ownerid) {
        this.ownerid = ownerid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getOwnerid() {
        return ownerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerid;
    private String firstname, lastname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Car> cars;

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }
//    @ManyToMany(cascade = CascadeType.PERSIST)
//    @JoinTable (name = "car_owner",
//    joinColumns = {@JoinColumn (name = "ownerid")},
//    inverseJoinColumns = {@JoinColumn(name="id")})
//    private Set<Car> cars = new HashSet<Car>();
//
//    public Set<Car> getCars() {
//        return cars;
//    }
//
//    public void setCars(Set<Car> cars) {
//        this.cars = cars;
//    }
}
