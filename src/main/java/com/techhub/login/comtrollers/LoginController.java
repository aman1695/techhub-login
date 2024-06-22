package com.techhub.login.comtrollers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
//    @Autowired
//    private DefaultUserService userService;
//
//    @Autowired
//    UserRepository userRepo;
//
//    @ModelAttribute("user")
//    public UserLoginDTO userLoginDTO() {
//        return new UserLoginDTO();
//    }
//
//    @GetMapping
//    public String login() {
//        return "login";
//    }
//
//    @PostMapping
//    public void loginUser(@ModelAttribute("user")
//                          UserLoginDTO userLoginDTO) {
//        System.out.println("UserDTO"+userLoginDTO);
//        userService.loadUserByUsername(userLoginDTO.getUsername());
//    }
    @GetMapping("/")
    public String home(){
        return "Welcome to TechHub";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Welcome to TechHub : Secured";
    }

}
