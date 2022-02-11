package com.example.HorseApp.services;

import com.example.HorseApp.models.Horse;
import com.example.HorseApp.repositories.HorseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorseService
{
    @Autowired
    private HorseRepository repositoryH;
    public HorseService()
    {
        super();
    }

    public List<Horse> findAll()
    {
        return repositoryH.findByOrderByIdhAsc();
    }
    public <S extends Horse> S save(S entity)
    {
        return repositoryH.save(entity);
    }
    public Optional<Horse> findById(Long aLong)
    {
        return  repositoryH.findById(aLong);
    }
    public void deleteById(Long aLong)
    {
        repositoryH.deleteById(aLong);
    }
    public void update(Horse horse)
    {
        repositoryH.save(horse);
    }

}
