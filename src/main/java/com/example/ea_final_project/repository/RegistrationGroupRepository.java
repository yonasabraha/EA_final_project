package com.example.ea_final_project.repository;

import com.example.ea_final_project.model.RegistrationGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationGroupRepository extends JpaRepository<RegistrationGroup, Integer> {
}
