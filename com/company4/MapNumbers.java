package com.company4;

import java.util.HashMap;
import java.util.Map;

public class MapNumbers {
     Map<Integer, String[]> map = new HashMap<>();

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
}
