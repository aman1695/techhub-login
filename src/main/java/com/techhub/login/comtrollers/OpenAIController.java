//package com.techhub.login.comtrollers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.techhub.com.services.OpenAIService;
//
//import java.io.IOException;
//
//@RestController
//public class OpenAIController {
//
//    private final OpenAIService openAIService;
//
//    @Autowired
//    public OpenAIController(OpenAIService openAIService) {
//        this.openAIService = openAIService;
//    }
//
//    @GetMapping("/ask")
//    public String askOpenAI(@RequestParam String question) {
//        try {
//            return openAIService.callOpenAI(question);
//        } catch (IOException e) {
//            return "Error: " + e.getMessage();
//        }
//    }
//}
