package com.example.HorseApp.models;
import com.example.HorseApp.models.Horse;

import javax.persistence.*;
import java.util.List;

@Entity
public class Breed
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idb;
    private String breed_name;

    @OneToMany(mappedBy = "idh")
    private List<Horse> horses;
    public Breed()
    {
        super();
    }

    public Long getIdb() {
        return idb;
    }

    public void setIdb(Long idb) {
        this.idb = idb;
    }

    public String getBreed_name() {
        return breed_name;
    }

    public void setBreed_name(String breed_name) {
        this.breed_name = breed_name;
    }
}
