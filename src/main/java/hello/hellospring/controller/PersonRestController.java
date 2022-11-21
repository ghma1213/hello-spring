package hello.hellospring.controller;

//import hello.hellospring.document.Person;
import hello.hellospring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonRestController {
    private final PersonService personService;

    @Autowired
    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }

//    @PostMapping
//    public void save(@RequestBody final Person person) {
//        personService.save(person);
//    }

//    @GetMapping("/{id}")
//    public Person findById(@PathVariable final String id) {
//        return personService.findById(id);
//    }

}
