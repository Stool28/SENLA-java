package com.company4;

import java.util.HashMap;
import java.util.Map;

public class MapChars {
     Map<Integer, char[][]> map = new HashMap<>();

    {
        map.put(0, Numbers.number0());
        map.put(1, Numbers.number1());
        map.put(2, Numbers.number2());
        map.put(3, Numbers.number3());
        map.put(4, Numbers.number4());
        map.put(5, Numbers.number5());
        map.put(6, Numbers.number6());
        map.put(7, Numbers.number7());
        map.put(8, Numbers.number8());
        map.put(9, Numbers.number9());
    }
    Map<Integer, char[][]> map2 = new HashMap<>();
    {
        map2.put(0, Numbers2.number00());
        map2.put(1, Numbers2.number11());
        map2.put(2, Numbers2.number22());
        map2.put(3, Numbers2.number33());
        map2.put(4, Numbers2.number44());
        map2.put(5, Numbers2.number55());
        map2.put(6, Numbers2.number66());
        map2.put(7, Numbers2.number77());
        map2.put(8, Numbers2.number88());
        map2.put(9, Numbers2.number99());
    }
}
