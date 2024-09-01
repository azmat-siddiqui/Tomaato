package com.azmat.onlinefoodordering.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
