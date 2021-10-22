package za.ac.cput.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.WorkOut;

@Repository
public interface IWorkOutRepository extends JpaRepository <WorkOut, Integer> {


}
