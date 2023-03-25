package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;

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

        Set<String> qwq = new HashSet<>(List.of(q));
        Set<String> qw = Collections.unmodifiableSet(qwq);

        return qw;
    }
}
