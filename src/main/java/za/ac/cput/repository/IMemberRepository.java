package za.ac.cput.repository;

import za.ac.cput.entity.Member;

import java.util.Set;
/* IMemberRepository.java
Interface Repository for the Member entity
Author: Akhona Mngqibisa (217302394)
Date: 23 July 2021
*/
public interface IMemberRepository extends IRepository<Member, Integer> {
    public Set<Member> getAll();

}

