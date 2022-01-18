package crs;

import java.util.ArrayList;

public class CourseList {
    public static void main(String[] args) {
        ArrayList <Course> courselist = new ArrayList<>();
        Course C;

        //------------------------------------BIOLOGY-----------------------------------------------------------------

        C = new Course("BIO2001","Cell Biology", "Biology", 1,"AG",1);
        courselist.add(C);
        C = new Course("BIO2001","Cell Biology", "Biology", 4,"EH",1);
        courselist.add(C);//double appearance in schedule

        C = new Course("BIO2002","Ecology", "Biology", 5,"XX",1);
        courselist.add(C);

        C = new Course("BIO2003","General Botany", "Biology", 4,"AG",1);
        courselist.add(C);

        C = new Course("BIO2004","General Zoology", "Biology", 1,"BG",1);
        courselist.add(C);

        C = new Course("BIO2005","Evolutionary Biology", "Biology", 4,"BG",1);
        courselist.add(C);

        C = new Course("BIO2007","Genetics", "Biology", 1,"CH",1);
        courselist.add(C);
        C = new Course("BIO2007","Genetics", "Biology", 4,"CH",1);
        courselist.add(C);//double appearance in schedule

        C = new Course("BIO2008","Great Transformations in Vertebrate Evolution", "Biology", 2,"EH",1);
        courselist.add(C);

        C = new Course("BIO2010","Human Anatomy and Physiology", "Biology", 4,"BG",1);
        courselist.add(C);

        C = new Course("BIO3001","Molecular Biology", "Biology", 2,"CH",1);
        courselist.add(C);
        C = new Course("BIO3001","Molecular Biology", "Biology", 5,"XX",1);
        courselist.add(C);//double appearance in schedule

        C = new Course("BIO3002","Ecophysiology", "Biology", 2,"EH",2);
        courselist.add(C);

        C = new Course("BIO3003","Microbiology", "Biology", 5,"XX",1);
        courselist.add(C);

        C = new Course("BIO3004","Animal Behavior", "Biology", 5,"XX",1);
        courselist.add(C);

        C = new Course("BIO3007","Tropical Ecology", "Biology", 2,"DH",1);
        courselist.add(C);

        C = new Course("BIO3008","Hominin Paleontology", "Biology", 5,"XX",1);
        courselist.add(C);

        C = new Course("BIO3010","Genomics and Proteomics", "Biology", 4,"EH",1);
        courselist.add(C);

        //------------------------------------CHEMISTRY-----------------------------------------------------------------


        C = new Course("CHE2001", "Organic Chemistry", "Chemistry", 1, "EH",1);
        courselist.add(C);
        C = new Course("CHE2001", "Organic Chemistry", "Chemistry", 4, "AG",1);
        courselist.add(C); //double appearance in schedule

        C = new Course("CHE2002", "Inorganic Chemistry", "Chemistry", 1, "BG",1);
        courselist.add(C);

        C = new Course("CHE2003", "Physical Chemistry", "Chemistry", 1, "CH",1);
        courselist.add(C);

        C = new Course("CHE2004", "Spectroscopy", "Chemistry", 1, "AG",1);
        C.addPrereq("CHE2001");
        courselist.add(C);

        C = new Course("CHE2006", "Biochemistry", "Chemistry", 2, "CH",1);
        courselist.add(C);

        C = new Course("CHE2007", "Solid State Chemistry", "Chemistry", 4, "DH",1);
        courselist.add(C);

        C = new Course("CHE2008", "Main-Group Element Chemistry", "Chemistry", 2, "DH",1);
        courselist.add(C);

        C = new Course("CHE3001", "Organic Reactions", "Chemistry", 2, "AG",1);
        C.addPrereq("CHE2001");
        C.addPrereq("CHE2004");
        courselist.add(C);

        C = new Course("CHE3002", "Transition Metal Chemistry", "Chemistry", 5, "BG",1);
        C.addPrereq("CHE2001");
        C.addPrereq("CHE2002");
        courselist.add(C);

        C = new Course("CHE3004", "Modern Catalytic Chemistry", "Chemistry", 2, "XX",2);
        C.addPrereq("CHE2001");
        C.addPrereq("CHE2002");
        courselist.add(C);

        C = new Course("CHE3006", "Quantum Chemistry", "Chemistry", 5, "CH",1);
        C.addPrereq("MAT1007");
        courselist.add(C);

        C = new Course("CHE3007", "Advanced Physical Chemistry", "Chemistry", 2, "EH",1);
        C.addPrereq("MAT1007");
        courselist.add(C);

        C = new Course("CHE3008", "Analytic Science and Technology", "Chemistry", 1, "DH",1);
        C.addPrereq("CHE2001");
        C.addPrereq("CHE2004");
        courselist.add(C);

        C = new Course("CHE3009", "Crystallography", "Chemistry", 5, "EH",1);
        C.addPrereq("CHE2002"); //OR
        C.addPrereq("CHE2003"); //OR
        C.addPrereq("MAT2004");
        courselist.add(C);

        //------------------------------------NEUROSCIENCE-----------------------------------------------------------------


        C = new Course("NEU1001", "Introduction to Neuroscience", "Neuroscience", 4, "CH",1);
        courselist.add(C);

        C = new Course("NEU1002", "Biological Foundations of Behaviour", "Neuroscience", 5, "BG",1);
        courselist.add(C);

        C = new Course("NEU2001", "Sensation and Perception", "Neuroscience", 2, "DH",1);
        C.addPrereq("NEU1002");
        courselist.add(C);

        C = new Course("NEU2002", "Neuropsychopharmacology", "Neuroscience", 5, "EH",1);
        C.addPrereq("NEU1001"); //OR
        C.addPrereq("INT2008");
        courselist.add(C);


        C = new Course("NEU3001", "Neuroscience of Action", "Neuroscience", 1, "DH",1);
        C.addPrereq("NEU1002");
        C.addPrereq("NEU2001");
        courselist.add(C);

        //------------------------------------INTERDISCIPLPINARY-----------------------------------------------------------------

        C = new Course("INT1003", "Introduction to Biomedical Engineering", "Interdisciplinary",4, "AG",1);
        courselist.add(C);

        C = new Course("INT1005", "Commercializing Science and Technology", "Interdisciplinary",5, "XX",1);
        courselist.add(C);

        C = new Course("INT1006", "Sustainable Development", "Interdisciplinary",2, "AG",1);
        courselist.add(C);

        C = new Course("INT2007", "Science in Action", "Interdisciplinary",2, "BG",1);
        courselist.add(C);

        C = new Course("INT2008", "Molecular Toxicology", "Interdisciplinary",4, "AG",1);
        courselist.add(C);

        C = new Course("INT2009", "Biophysics", "Interdisciplinary",4, "DH",1);
        courselist.add(C);

        C = new Course("INT2010", "Principle of Mass Spectrometry", "Interdisciplinary",4, "CH",1);
        courselist.add(C);

        C = new Course("INT3001", "The Philosophy of Technology", "Interdisciplinary",1, "BG",1);
        courselist.add(C);

        C = new Course("INT3002", "Advanced Microscopy: Theory and Applications", "Interdisciplinary",5, "XX",1);
        courselist.add(C);

        C = new Course("INT3003", "Biomaterials", "Interdisciplinary",4, "DH",1);
        courselist.add(C);

        C = new Course("INT3005", "Biobased Materials and Technology", "Interdisciplinary",2, "BG",1);
        courselist.add(C);

        C = new Course("INT3007", "Systems Biology", "Interdisciplinary",2, "AG",1);
        courselist.add(C);

        C = new Course("INT3008", "Regenerative Medecine", "Interdisciplinary",4, "EH",1);
        courselist.add(C);

        C = new Course("INT3009", "Chemical Ecology", "Interdisciplinary",2, "XX",2);
        courselist.add(C);

        C = new Course("INT3010", "Science and the Visual Arts", "Interdisciplinary",4, "AG",1);
        courselist.add(C);




    }
}