import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class Scheduele {
	 static List<ArrayList<Course>> solve = new ArrayList<ArrayList<Course>>();

	
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
        
        
//        for(Set<Course> C: comb) {
//        	Predicate<? super Course> card = C;
//        	C.removeIf((card));
////        	if(!(C.size()==2)) {
        		
        	
        }
       List<Course> sched1 = new ArrayList<Course>();
       List<Course> sel = testlist.getSelected();
       List<Course> Period41 = sel.subList(0,2);
//       List<Course> scheduele = loop(sched1, sel, 0);
//       System.out.println(checkPeriod(sel));
       Course[] sched = new Course[16];
      
       
//        System.out.println(powerset(testlist).size());
//        Set<Set<Course>> comb =powerset(testlist);
//        Object[] arr = comb.toArray();
//        for(int i=0;i<45;i++) {
//        	System.out.println(comb.)
//        }
	}
	public static Course[] loop(Course[] sched1,List<Course> courses,int n) {
		Course[] stop = new Course[0];
		if(n==16) {
		if(checkAll(sched1)){
			return stop;
			//save to text here
		}
		
			
		
		}
		else {
			if(courses.get(n).options().size()>1) {
				for(int i=0;i<courses.get(n).periods().size();i++) {
					Course temp = new Course(courses.get(n).code,courses.get(n).name, courses.get(n).discipline, courses.get(n).periods().get(i),courses.get(n).timeblocks().get(i),2);
					for(int j:temp.options())
					{
						sched1[j] = temp;
						sched1 = loop(sched1,courses,n++);
					}
				}
				
	}
			else {
				for(int j:courses.get(n).options()) {
					sched1[j] = courses.get(n);
					sched1 = loop(sched1,courses,n++);
				}
			}
		
		}
		return stop;//return an empty course[] to stop the loop
	}
	public static boolean timeblockcheck(List<Course>sched1) {
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
		List<String> codes = new ArrayList<String>();//we dont have a way to get a course object from getPrereqs so we have to hold course codes in an array to search for index of prereqs
		for(int i=0;i<sched1.size();i++) {//fill the codes with the course codes
			codes.add(sched1.get(i+1).code);}
		for(int i=0;i<sched1.size()-1;i+=2) {//for the scheduele -1 since we are going by 2
			//
			for(int j=0;j<sched1.get(i).getPrereqs().size();j++) {//for each prereq
				
			if(codes.indexOf(sched1.get(i).getPrereqs().get(j))<sched1.indexOf(sched1.get(i))||codes.indexOf(sched1.get(i+1).getPrereqs().get(j))<sched1.indexOf(sched1.get(i+1))){//if the prereq shows up before
				//in a period(2 courses)
				return false;
				
			}}
			
				
			}
		return true;
		}
	
	public static boolean checkAll(Course[] sched1) {
		List<Course> temp = new ArrayList<Course>();
		for(int i=0;i<sched1.length;i++) {
			temp.add(sched1[i]);
		}
		if(prereqCheck(temp)&&timeblockcheck(temp)){
			return true;
		}
		return false;
	}
	}


		

		
				
			
			
			
			
			
			
			
			
			
		
	





