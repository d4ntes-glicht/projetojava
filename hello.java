package com.example.demo.controllers;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servidor")
public class hello {
    
        @GetMapping("/hello")
        public String gethello(){
            return "bom dia pessoas do planeta terra";
        }

        @PostMapping("/hello")
        public String gethello2 (){
            return "hello world post";
        }

        @PutMapping ("/hello")
        public String gethello3 (){
            return "hello world put";
        }

        @DeleteMapping ("/hello")
        public String gethello4 (){
            return "hello world delete";
        }
        
}
