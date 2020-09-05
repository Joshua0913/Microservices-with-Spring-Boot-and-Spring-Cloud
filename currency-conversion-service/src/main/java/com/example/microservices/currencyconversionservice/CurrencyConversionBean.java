package com.example.microservices.currencyconversionservice;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CurrencyConversionBean {

	private @NonNull Long id;
	private @NonNull String from;
	private @NonNull String to;
	private @NonNull BigDecimal conversionMultiple;
	private @NonNull BigDecimal quantity;
	private @NonNull BigDecimal totalCalaculatedAmount;

	private int port;
}
