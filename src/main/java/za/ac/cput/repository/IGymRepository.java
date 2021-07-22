package za.ac.cput.repository;

import za.ac.cput.entity.Gym;

import java.util.Set;

public interface IGymRepository extends IRepository<Gym, Integer> {
  public Set<Gym> getAll();

}
