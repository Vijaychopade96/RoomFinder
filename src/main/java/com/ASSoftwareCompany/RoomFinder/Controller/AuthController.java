package com.ASSoftwareCompany.RoomFinder.Controller;

import com.ASSoftwareCompany.RoomFinder.Model.LoginRequest;
import com.ASSoftwareCompany.RoomFinder.Model.User;
import com.ASSoftwareCompany.RoomFinder.Repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {


}
