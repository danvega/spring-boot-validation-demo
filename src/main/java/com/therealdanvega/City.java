package com.therealdanvega;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class City {

    @Id @GeneratedValue
    private Long id;
    public String name;
    @NotNull
    public String state;

    private City() {}

    public City(String name){
        this.name = name;
    }
}
