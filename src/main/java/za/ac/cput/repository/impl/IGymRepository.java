package za.ac.cput.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Gym;

import java.util.Set;

/* IGymRepository.java
Interface Repository for the Gym entity
Author: Akhona Mngqibisa (217302394)
Date: 21 July 2021
*/
@Repository
public interface IGymRepository extends JpaRepository<Gym, Integer>
{


}
