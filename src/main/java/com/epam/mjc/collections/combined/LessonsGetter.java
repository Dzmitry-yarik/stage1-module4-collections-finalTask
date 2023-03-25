package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
          Set<String> qwe = new HashSet<>();

        for (Map.Entry<String, List<String>> entry : timetable.entrySet()) {
            qwe.add(String.valueOf(timetable.values()));
        }

        String s = "";
        for (String ss : qwe) {
            s = s + ss;
        }
        s = s.replace("[", "");
        s = s.replace("]", "");
        s = s.replace(" ", "");
        String[] q = s.split(",");

        Set<String> qw = new HashSet<>(List.of(q));

        return qw;
    }
}
