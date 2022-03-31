/* UsersController
 *  Version information
 *  3/31/2022
 *  Copyright User
 */

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UsersRepository usersRepository;

    @PostMapping("/add")
    public @ResponseBody String addNewUser(@RequestBody Users user) {
        usersRepository.save(user);
        return "ok";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Users> getAllUsers() {
        return usersRepository.findAll();
    }
}
