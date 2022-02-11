package com.example.HorseApp.models;
import com.example.HorseApp.models.Horse;

import javax.persistence.*;
import java.util.List;

@Entity
public class Gender
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idg;
    private String gender_name;

    @OneToMany(mappedBy = "idh")
    private List<Horse> horses;
    public Gender()
    {
        super();
    }

    public Long getIdg() {
        return idg;
    }

    public void setIdg(Long idg) {
        this.idg = idg;
    }

    public String getGender_name() {
        return gender_name;
    }

    public void setGender_name(String gender_name) {
        this.gender_name = gender_name;
    }
}
