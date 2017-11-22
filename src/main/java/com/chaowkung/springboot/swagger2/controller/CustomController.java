package com.chaowkung.springboot.swagger2.controller;

import com.chaowkung.springboot.swagger2.model.Person;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Winiton Chanapolchai on 22/11/2560.
 */
@Controller
@RequestMapping(value = "/chaowkung")
public class CustomController {

    @ApiOperation(value = "Response variable name", response = String.class)
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String showName(@PathVariable String name) {
        return "Your name is " + name;
    }

    @ApiOperation(value = "Response Person object", response = Person.class)
    @RequestMapping(value = "/person", method = RequestMethod.PUT)
    @ResponseBody
    public Person showPerson(@RequestBody Person person) {
        return person;
    }

}
