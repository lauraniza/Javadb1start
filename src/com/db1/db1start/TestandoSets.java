package com.db1.db1start;

import java.util.*;

public class TestandoSets {
    public static void main(String[] args) {
        Set<String> personagens = new HashSet<>();
        personagens.add("Raito");
        personagens.add("Kira");
        personagens.add("L");
        personagens.add("Riuky");
        personagens.add("Kira");
        personagens.add("L");
        System.out.println(personagens);

        personagens.remove("L");
        System.out.println(personagens);

        personagens.forEach(System.out::println);

        Optional<String> maybeKira = personagens.stream()
                .filter(s -> s.equals("Kira"))
                .findFirst();
        if (maybeKira.isPresent()) {
            System.out.println(maybeKira.get());
        }

        maybeKira.ifPresent(kira -> System.out.println(kira));

        ArrayList<String> ordenados = new ArrayList<>(personagens);
        Collections.sort(ordenados);
        System.out.println(ordenados);
    }
}
