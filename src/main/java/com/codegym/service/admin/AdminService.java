package com.codegym.service.admin;

import com.codegym.model.admin.Admin;
import com.codegym.service.GeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AdminService extends GeneralService<Admin>, UserDetailsService {

    Admin findByAdminName(String userName);
}
