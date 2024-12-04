package com.kyddaniel.learnSpringBootDataRest.repo;

import com.kyddaniel.learnSpringBootDataRest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

}
