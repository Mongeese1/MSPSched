package crs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Schedule {
    static ArrayList<ArrayList<Course>> solutions = new ArrayList <> ();
    static int counter;

    public static void main(String[] args) {
        CourseList testlist = new CourseList();
        testlist.select("CHE2001");
        testlist.select("MAT2006");
        //testlist.select("MAT1006");
        testlist.select("PHY2001");
        testlist.select("MAT2004");
        testlist.select("MAT2007");
        testlist.select("CHE2004");
        testlist.select("CHE2006");
        testlist.select("PHY3002");
        testlist.select("NEU1001");
        //testlist.select("BIO2003");
        //testlist.select("BIO2004");
        testlist.select("HUM2051");
        testlist.select("PHY3006");
        testlist.select("NEU1002");
        testlist.select("INT3001");
        testlist.select("PHY2009");
        //testlist.select("INT1005");
        testlist.select("SCI3005");
        testlist.select("PHY2010");
        System.out.println(testlist.getSelected().size());
        if (testlist.checkSelected()) {
            System.out.println("Hooray!");
        }

        List<Course> sel = testlist.getSelected();
        Course[] sched = new Course[16];//create an empty schedule array to be filled
        if ( loop(sched,sel,0) ) {//if solution
            System.out.println("We have a solution");

        }
        if(solutions.size()==0) {
            System.out.println("Selected courses do not fit within a schedule");

        }
    }
    /**
    writeToTxt
    input List of course arraylists
    return void
    method to write course names to text files
    */
    public static void writeToTxt(ArrayList<ArrayList<String>> courses) {

    }

    /**
     * helper
     * input list of course arraylists
     * return list of course names
     * helper function return list of course names so they can be written to a text file and a student can see their schedule
     */
    public static List<String> helper(ArrayList<ArrayList<Course>> solutions){
        List<String> toTxt = new ArrayList<String>();
        for(ArrayList<Course> A: solutions) {
            for(int i=0;i<A.size();i++) {
                toTxt.add(A.get(i).name);
            }

        }
        return toTxt;
    }

    /**
     * loop
     * input sched1: empty course array to be filled
     * input courses: arraylist of selected course objects
     * input n: set to 0 when calling, used to recur function
     * return boolean: return true if a valid schedule is found, else recur
     * recursive method to fill an empty course array within the constraints specified by the MSP timetable, adds the results to a arraylist of possible solutions
     */
    public static boolean loop(Course[] sched1,List<Course> courses,int n) {
        boolean bResult;
        if(n==16) {
            counter++;
            if(checkAll(sched1)){//if the schedule passes the prereq & timeblock check
                bResult = true;
                solutions.add (ListCopy(sched1));
            }
            else {//else
                bResult = false;
            }
        }
        else {
            bResult = false;
            if(courses.get(n).options().size()>4) {//for each possible option
                for(int i=0;i<courses.get(n).periods().size();i++) {//for each period the course appears in the schedule

                    Course temp = new Course(courses.get(n).code,courses.get(n).name, courses.get(n).discipline, courses.get(n).periods().get(i),courses.get(n).timeblocks().get(i),1);//create a temporary
                    //course to hold courses that appear twice in the schedule, so that all possible options are filled
                    if(courses.get(n).code.equals("BI02007")) {//hardcoded constraint for the only course that appears twice with a prereq
                        temp.addPrereq("BIO2001");
                    }
                    for(int j:temp.options())//for each temporary course option
                    {
                        if (sched1[j]==null) {//if the array isn't filled
                            boolean loopresult;
                            Course[] sched2 = ArrayCopy(sched1);//copy the array
                            sched2[j] = temp;//fill the schedule with the course
                            loopresult = loop(sched2, courses, n + 1);
                            bResult = bResult || loopresult;
                        }
                    }
                }

            }
            else {
                for(int j:courses.get(n).options()) {
                    if (sched1[j]==null) {
                        boolean loopresult;
                        Course[] sched2 = ArrayCopy(sched1);
                        sched2[j] = courses.get(n);
                        loopresult = loop(sched2, courses, n + 1);
                        bResult = bResult || loopresult;
                    }
                }
            }
        }
        return bResult;
    }

    /**
     * ArrayCopy
     * input Course[]
     * return Course[]
     * helper function to create a a copy of a scheduke
     */
    private static Course[] ArrayCopy(Course [] sched) {
        Course[] newsched = new Course[16];
        for (int i = 0; i<16; i++) {
            newsched[i]=sched[i];
        }
        return newsched;
    }

    private static ArrayList<Course> ListCopy(Course [] sched) {
        ArrayList <Course> newsched = new ArrayList<Course>();
        for (int i = 0; i<16; i++) {
            newsched.add(sched[i]);
        }
        return newsched;
    }

    /**
     * timeblockCheck
     * input sched1: input a schedule to check if all timeblocks are valid
     * return boolean: returns true if no clashes found in timetable
     *
     */
    public static boolean timeblockCheck(List<Course>sched1) {
        for(int i = 0;i<sched1.size()-1;i+=2) {
            if(sched1.get(i).timeblocktwo.equals("XX")&&sched1.get(i+1).timeblocktwo.equals("XX")) {
                if(sched1.get(i).timeblock.equals(sched1.get(i+1).timeblock)) {
                    return false;
                }

            }
            else if(!(sched1.get(i).timeblocktwo.equals("XX"))||!(sched1.get(i+1).timeblocktwo.equals("XX"))) {
                if(sched1.get(i).timeblocktwo.equals(sched1.get(i+1).timeblock)||sched1.get(i).timeblock.equals(sched1.get(i+1).timeblocktwo)){
                    return false;
                }
            }
            else {
                if(sched1.get(i).timeblocktwo.equals(sched1.get(i+1).timeblocktwo)){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * prereq
     * input sched1: input a schedule to check if all timeblocks are valid
     * return boolean: returns true if prereq after its course
     * method to check if a prereq ever appears after the course it is a prereq for
     */
    public static boolean prereqCheck(List<Course> sched1) {
        List<String> codes = new ArrayList<String>();//we don't have a way to get a course object from getPrereqs, so we have to hold course codes in an array to search for index of prereqs
        for(int i=0;i<sched1.size();i++) {//fill the codes with the course codes
            codes.add(sched1.get(i).code);}
        for(int i=0;i<sched1.size()-1;i+=2) {//for the schedule -1 since we are going by 2
            for(int j=0;j<sched1.get(i).getPrereqs().size();j++) {//for each prereq
                int i1 = codes.indexOf(sched1.get(i).getPrereqs().get(j));
                if(i1>=i){//if the prereq shows up before
                    //in a period(2 courses)
                    return false;
                }
            }
        }
        for(int i=1;i<sched1.size();i+=2) {//for the schedule -1 since we are going by 2
            for(int j=0;j<sched1.get(i).getPrereqs().size();j++) {//for each prereq
                int i1 = codes.indexOf(sched1.get(i).getPrereqs().get(j));
                if(i1>=i-1){//if the prereq shows up before
                    //in a period(2 courses)
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkAll(Course[] sched1) {
        List<Course> temp = new ArrayList<Course>();
        for(int i=0;i<sched1.length;i++) {
            temp.add(sched1[i]);
        }
        if(prereqCheck(temp)&&timeblockCheck(temp)){
            return true;
        }
        return false;
    }
}










































