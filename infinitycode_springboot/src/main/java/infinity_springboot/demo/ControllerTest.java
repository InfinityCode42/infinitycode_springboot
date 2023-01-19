package infinity_springboot.demo;

import infinity_springboot.demo.model.Person;
import infinity_springboot.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Autowired
    PersonRepository personRepository;

    @PostMapping("/person")
    public Person newPerson(@RequestBody Person person){
        return personRepository.save(person);
    }

}
