package br.com.pedrobelmino.axon.labs.bank.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class BankAccountRemovedEvent {

	private String id;
}