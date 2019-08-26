package com.kvinod.security;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JwtAuthenticationRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
}