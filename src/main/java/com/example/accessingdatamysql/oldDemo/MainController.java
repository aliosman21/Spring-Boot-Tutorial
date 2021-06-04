//package com.example.accessingdatamysql;
//
//import com.example.accessingdatamysql.User;
//import org.springframework.util.StreamUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//import java.util.concurrent.CompletableFuture;
//
//
//@Controller // This means that this class is a Controller
//@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
//public class MainController {
//
//
//        @Autowired
//        private CarRepository carRepository;
//
//        @Autowired
//        private UserService userService;
//
//
//        @PostMapping(path="/adduser") // Map ONLY POST Requests
//        @ResponseBody
//        public CompletableFuture<String> addNewUser (@RequestBody User user) {
//            return userService.addUserToDatabase(user);
//
//        }
//
//        @GetMapping(path="/allusers")
//        @ResponseBody
//        public  Iterable<User> getAllUsers() {
//            return userService.getAllUsersFromDatabase();
//        }
//
//}
