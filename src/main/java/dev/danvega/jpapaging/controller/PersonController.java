package dev.danvega.jpapaging.controller;

import dev.danvega.jpapaging.model.Person;
import dev.danvega.jpapaging.repository.PersonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sam
 * @create 2024-08-14 11:53 AM
 */

@RestController
@RequestMapping("/api/people")
public class PersonController {

  private final PersonRepository repository;

  public PersonController(PersonRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public Page<Person> findAll(@RequestParam int page, @RequestParam int size) {
    PageRequest pr = PageRequest.of(page, size);
    return repository.findAll(pr);
  }
}
