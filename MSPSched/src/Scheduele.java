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
       System.out.println(checkPeriod(sel));
      
       
//        System.out.println(powerset(testlist).size());
//        Set<Set<Course>> comb =powerset(testlist);
//        Object[] arr = comb.toArray();
//        for(int i=0;i<45;i++) {
//        	System.out.println(comb.)
//        }
       for (Course C1.options:testlist.getSelected()) {
    	   sched1.add(options,C1);
    	   for (Course C2:testlist.getSelected()) {
        	   sched1.add(2,C2);
        	   for (Course C3:testlist.getSelected()) {
            	   sched1.add(3,C3);
            	   ///
            	   tempcourse;
            	  //forloop approach
            	   if(n==16):
            		   if check:
            			   write   
            	   else:
        			   for(i,len(course[n].periods))
        				   if len(course[n].periods>1) :
        					   tempcourse = course(name,,,periods[i],timeblock[i])
        				   else :
        					   tempcourse = courses[n]
        				   for j in tempcourse.options://where options returns the possible indexes for the scheduel
        						   sched[j] = tempcourse
        					   
        						   repeat(n+1)
        						   
        				   
        		   }
        		   else 
        			   for j in course[n].options:
        						   sched[j] = course[n]
        				//cont
        							loop(sched,course, n+1)
        							
       }
    	   }
	
	}//recursion
    	   public static void loop (Course[] sched1,List<Course> courses, int n) {
    	   if(n==16) {//check
    		   
   
    		   if(sched1.check) {
    			   
    		   
    			  solve.add(sched1);
    		   
    	   }}
    		   
    	   
    		   course0= 1 ;
    		   course1 = 1,4;
//    		   course2 = 5;
    	   else{
    		   if len(course[n].periods>1) {
    			   for(i,len(course[n].periods))
    				   Course tempcourse = new course(name,,,periods[i],timeblock[i])
    				   for j in tempcourse.options://where options returns the possible indexes for the scheduel
    					   sched[j] = tempcourse
    					   
    					   sched =  loop(sched,course, n+1)
    					  
    				   
    		   }
    		   else 
    			   for j in course[n].options:
    						   sched[j] = course[n]
    				//cont
    							loop(sched,course, n+1)
    							
    	   
//    		   for (int option from courses[n].option) {
    			   
    		   }
    			   
    			   
    			   sched1[option] = Courses[n];
//    	    	   sched1.add(n,C);
    	    	   
    	    	   loop(sched1,courses,n+1);
    	    	   
    		   }
    		   
    		   }
    		}       
       
        
	
public static Set<Set<Course>> powerset(CourseList list){
			List<Course> set1 = list.getSelected();
			int n = set1.size();
			Set<Set<Course>> powerset = new HashSet<Set<Course>>();
			for(long i=0;i<(1<<n);i++) {
				Set<Course> element = new HashSet<Course>();
				for (int j=0;j<n;j++) {
					if((i>>j)%2==1) element.add(set1.get(j));
					powerset.add(element);
				}
			
			}
			return powerset;
			
			
				
			
			//for(int i=0;i<set1.size();i++) {
//				for(int j=set1.size();j>0;j--) {
//					ArrayList<ArrayList<Course>> temp = new ArrayList<ArrayList<Course>>();
//					temp.add(i, set2);
//				}
}

public 	
	

