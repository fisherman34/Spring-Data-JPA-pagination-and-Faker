package dev.danvega.jpapaging.data;

import dev.danvega.jpapaging.model.Address;
import dev.danvega.jpapaging.model.Person;
import dev.danvega.jpapaging.repository.PersonRepository;
import net.datafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Sam
 * @create 2024-08-13 10:30 PM
 */

@Component
public class SampleDataLoader implements CommandLineRunner {

  private Logger logger = LoggerFactory.getLogger(SampleDataLoader.class);
  private final PersonRepository repository;
  private final Faker faker;

  public SampleDataLoader(PersonRepository repository, Faker faker) {
    this.repository = repository;
    this.faker = faker;
  }

  @Override
  public void run(String... args) throws Exception {
    logger.info("Loading Sample Data...");
//    Person person = new Person("Dan",
//            "Vega",
//            "216.555.1212",
//            "danvega@gmail.com",
//            new Address("Street","City","State","Zip"));
//
//    repository.save(person);

    // create 100 rows of people in the database
//    List<Person> people = IntStream.rangeClosed(1, 100)
//            .mapToObj(i -> new Person(
//                    faker.name().firstName(),
//                    faker.name().lastName(),
//                    faker.phoneNumber().cellPhone(),
//                    faker.internet().emailAddress(),
//                    new Address(
//                            faker.address().streetAddress(),
//                            faker.address().city(),
//                            faker.address().state(),
//                            faker.address().zipCode()
//                    )
//            ))
//            .toList();
//
//    repository.saveAll(people);
  }
}
