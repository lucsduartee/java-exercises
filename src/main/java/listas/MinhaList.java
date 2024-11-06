package listas;

import java.util.*;

public class MinhaList {
    public static void main(String[] args) {
        // ArrayList é um implementaçao de List
        // Meio que usamos o ArrayList para instanciar a List
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Mas podemos instanciar uma List "manualmente"
        List<String> listDirectly1 = Arrays.asList("item", "item", "item", "item");
        List<String> listDirectly2 = Arrays.asList(new String[]{"item", "item", "item", "item"});
        String[] anArray = new String[]{"item", "item", "item", "item"};
        List<String> listDirectly3 = List.of(anArray);


        numbers.add(7);
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        String item2 = listDirectly3.get(2);

        // imutavel
        Set<String> anSet = Set.of("item", "item2", "item3");

        // mutavel
        HashSet<String> aHashSet = new HashSet<>();

        // imutavel
        HashMap<String, String> aMap = new HashMap<String, String>();
        aMap.put("a", "b");
        aMap.put("c", "d");
        aMap.put("e", "f");
        aMap.get("e");
        aMap.remove("a");
    }
}
