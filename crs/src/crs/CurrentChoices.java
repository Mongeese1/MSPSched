import crs.Course;
import crs.CourseList;

import java.util.ArrayList;

public class CurrentChoices {
    public static void main(String[] args) {
        CourseList testlist = new CourseList();
        testlist.select("PHY2001");
        testlist.select("MAT2004");
        testlist.select("PHY3001");
        testlist.select("CHE2006");
        testlist.deselect("PHY2001");
        System.out.println(testlist.getSelected().size());
        if (testlist.checkSelected()) {
            System.out.println("Hooray!");
        }
    }
}
