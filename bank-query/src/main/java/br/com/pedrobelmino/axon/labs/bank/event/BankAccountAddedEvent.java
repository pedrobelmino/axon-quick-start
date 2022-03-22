package br.com.pedrobelmino.axon.labs.bank.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
@AllArgsConstructor
public class BankAccountAddedEvent {

	private String id;
	private String name;
	private BigDecimal balance;
}