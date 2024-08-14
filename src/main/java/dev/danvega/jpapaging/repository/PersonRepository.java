package dev.danvega.jpapaging.repository;

import dev.danvega.jpapaging.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sam
 * @create 2024-08-13 10:23 PM
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {


}
