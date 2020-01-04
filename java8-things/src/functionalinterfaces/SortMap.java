package functionalinterfaces;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SortMap {

    public static void main(String[] args) {
        Map<String, Integer> mapUnsorted = new HashMap<>();
        mapUnsorted.put("z", 10);
        mapUnsorted.put("b", 5);
        mapUnsorted.put("a", 6);
        mapUnsorted.put("c", 20);
        mapUnsorted.put("d", 1);
        mapUnsorted.put("e", 7);
        mapUnsorted.put("y", 8);
        mapUnsorted.put("n", 99);
        mapUnsorted.put("g", 50);
        mapUnsorted.put("m", 2);
        mapUnsorted.put("f", 9);


        mapUnsorted.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o,n) -> o , LinkedHashMap::new)).forEach(SortMap::printMap);
    }


    static void printMap(String a , Integer b)
    {
        BiConsumer<String,Integer> biConsumer = (x,y) -> {y=y*2; System.out.println("a^^^ ="+x+" ^^^^^b ="+y);};
        biConsumer.accept(a,b);
    }
}
