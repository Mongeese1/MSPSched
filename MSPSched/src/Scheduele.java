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
	
	public static void main(String[] args) {
        CourseList testlist = new CourseList();
        testlist.select("PHY2001");
        testlist.select("MAT2006");
        //testlist.select("MAT1006");
        testlist.select("MAT2004");
        testlist.select("PHY3002");
        testlist.select("CHE2006");
        testlist.select("PHY3006");
        testlist.select("HUM2051");
        testlist.select("MAT1007");
        testlist.select("BIO2002");
        //testlist.select("BIO2003");
        //testlist.select("BIO2004");
        testlist.select("CHE2002");
        testlist.select("CHE2007");
        testlist.select("INT3010");
        testlist.select("INT1003");
        testlist.select("INT1006");
        //testlist.select("INT1005");
        testlist.select("CHE2001");
        testlist.select("CHE3007");
        System.out.println(testlist.getSelected().size());
        if (testlist.checkSelected()) {
            System.out.println("Hooray!");
        
        
//        for(Set<Course> C: comb) {
//        	Predicate<? super Course> card = C;
//        	C.removeIf((card));
////        	if(!(C.size()==2)) {
        		
        	
        }
       List<Course> sched1 = new ArrayList<Course>();
       List<Course> scheduele = loop(sched1, testlist, 0);
       System.out.println(scheduele.size());
//        System.out.println(powerset(testlist).size());
//        Set<Set<Course>> comb =powerset(testlist);
//        Object[] arr = comb.toArray();
//        for(int i=0;i<45;i++) {
//        	System.out.println(comb.)
//        }
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
public static List<Course> loop (List<Course> sched,CourseList list, int n) {
	List<Course> sched1 = list.getSelected();
	if(n==16) {
		if(!(((CourseList) sched1).checkSelected())) {
			for(Course C: list.getSelected()) {
				((CourseList) sched1).select(C.code);
				//this is where we write to a txt
			}
			return sched1;//put something here to break loop
			
		}
		else {
			for(Course C: list.getSelected()) {
				sched1.add(n, C);
				loop(sched1,list,n+1);
				
			}
		}
		
	}
	return sched1;
}
}


			

		
				
			
			
			
			
			
			
			
			
			
		
	





