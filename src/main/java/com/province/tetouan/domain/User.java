package com.province.tetouan.domain;

public class User {
    private String Name;

    private String username;

    private String password;

    private String[] roles;

    private Integer[] ids_project;

    public User(String name, String username, String password, String[] roles, Integer[] ids_project) {
        Name = name;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.ids_project = ids_project;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public Integer[] getIds_project() {
        return ids_project;
    }

    public void setIds_project(Integer[] ids_project) {
        this.ids_project = ids_project;
    }
}
