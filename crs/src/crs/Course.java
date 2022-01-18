package crs;

import java.util.ArrayList;

public class Course {

    public final String code;
    public final String name;
    private final ArrayList <String> prereqs = new ArrayList<>();
    private final ArrayList <String> coreqs = new ArrayList<>();
    public final String discipline;
    public final int period;
    public final String timeblock;
    public final int frequency;
    private boolean selected;

    public Course(String code, String name, String discipline, int period, String timeblock, int frequency) {
        this.code = code;
        this.name = name;
        this.discipline = discipline;
        this.period = period;
        this.timeblock = timeblock;
        this.frequency = frequency;
        this.selected = false;
    }

    public void addPrereq(String code) {
        prereqs.add(code);
    }

    public void addCoreq(String code) {
        coreqs.add(code);
    }

    public void select() {
        this.selected = true;
    }

    public void deselect() {
        this.selected = false;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public ArrayList<String> getPrereqs() {
        return prereqs;
    }

}


