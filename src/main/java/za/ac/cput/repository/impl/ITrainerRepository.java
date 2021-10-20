package za.ac.cput.repository.impl;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Trainer;

@Repository
public interface ITrainerRepository extends JpaRepository<Trainer, Integer> {
}
