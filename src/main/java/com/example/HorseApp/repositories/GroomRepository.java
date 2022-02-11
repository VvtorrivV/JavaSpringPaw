package com.example.HorseApp.repositories;

import com.example.HorseApp.models.Groom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroomRepository extends JpaRepository<Groom, Long>
{
}
