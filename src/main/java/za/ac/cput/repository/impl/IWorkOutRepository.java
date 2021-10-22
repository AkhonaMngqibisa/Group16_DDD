package za.ac.cput.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.WorkOut;

public interface IWorkOutRepository extends JpaRepository <WorkOut, Integer> {


}
