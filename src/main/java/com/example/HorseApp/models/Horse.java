package com.example.HorseApp.models;

import javax.persistence.*;

@Entity
public class Horse
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idh;
    private String name;

    //@ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne
    private Breed breed;

    @ManyToOne
    private Gender gender;
    private Long age;

    @ManyToOne
    private Groom groom;

    public Horse()
    {
        super();
    }

    public Long getIdh() {
        return idh;
    }

    public void setIdh(Long idh) {
        this.idh = idh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Groom getGroom() {
        return groom;
    }

    public void setGroom(Groom groom) {
        this.groom = groom;
    }
}
