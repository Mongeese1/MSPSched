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
        ArrayList<ArrayList<Course>> comb1 = new ArrayList<ArrayList<Course>>();
        
	}
public static void helper(CourseList list){
			ArrayList<Course> set1 = list.getSelected();
			ArrayList<ArrayList<Course>> comb = new ArrayList<ArrayList<Course>>();
			int[] ind = new int[2];
			for (int i=0;i<8;i++) {
				ind[i]=i;
			}
			int i=0;
			while (i<8) {
				comb.get(0).add(null)
			}
			
				
			
			//for(int i=0;i<set1.size();i++) {
//				for(int j=set1.size();j>0;j--) {
//					ArrayList<ArrayList<Course>> temp = new ArrayList<ArrayList<Course>>();
//					temp.add(i, set2);
//				}
			}
			
			
				
			
			
			
			
			
			
			
			
			
		}
	





