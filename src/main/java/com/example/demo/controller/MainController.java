package com.example.demo.controller;


import com.example.demo.dao.UsersDAOImpl;
import com.example.demo.exception.FirstException;
import com.example.demo.model.User;

import com.example.demo.regular.EmailValidatorSimple;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;

@Controller
public class MainController {

    public MainController(UsersDAOImpl usersDAOImpl) {
        this.usersDAOImpl = usersDAOImpl;
    }

    private UsersDAOImpl usersDAOImpl;






    @RequestMapping("/")
    public String getUsers(Model model){
        model.addAttribute("users", usersDAOImpl.getAll());
        return "users";
    }

    @RequestMapping("/add_new_user")
    public String addNewUser(Model model){
        User user = new User();
        model.addAttribute("user", user);

        return "add_new_user";
    }

    @RequestMapping("/save_user")
    public String saveUser(@ModelAttribute("user")User user) throws FirstException {
        usersDAOImpl.saveUser(user);
        return "redirect:/";
    }

    @RequestMapping("/update_user")
    public String updateUser(@RequestParam("ID") int id,
                             @RequestParam("firstName") String firstName,
                             @RequestParam("secondName") String secondName,
                             @RequestParam("age") int age,
                             @RequestParam("email") String email,
                             Model model){
        User user = new User(id, firstName, secondName, age, email);
        model.addAttribute("user", user);
        return "add_new_user";
    }

    @RequestMapping("/delete_user")
    public String deleteUser(@RequestParam("ID") int id){
        usersDAOImpl.deleteUser(id);
        return "redirect:/";
    }
}
