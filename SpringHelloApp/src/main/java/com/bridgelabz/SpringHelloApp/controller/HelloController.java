package com.bridgelabz.SpringHelloApp.controller;

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


    }



