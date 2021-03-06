package crs;
import java.util.ArrayList;
import java.util.List;

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
    public int periodtwo;
    public String timeblocktwo;

    public Course(String code, String name, String discipline, int period, String timeblock, int frequency) {
        this.code = code;
        this.name = name;
        this.discipline = discipline;
        this.period = period;
        this.timeblock = timeblock;
        this.frequency = frequency;
        this.selected = false;
        this.periodtwo = 0;
        this.timeblocktwo = "XX";
    }

    public void addPrereq(String code) {
        prereqs.add(code);
    }

    public void addCoreq(String code) {
        coreqs.add(code);
    }

    public List<Integer> options() {
        List<Integer> opt =new ArrayList<Integer>();

        if(this.period==1||this.periodtwo ==1) {
            opt.add(4);
            opt.add(5);
            opt.add(12);
            opt.add(13);
        }

        if(this.period==2||this.periodtwo ==2) {
            opt.add(6);
            opt.add(7);
            opt.add(14);
            opt.add(15);

        }
        if(this.period==4||this.periodtwo ==4){
            opt.add(0);
            opt.add(1);
            opt.add(8);
            opt.add(9);

        }
        if((this.period==5||this.periodtwo==5)) {
            opt.add(2);
            opt.add(3);
            opt.add(10);
            opt.add(11);

        }
        return opt;
    }

    public List<Integer> periods(){
        List<Integer> periods = new ArrayList<Integer>();
        if(this.periodtwo==0) {
            periods.add(this.period);
        }
        else {
            periods.add(this.period);
            periods.add(this.periodtwo);
        }
        return periods;
    }

    public List<String> timeblocks(){
        List<String> timeblocks = new ArrayList<String>();
        if(this.timeblocktwo.equals("XX")) {
            timeblocks.add(this.timeblock);
        }
        else {
            timeblocks.add(this.timeblock);
            timeblocks.add(this.timeblocktwo);
        }
        return timeblocks;
    }

    public void addPeriodTwo(int period, String timeblock) {
        this.periodtwo = period;
        this.timeblocktwo = timeblock;
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

    public ArrayList<String> getCoreqs() {
        return coreqs;
    }
}

