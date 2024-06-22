//package com.techhub.login.comtrollers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.techhub.com.dto.UserRegisterDTO;
//import org.techhub.com.services.DefaultUserService;
//
//@Controller
//@RequestMapping("/registration")
//public class RegistrationController {
//
//    private DefaultUserService userService;
//
//    public RegistrationController(DefaultUserService userService) {
//        super();
//        this.userService = userService;
//    }
//
//    @ModelAttribute("user")
//    public UserRegisterDTO userRegistrationDto() {
//        return new UserRegisterDTO();
//    }
//
//    @GetMapping
//    public String showRegistrationForm() {
//        return "register";
//    }
//
//    @PostMapping
//    public String registerUserAccount(@ModelAttribute("user")
//                                      UserRegisterDTO registrationDto) {
//        userService.save(registrationDto);
//        return "redirect:/login";
//    }
//}
