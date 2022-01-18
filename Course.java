package crs;

import java.util.ArrayList;

public class Course {

    public String code;
    public String name;
    ArrayList <String> prereqs = new ArrayList<>();
    ArrayList <String> coreqs = new ArrayList<>();
    public String discipline;
    public int period;
    public String timeblock;
    public int frequency;

<<<<<<< HEAD
    public Course(String code, String name, String discipline, int period, String timeblock, int frequency) {
=======
    public Course(String code, String name, String discipline, int period, String timeblock) {
>>>>>>> origin/main
        this.code = code;
        this.name = name;
        this.discipline = discipline;
        this.period = period;
        this.timeblock = timeblock;
        this.frequency = frequency;
    }

    public void addPrereq(String code) {
        prereqs.add(code);
    }

    public void addCoreq(String code) {
        coreqs.add(code);
    }
}


