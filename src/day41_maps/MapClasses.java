package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>(); // random order, accept null key & null values

        Map<String, Integer> map2 = new LinkedHashMap<>(); // insertion order, accepts null key  & null values

        Map<String, Integer> map3 = new TreeMap<>(); // sorted order, does not accept null key, accepts null values

        Map<String, Integer> map4 = new Hashtable<>(); // random order, does not accept null key & null values, Synchronized






    }

}
