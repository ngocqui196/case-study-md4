package com.codegym.model.admin;

import com.codegym.model.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AdminPrinciple implements UserDetails {

    private Long id;
    private String userName;
    private String password;
    private Collection<? extends  GrantedAuthority> roles;

    public AdminPrinciple(Long id, String userName, String password, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }

    public static AdminPrinciple build(Admin admin) {
        List<GrantedAuthority> authorities = new ArrayList<>();

        for (Role role : admin.getRoles() ) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return new AdminPrinciple(admin.getId(), admin.getUserName(), admin.getPassword(),authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
