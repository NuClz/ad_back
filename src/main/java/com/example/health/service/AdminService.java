package com.example.health.service;

import com.example.health.dto.LoginRequest;
import com.example.health.repository.AdminRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository adminRepository;
    private final PasswordEncoder passwordEncoder;

    // @Autowired
    public AdminService(AdminRepository adminRepository, PasswordEncoder passwordEncoder) {
        this.adminRepository = adminRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean validateLogin(LoginRequest loginRequest) {
        try {
            Long adminId = Long.parseLong(loginRequest.getAdminId());
            return adminRepository.findById(adminId)
                    .map(admin -> passwordEncoder.matches(loginRequest.getPassword(), admin.getPassword()))
                    .orElse(false);
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}
