package com.example.HorseApp.repositories;

import com.example.HorseApp.models.Horse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HorseRepository extends JpaRepository<Horse,Long>
{
    List<Horse> findByOrderByIdhAsc();
}
