package com.sheng.springBootDemo.controller;

import com.sheng.springBootDemo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shengxingyue, created on 2017/12/1
 */
@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping
    public String index(Model model) {
        Person singlePerson = new Person(11, "aaa");

        List<Person> people = new ArrayList<>();
        people.add(new Person(12, "bbb"));
        people.add(new Person(12, "bbb"));
        people.add(new Person(12, "bbb"));

        model.addAttribute("singlePerson", singlePerson);
        model.addAttribute("people", people);

        return "index";
    }
}
