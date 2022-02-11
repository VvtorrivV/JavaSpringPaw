package com.example.HorseApp.models;
import com.example.HorseApp.models.Horse;

import javax.persistence.*;
import java.util.List;

@Entity
public class Groom
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idgr;
    private String groom_name;
    private String groom_surname;

    @OneToMany(mappedBy = "idh")
    private List<Horse> horses;
    public Groom()
    {
        super();
    }

    public Long getIdgr() {
        return idgr;
    }

    public void setIdgr(Long idgr) {
        this.idgr = idgr;
    }

    public String getGroom_name() {
        return groom_name;
    }

    public void setGroom_name(String groom_name) {
        this.groom_name = groom_name;
    }

    public String getGroom_surname() {
        return groom_surname;
    }

    public void setGroom_surname(String groom_surname) {
        this.groom_surname = groom_surname;
    }
}
