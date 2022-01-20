import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
			
			
				
			
			
			
			
			
			
			
			
			
		}
	





