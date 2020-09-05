package com.example.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Entity
public class ExchangeValue {

	@Id
	private @NonNull Long id;

	@Column(name = "currency_from")
	private @NonNull String from;

	@Column(name = "currency_to")
	private @NonNull String to;

	private @NonNull BigDecimal conversionMultiple;

	@Setter
	private int port;
}
