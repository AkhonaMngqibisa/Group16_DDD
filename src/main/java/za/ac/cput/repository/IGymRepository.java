package za.ac.cput.repository;

import za.ac.cput.entity.Gym;

import java.util.Set;

/* IGymRepository.java
Interface Repository for the Gym entity
Author: Akhona Mngqibisa (217302394)
Date: 21 July 2021
*/
public interface IGymRepository extends IRepository<Gym, Integer> {
  public Set<Gym> getAll();

}
