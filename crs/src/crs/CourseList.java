package crs;

import java.util.ArrayList;

public class CourseList {
    public static void main(String[] args) {
        ArrayList <Course> courselist = new ArrayList<>();
        Course C;

        C = new Course("NEU1001", "Introduction to Neuroscience", "Neuroscience", 4, "CH");
        courselist.add(C);

        C = new Course("NEU1002", "Biological Foundations of Behaviour", "Neuroscience", 5, "BG");
        courselist.add(C);

        C = new Course("NEU2001", "Sensation and Perception", "Neuroscience", 2, "DH");
        C.addPrereq("NEU1002");
        courselist.add(C);

        C = new Course("NEU2002", "Neuropsychopharmacology", "Neuroscience", 5, "EH");
        C.addPrereq("NEU1001"); //OR
        C.addPrereq("INT2008");
        courselist.add(C);

        C = new Course("NEU3001", "Neuroscience of Action", "Neuroscience", 1, "DH");
        C.addPrereq("NEU1002");
        C.addPrereq("NEU2001");
        courselist.add(C);

        C = new Course("CHE2001", "Organic Chemistry", "Chemistry", 1, "EH");
        courselist.add(C);
        C = new Course("CHE2001", "Organic Chemistry", "Chemistry", 4, "AG");
        courselist.add(C); //double appearance in schedule

        C = new Course("CHE2002", "Inorganic Chemistry", "Chemistry", 1, "BG");
        courselist.add(C);

        C = new Course("CHE2003", "Physical Chemistry", "Chemistry", 1, "CH");
        courselist.add(C);

        C = new Course("CHE2004", "Spectroscopy", "Chemistry", 1, "AG");
        C.addPrereq("CHE2001");
        courselist.add(C);

        C = new Course("CHE2006", "Biochemistry", "Chemistry", 2, "CH");
        courselist.add(C);

        C = new Course("CHE2007", "Solid State Chemistry", "Chemistry", 4, "DH");
        courselist.add(C);

        C = new Course("CHE2008", "Main-Group Element Chemistry", "Chemistry", 2, "DH");
        courselist.add(C);

        C = new Course("CHE3001", "Organic Reactions", "Chemistry", 2, "AG");
        C.addPrereq("CHE2001");
        C.addPrereq("CHE2004");
        courselist.add(C);

        C = new Course("CHE3002", "Transition Metal Chemistry", "Chemistry", 5, "BG");
        C.addPrereq("CHE2001");
        C.addPrereq("CHE2002");
        courselist.add(C);

        C = new Course("CHE3006", "Quantum Chemistry", "Chemistry", 5, "CH");
        C.addPrereq("MAT1007");
        courselist.add(C);

        C = new Course("CHE3007", "Advanced Physical Chemistry", "Chemistry", 2, "EH");
        C.addPrereq("MAT1007");
        courselist.add(C);

        C = new Course("CHE3008", "Analytic Science and Technology", "Chemistry", 1, "DH");
        C.addPrereq("CHE2001");
        C.addPrereq("CHE2004");
        courselist.add(C);

        C = new Course("CHE3009", "Crystallography", "Chemistry", 5, "EH");
        C.addPrereq("CHE2002"); //OR
        C.addPrereq("CHE2003"); //OR
        C.addPrereq("MAT2004");
        courselist.add(C);
    }
}
