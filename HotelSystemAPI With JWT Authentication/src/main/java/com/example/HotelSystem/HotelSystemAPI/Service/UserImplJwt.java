package com.example.HotelSystem.HotelSystemAPI.Service;
import com.example.HotelSystem.HotelSystemAPI.Entity.RoomBookingEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Objects;

public class UserImplJwt implements UserDetails {
    private static final long serialVersionUID = 1L;
    int id;
    @Column(nullable = false)
    String cname;
    @Column(nullable = false)
    int cage;
    @Column(nullable = false)
    String caadhaar;
    @Column(nullable = false)
    String email;
    @Column(nullable = false)
    long contact;
    String roomtype;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="dd-MM-yyyy")
    private LocalDate checkin;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="dd-MM-yyyy")
    private LocalDate checkout;
    @JsonIgnore
    private String password;

    private Collection<? extends GrantedAuthority> authorities;

    public UserImplJwt(String cname, int cage, String caadhaar, long contact, LocalDate checkin, LocalDate checkout, String email, String roomtype, String password) {
        this.cname = cname;
        this.cage = cage;
        this.caadhaar = caadhaar;
        this.contact = contact;
        this.checkin = checkin;
        this.checkout = checkout;
        this.email=email;
        this.password=password;
        this.roomtype=roomtype;
    }

    public static UserImplJwt build(RoomBookingEntity roomBookingEntity) {

        return new UserImplJwt(
                roomBookingEntity.getCname(),
                roomBookingEntity.getCage(),
                roomBookingEntity.getCaadhaar(),
                roomBookingEntity.getContact(),
                roomBookingEntity.getCheckin(),
                roomBookingEntity.getCheckout(),
                roomBookingEntity.getEmail(),
                roomBookingEntity.getRoomtype(),
                roomBookingEntity.getPassword());
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
        return cname;
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