public static boolean checkPeriod(List<Course> sched1) {
	for (int i =0;i<8;i++) {
		if(!(sched.get(i,0).timeblock==sched.get(i,1).timeblock)) {
			return false;
		}
	
	}
//	for (Course C: Period51) {
//		if(!(C.period == 5||C.periodtwo==5)) {
//			return false;
//		}
//	
//			}
//	for (Course C: Period12) {
//		if(!(C.period == 1||C.periodtwo==1)) {
//			return false;
//}
//		
//		}
//	for (Course C: Period22) {
//		if(!(C.period == 2||C.periodtwo==2)) {
//			return false;
//}}
//	for (Course C: Period42) {
//		if(!(C.period == 4||C.periodtwo==4)) {
//			return false;
//		}
//		
//			
//		}
//	for (Course C: Period52) {
//		if(!(C.period == 5||C.periodtwo==5)) {
//			return false;
//		}}
//		for (Course C: Period13) {
//			if(!(C.period == 1||C.periodtwo==1)) {
//				return false;
//			}}	
//			for (Course C: Period23) {
//				if(!(C.period == 2||C.periodtwo==2)) {
//					return false;
//				}}
			return true;
							
	}
public static boolean checkblock(List<Course> sched1) {
//	List<String> temp = new ArrayList<String>();
//	for(int i=0;i<16;i++) {
//		temp.add(sched1.get(i).timeblock);
//		
//	}

//	List<String> shittycheck = new ArrayList<String>();

	List<Course> Period41 = sched1.subList(0, 2);
	List<Course> Period51 = sched1.subList(2, 4);
	List<Course> Period12 = sched1.subList(4, 6);
	List<Course> Period22 = sched1.subList(6, 8);
	List<Course> Period42 = sched1.subList(8, 10);
	List<Course> Period52 = sched1.subList(10, 12);
	List<Course> Period13 = sched1.subList(12, 14);
	List<Course> Period23 = sched1.subList(14, 16);
	
	if(Period41.get(0).timeblocktwo.equals("XX")&&Period41.get(1).timeblocktwo.equals("XX")) {
		if(Period41.get(0).timeblock.equals(Period41.get(1).timeblock)) {
			return false;
			}
			
		}
	if(!(Period41.get(0).timeblocktwo.equals("XX"))||!(Period41.get(1).timeblocktwo.equals("XX"))) {
		if(Period41.get(0).periodtwo==4) {
			if(Period41.get(0).timeblocktwo.equals(Period41.get(1).timeblock)) {
					return false;
		}
		if(Period41.get(1).periodtwo==4) {
			if(Period41.get(1).timeblocktwo.equals(Period41.get(0).timeblock)) {
				return false;
			}
	}
	
}
	}

//	
//}
//	if(Period51.get(0).timeblocktwo.equals("XX")&&Period51.get(1).timeblocktwo.equals("XX")) {
//		if(Period51.get(0).timeblock.equals(Period51.get(1).timeblock)) {
//			return false;
//			}
//			
//		}
//	if(!(Period51.get(0).timeblocktwo.equals("XX"))||!(Period51.get(1).timeblocktwo.equals("XX"))) {
//		if(Period51.get(0).periodtwo==5) {
//			if(Period51.get(0).timeblocktwo.equals(Period51.get(1).timeblock)) {
//					return false;
//		}
//		if(Period51.get(1).periodtwo==5) {
//			if(Period51.get(1).timeblocktwo.equals(Period51.get(0).timeblock)) {
//				return false;
//			}
//	}
//	
//}
//	
//}
//	if(Period12.get(0).timeblocktwo.equals("XX")&&Period12.get(1).timeblocktwo.equals("XX")) {
//		if(Period12.get(0).timeblock.equals(Period12.get(1).timeblock)) {
//			return false;
//			}
//			
//		}
//	if(!(Period12.get(0).timeblocktwo.equals("XX"))||!(Period12.get(1).timeblocktwo.equals("XX"))) {
//		if(Period12.get(0).periodtwo==1) {
//			if(Period12.get(0).timeblocktwo.equals(Period12.get(1).timeblock)) {
//					return false;
//		}
//		if(Period41.get(1).periodtwo==1) {
//			if(Period41.get(1).timeblocktwo.equals(Period41.get(0).timeblock)) {
//				return false;
//			}
//	}
//	
//}
//	
//}
	return true;
}

}
		

		
				
			
			
			
			
			
			
			
			
			
		
	





