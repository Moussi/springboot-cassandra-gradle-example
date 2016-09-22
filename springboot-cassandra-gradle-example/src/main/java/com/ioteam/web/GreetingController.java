package com.ioteam.web;

import com.ioteam.model.Greeting;
import com.ioteam.repositories.GreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Aymen Moussi
 */

@RestController
public class GreetingController {
    @Autowired
    private GreetRepository greetRepository;
    @RequestMapping(value = "/greeting",method = RequestMethod.GET)
    @ResponseBody
    public List<Greeting> greeting() {
        List<Greeting> greetings = new ArrayList<>();
        greetRepository.findAll().forEach(e->greetings.add(e));
        return greetings;
    }
    @RequestMapping(value = "/greeting/{user}/",method = RequestMethod.GET)
    @ResponseBody
    public List<Greeting> greetingUserLimit(@PathVariable String user,Integer limit) {
        List<Greeting> greetings = new ArrayList<>();
        greetRepository.findByUser(user,limit).forEach(e -> greetings.add(e));
        return greetings;
    }
    @RequestMapping(value = "/greeting",method = RequestMethod.POST)
    @ResponseBody
    public String saveGreeting(@RequestBody Greeting greeting) {
        greeting.setCreationDate(new Date());
        greetRepository.save(greeting);
        return "OK";
    }
}