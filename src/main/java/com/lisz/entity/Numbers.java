package com.lisz.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Numbers {
	@Value("${my.secret}")
	private String secret;
	@Value("${my.number}")
	private int number;
	@Value("${my.bignumber}")
	private long bignumber;
	@Value("${my.uuid}")
	private UUID uuid;
	@Value("${my.less.than.ten}")
	private int lessThanTen;
	@Value("${my.in.range}")
	private int inRange;

	@Override
	public String toString() {
		return "Numbers{" +
				"secret='" + secret + '\'' +
				", number=" + number +
				", bignumber=" + bignumber +
				", uuid=" + uuid +
				", lessThanTen=" + lessThanTen +
				", inRange=" + inRange +
				'}';
	}
}
