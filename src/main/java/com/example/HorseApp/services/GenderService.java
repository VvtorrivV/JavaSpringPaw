package com.example.HorseApp.services;
import com.example.HorseApp.models.Gender;
import com.example.HorseApp.repositories.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenderService
{
    @Autowired
    private GenderRepository repositoryG;
    public GenderService()
    {
    }
    public List<Gender> findAll()
    {
        return repositoryG.findAll();
    }
    public <S extends Gender> S save(S entity)
    {
        return repositoryG.save(entity);
    }
    public Optional<Gender> findById(Long aLong)
    {
        return repositoryG.findById(aLong);
    }
    public void deleteById(Long aLong)
    {
        repositoryG.deleteById(aLong);
    }
    public void update(Gender gender)
    {
        repositoryG.save(gender);
    }
}
