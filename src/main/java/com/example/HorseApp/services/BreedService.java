package com.example.HorseApp.services;

import com.example.HorseApp.models.Breed;
import com.example.HorseApp.repositories.BreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BreedService
{
    @Autowired
    private BreedRepository repositoryB;
    public BreedService()
    {

    }
    public List<Breed> findAll()
    {
        return repositoryB.findAll();
    }
    public <S extends Breed> S save(S entity)
    {
        return  repositoryB.save(entity);
    }
    public Optional<Breed> findById(Long aLong)
    {
        return  repositoryB.findById(aLong);
    }
    public void deleteById(Long aLong)
    {
        repositoryB.deleteById(aLong);
    }
    public void update(Breed breed)
    {
        repositoryB.save(breed);
    }

}
