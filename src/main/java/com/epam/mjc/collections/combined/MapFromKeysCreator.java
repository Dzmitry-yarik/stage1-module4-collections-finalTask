package com.epam.mjc.collections.combined;

import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> qwe = new HashMap<>();

        List<String> str = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            str.add(entry.getKey());
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < str.size(); j++) {
                if (i == str.get(j).length()) {
                    set.add(str.get(j));
                    qwe.put(i, set);
                }
            }
            set = new HashSet<>();
        }

        return qwe;
    }
}
