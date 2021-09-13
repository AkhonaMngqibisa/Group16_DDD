package za.ac.cput.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.Gym;
import za.ac.cput.entity.Member;
import za.ac.cput.repository.IRepository;

import java.util.Set;
/* IMemberRepository.java
Interface Repository for the Member entity
Author: Akhona Mngqibisa (217302394)
Date: 23 July 2021
*/
public interface IMemberRepository extends JpaRepository<Member, Integer> {


}

