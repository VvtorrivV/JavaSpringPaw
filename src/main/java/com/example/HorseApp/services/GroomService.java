package com.example.HorseApp.services;

import com.example.HorseApp.models.Groom;
import com.example.HorseApp.models.Horse;
import com.example.HorseApp.repositories.GroomRepository;
import com.example.HorseApp.repositories.HorseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroomService
{
    @Autowired
    private GroomRepository repositoryGR;
    public GroomService()
    {}
    public List<Groom> findAll()
    {
        return repositoryGR.findAll();
    }
    public <S extends Groom> S save(S entity)
    {
        return repositoryGR.save(entity);
    }
    public Optional<Groom> findById(Long aLong)
    {
        return repositoryGR.findById(aLong);
    }
    public void deleteById(Long aLong)
    {
        repositoryGR.deleteById(aLong);
    }
    public void update(Groom groom)
    {
        repositoryGR.save(groom);
    }
}
