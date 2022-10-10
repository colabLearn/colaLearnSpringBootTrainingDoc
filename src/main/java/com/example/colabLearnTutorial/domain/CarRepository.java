package com.example.colabLearnTutorial.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {


    //Using SQL via the @Query annotation
    //Fetch car by brand using SQL
    @Query("select c from Car c where c.brand=?1")
    //Fetch car by brand
    List<Car> findByBrand(@Param("brand") String brand);

    //Fetch car by color
    List<Car> findByColor(@Param("color") String color);

    //Fetch cars by year
    List<Car> findByYear(int year);

    //Fetch car by brand and model
    List<Car> findByBrandAndModel(String brand, String model);

    List<Car> findByBrandOrColor(String brand, String color);

    //Queries can be sorted by using the  OrderBy keyword in the query method

    List<Car> findByBrandOrderByYearAsc(String brand);



}
