package com.example.HorseApp.repositories;

import com.example.HorseApp.models.Breed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreedRepository extends JpaRepository<Breed,Long>
{
}
