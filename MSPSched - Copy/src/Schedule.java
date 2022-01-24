
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Schedule {
    static ArrayList<ArrayList<Course>> solutions = new ArrayList <> ();

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
        Course[] sched = new Course[16];
        if ( loop(sched,sel,0) ) {
            System.out.println("We have a solution");

        }
        if(solutions.size()==0) {
        	System.out.println("Selected courses do not fit within a schedule");
        	
        }
    }
    public static void writeToTxt(ArrayList<ArrayList<String>> courses) {
    	
    }
    public static List<String> helper(ArrayList<ArrayList<Course>> solutions){
    	List<String> toTxt = new ArrayList<String>();
    	for(ArrayList<Course> A: solutions) {
    		for(int i=0;i<A.size();i++) {
    			toTxt.add(A.get(i).name);
    		}
    		
    	}
    	return toTxt;
    }

    public static boolean loop(Course[] sched1,List<Course> courses,int n) {
        boolean bResult;
        if(n==16) {

            if(checkAll(sched1)){
                bResult = true;
                solutions.add (ListCopy(sched1));
            }
            else {
                bResult = false;
            }
        }
        else {
            bResult = false;
            if(courses.get(n).options().size()>4) {
                for(int i=0;i<courses.get(n).periods().size();i++) {

                    Course temp = new Course(courses.get(n).code,courses.get(n).name, courses.get(n).discipline, courses.get(n).periods().get(i),courses.get(n).timeblocks().get(i),2);
                    if(courses.get(n).code.equals("BI02007")) {
                        temp.addPrereq("BIO2001");
                    }
                    for(int j:temp.options())
                    {
                        if (sched1[j]==null) {
                            Course[] sched2 = ArrayCopy(sched1);
                            sched2[j] = temp;
                            bResult = bResult || loop(sched2, courses, n + 1); //?
                        }
                    }
                }

            }
            else {
                for(int j:courses.get(n).options()) {
                    if (sched1[j]==null) {
                        Course[] sched2 = ArrayCopy(sched1);
                        sched2[j] = courses.get(n);
                        bResult = bResult || loop(sched2, courses, n + 1);
                    }
                }
            }
        }
        return bResult;
    }

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





















