package com.controller;

import java.util.HashMap;

public class CountryMapLaunch {
	public static void main(String[] args) {
		CountryMap countrymap = new CountryMap();
	countrymap.saveCountryCapital("China", "Beijing");
	countrymap.saveCountryCapital("USA", "Washington");
	countrymap.saveCountryCapital("India", "Delhi");
	countrymap.saveCountryCapital("South Africa", "Johanesburg");
	
	System.out.println(countrymap.getCapital("India"));
	System.out.println(countrymap.getCountry("Beijing"));
	System.out.println(countrymap.toArrayList());
	
	HashMap<String, String> M2 = countrymap.swapKyeValue();
	System.out.println(M2);
	}
}
