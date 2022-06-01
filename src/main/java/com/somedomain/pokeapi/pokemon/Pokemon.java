package com.somedomain.pokeapi.pokemon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Entity
@Data
@Table(name = "pokemon")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "idNumber")
    private Integer idNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "imageUrl")
    private String imageUrl;
}