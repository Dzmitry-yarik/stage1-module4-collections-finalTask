package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
      List<String> qwe = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (String.valueOf(entry.getValue()).contains(developer)){
                    qwe.add(entry.getKey());
            }
        }

        return qwe;
    }
}
