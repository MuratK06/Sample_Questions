package Map;

import java.util.*;

public class soru {
    public static void main(String[] args) {

        TreeMap<String, Double> salaries = new TreeMap<>();
        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimmy Jones", 5000.00);
        salaries.put("Kevin Bridgeman", 6000.00);



        Map.Entry<String, Double> map8 = salaries.ceilingEntry("Mary Star");
        System.out.println(map8);
    }
}