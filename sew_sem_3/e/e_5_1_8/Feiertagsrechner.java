package e_5_1_8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;
public class Feiertagsrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte gib dein Geburtstag in vollgendem Schema ein:\nYYYY-MM-DD");
		String eingabe = s.nextLine();
		int index1 = eingabe.lastIndexOf('-');
		String jahr = eingabe.substring(0, index1);
		Year currentyear = Year.now();
		
		int year = currentyear.getValue();
		int nextyear = year+1;
		int index2 = eingabe.indexOf('.');
		int lang = eingabe.length();
		String monat = eingabe.substring(index1+1, index2);
		String tag = eingabe.substring(index2+1, lang);
		LocalDate date = LocalDate.now();
		int monthnow = date.getMonthValue();
		int daynow = date.getDayOfMonth();
		int month = Integer.parseInt(monat);
		int dayOfMonth = Integer.parseInt(tag);
		int yeaR = Integer.parseInt(jahr);
		LocalDate datumheuer = LocalDate.of(year, month, dayOfMonth);
		LocalDate datum = LocalDate.of(yeaR, month, dayOfMonth);
		LocalDate datumnextyear = LocalDate.of(nextyear, month, dayOfMonth);
		int birthday = datum.getDayOfMonth();
		int birthmonth = datum.getMonthValue();
		LocalDate currentdate = LocalDate.now();	
		Period wiealt = Period.between(datum, datumheuer);
		int jahrevergangen = wiealt.getYears();
		Period wielang;
		if(birthmonth > monthnow) {
			wielang = Period.between(currentdate, datumheuer);
		}
		if(birthmonth == monthnow) {
			if(daynow > birthday) {
				wielang = Period.between(datumheuer, currentdate);
			}
			if(daynow < birthday) {
				wielang = Period.between(currentdate, datumheuer);
			}
			if(daynow == birthday) {
				
			}
		}
		if(birthmonth < monthnow) {
			wielang = Period.between(datumheuer, currentdate);
		}
		Period nextJahr = Period.between(datumheuer, datumnextyear);
		System.out.println(wielang+"\n"+);
		
	}
}
