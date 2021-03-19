package com.codegym;

import com.codegym.model.Role;
import com.codegym.model.admin.Admin;
import com.codegym.repository.admin.AdminRepository;
import com.codegym.service.admin.AdminService;
import com.codegym.service.admin.AdminServiceImpl;
import com.codegym.service.role.RoleSevice;
import com.codegym.service.role.RoleSeviceImpl;
import com.codegym.service.seller.SellerService;
import com.codegym.service.seller.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class CaseStudyMd4Application {

    @Autowired
    private AdminService adminService;


    @Autowired
    private RoleSevice roleSevice;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void init() {
        List<Role> roles = (List<Role>) roleSevice.findAll();
        if (roles.isEmpty()) {
            Role roleAdmin = new Role();
//            roleAdmin.setId(1L);
            roleAdmin.setRoleName("ROLE_ADMIN");
            roleSevice.save(roleAdmin);

            Role roleSeller = new Role();
//            roleSeller.setId(2L);
            roleSeller.setRoleName("ROLE_SELLER");
            roleSevice.save(roleSeller);

            Role roleCustomer = new Role();
            roleCustomer.setRoleName("ROLE_CUSTOMER");
            roleSevice.save(roleCustomer);
        }

        List<Admin> sellers = (List<Admin>) adminService.findAll();
        if (sellers.isEmpty()) {
            Admin admin = new Admin();
//            seller1.setId(1L);
            admin.setUserName("admin");
            admin.setPassword(passwordEncoder.encode("123456"));
            Role role = new Role();
            role.setId(1L);
            Set<Role> roles1 = new HashSet<>();
            roles1.add(role);
            admin.setRoles(roles1);
            adminService.save(admin);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(CaseStudyMd4Application.class, args);
    }
    @Bean
    public AdminService adminService() {
        return new AdminServiceImpl();
}
    @Bean
    public RoleSevice roleSevice() {
        return  new RoleSeviceImpl();
}

    @Bean
    public SellerService sellerService() {
        return new SellerServiceImpl();
}
}
