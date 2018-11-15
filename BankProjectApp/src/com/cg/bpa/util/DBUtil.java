package com.cg.bpa.util;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.cg.bpa.dto.Credentials;
import com.cg.bpa.dto.Customer;

public class DBUtil {
	static Random rand = new Random();
	public static HashMap<String, Customer> bankDBMap = new HashMap<>();
	public static HashMap<String, String> credentialDBMap = new HashMap<>();
	static {
		credentialDBMap.put("162210", "an123");
		bankDBMap.put(
				"162210",
				new Customer("162210", "Andri Dwivedi", LocalDate.of(1996,
						Month.MAY, 24), "Saving", 15500.0F, 200000.0));
		credentialDBMap.put("160221", "ak123");
		bankDBMap.put("160221", new Customer("160221", "Akanksha Gaur",
				LocalDate.of(2018, Month.SEPTEMBER, 26), "Current", 15500.0F,
				200000.0));
		credentialDBMap.put("160110", "as123");
		bankDBMap.put("160110", new Customer("160110", "Anamika Singh",
				LocalDate.of(2018, Month.SEPTEMBER, 14), "Saving", 15500.0F,
				200000.0));
		credentialDBMap.put("160821", "sm123");
		bankDBMap.put(
				"160821",
				new Customer("160821", "Smrati Singh", LocalDate.of(2017,
						Month.DECEMBER, 15), "Current", 15500.0F, 200000.0));
	}

	public static String newCustomer(String password, Customer customer) {
		credentialDBMap.put(customer.getAccNumber(), password);
		bankDBMap.put(customer.getAccNumber(), customer);
		return customer.getAccNumber();
	}

	public static HashMap<String, String> getAllCustCred() {
		return credentialDBMap;
	}

	public static HashMap<String, Customer> getAllCustomer() {
		return bankDBMap;
	}

}
