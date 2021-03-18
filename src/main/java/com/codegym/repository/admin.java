package com.codegym.repository;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

}
