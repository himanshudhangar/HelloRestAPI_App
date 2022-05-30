package com.bridgelabz.SpringHelloApp.controller;

import com.bridgelabz.SpringHelloApp.Model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // UC 1
//    Create a Rest Controller to demonstrate
//     the various HTTP Methods and respond
//     hello messages to the User. To begin
//     with show Hello from BridgeLabz
//       Use GET Request Method
        @GetMapping(value={"/hello"})
        @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
        public String sayHello() {
            return "Hello from BridgeLabz !!!";
        }

       //UC 2

//    Make REST Call to show Hello
//     * Mark from BridgeLabz
//     * Use GET Request Method and pass name as
//     * query parameter
//     * - Use CURL to demonstrate the REST API Call
//    @RequestMapping(value = "/query",method = RequestMethod.GET)

    public String sayHello(@RequestParam String name){
        return "Hello "+ name +" from bridgelabz";
    }
    @GetMapping( {"/query1"})
    public String sayHelloQuey(@RequestParam String name){
        return "Hello "+ name +" from bridgelabz";
    }

        //UC3
//     Make REST Call to show Hello
//     Mark from BridgeLabz
//     Use GET Request Method and pass name as
//     path variable
//     Use CURL to demonstrate the REST API Call

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable(value = "name") String name){
        return "Hello "+ name +" from bridgelabz";
    }

    // UC4
//    Make REST Call to show Hello Mark
//     Taylor from BridgeLabz
//     Use POST Request Method and pass first name and
//     last name in the Body
//      Create User DTO Bean with firstName and lastName as
//     attributes.
//     *Use CURL to demonstrate the REST API Call

    @PostMapping (value = {"/create-user","/post"})
    public String sayHello(@RequestBody User user){
        return "Hello "+user.getFirstName() + " " +user.getLastName() +" !";
    }

    }



