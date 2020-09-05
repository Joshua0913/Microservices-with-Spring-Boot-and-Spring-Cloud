package com.example.microservices.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LimitConfiguration {
	private int maximum;
	private int minimum;
}
