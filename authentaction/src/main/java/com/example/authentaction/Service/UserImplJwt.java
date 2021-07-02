package com.example.authentaction.Service;

import com.example.authentaction.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Objects;

public class UserImplJwt implements UserDetails {
    private static final long serialVersionUID = 1L;

    private int id;

    private String username;

    private String email;

    @JsonIgnore
    private String password;

    private Collection<? extends GrantedAuthority> authorities;

    public UserImplJwt(int id, String username, String email, String password)
    {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public static UserImplJwt build(User user) {

        return new UserImplJwt(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword());
    }


    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UserImplJwt user = (UserImplJwt) o;
        return Objects.equals(id, user.id);
    }
}
