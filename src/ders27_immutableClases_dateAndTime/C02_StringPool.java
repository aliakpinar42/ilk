package ders27_immutableClases_dateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class C02_StringPool {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu =LocalDate.of(1981,12,01);
        Period gecenSure =Period.between(dogumGunu,bugun);
        System.out.println(gecenSure);
        System.out.println(gecenSure.getYears());
}}
