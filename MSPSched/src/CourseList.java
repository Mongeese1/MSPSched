import java.util.ArrayList;

public class CourseList {

    static ArrayList <Course> courselist = new ArrayList<>();

    public CourseList() {
        Course C;

        //---BIOLOGY----------------------------------------------------------------------------------------------------

        C = new Course("BIO2001","Cell Biology", "Biology", 1,"AG",1);
        C.addPeriodTwo(4,"EH");
        courselist.add(C);

        C = new Course("BIO2002","Ecology", "Biology", 5,"CH",1);
        courselist.add(C);

        C = new Course("BIO2003","General Botany", "Biology", 4,"AG",1);
        courselist.add(C);

        C = new Course("BIO2004","General Zoology", "Biology", 1,"BG",1);
        courselist.add(C);

        C = new Course("BIO2005","Evolutionary Biology", "Biology", 4,"BG",1);
        courselist.add(C);

        C = new Course("BIO2007","Genetics", "Biology", 1,"CH",1);
        C.addPrereq("BIO2001");
        C.addPeriodTwo(4, "CH");
        courselist.add(C);

        C = new Course("BIO2008","Great Transformations in Vertebrate Evolution", "Biology", 2,"EH",1);
        C.addPrereq("BIO2004"); //OR
        C.addPrereq("BIO2005");
        courselist.add(C);

        C = new Course("BIO2010","Human Anatomy and Physiology", "Biology", 4,"BG",1);
        courselist.add(C);

        C = new Course("BIO3001","Molecular Biology", "Biology", 2,"CH",1);
        C.addPrereq("BIO2001");
        C.addPrereq("BIO2007");
        courselist.add(C);
        C = new Course("BIO3001","Molecular Biology", "Biology", 5,"AG",1);
        C.addPrereq("BIO2001");
        C.addPrereq("BIO2007");
        courselist.add(C);//double appearance in schedule

        C = new Course("BIO3002","Ecophysiology", "Biology", 2,"EH",2);
        C.addPrereq("BIO2001");
        courselist.add(C);

        C = new Course("BIO3003","Microbiology", "Biology", 5,"DH",1);
        C.addPrereq("BIO2001");
        C.addPrereq("BIO2007");
        courselist.add(C);

        C = new Course("BIO3004","Animal Behavior", "Biology", 5,"BG",1);
        C.addPrereq("BIO2004");
        C.addPrereq("BIO2005");
        courselist.add(C);

        C = new Course("BIO3007","Tropical Ecology", "Biology", 2,"DH",1);
        C.addPrereq("BIO2002");
        courselist.add(C);

        C = new Course("BIO3008","Hominin Paleontology", "Biology", 5,"AG",1);
        C.addPrereq("BIO2005"); //OR
        C.addPrereq("BIO2008");
        courselist.add(C);

        C = new Course("BIO3010","Genomics and Proteomics", "Biology", 4,"EH",1);
        C.addPrereq("BIO2007");
        courselist.add(C);

        //---CHEMISTRY--------------------------------------------------------------------------------------------------

        C = new Course("CHE2001", "Organic Chemistry", "Chemistry", 1, "EH",1);
        C.addPeriodTwo(4, "AG");
        courselist.add(C);

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

        C = new Course("CHE3004", "Modern Catalytic Chemistry", "Chemistry", 2, "EH",2 );
        C.addPrereq("CHE2001");
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

        //---INTERDISCIPLINARY------------------------------------------------------------------------------------------

        C = new Course("INT1003", "Introduction to Biomedical Engineering", "Interdisciplinary",4, "AG",1);
        courselist.add(C);

        C = new Course("INT1005", "Commercializing Science and Technology", "Interdisciplinary",5, "AG",1);
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

        C = new Course("INT3002", "Advanced Microscopy: Theory and Applications", "Interdisciplinary",5, "DH",1);
        courselist.add(C);

        C = new Course("INT3003", "Biomaterials", "Interdisciplinary",4, "DH",1);
        C.addPrereq("CHE2001");
        courselist.add(C);

        C = new Course("INT3005", "Biobased Materials and Technology", "Interdisciplinary",2, "BG",1);
        C.addPrereq("CHE2001");
        courselist.add(C);

        C = new Course("INT3007", "Systems Biology", "Interdisciplinary",2, "AG",1);
        courselist.add(C);

        C = new Course("INT3008", "Regenerative Medicine", "Interdisciplinary",4, "EH",1);
        C.addPrereq("BIO2001");
        C.addPrereq("CHE2001");
        courselist.add(C);

        C = new Course("INT3009", "Chemical Ecology", "Interdisciplinary",2, "EH",2);
        C.addPrereq("BIO2001");
        C.addPrereq("CHE2001");
        courselist.add(C);

        C = new Course("INT3010", "Science and the Visual Arts", "Interdisciplinary",4, "AG",1);
        courselist.add(C);

        //---MATHEMATICS------------------------------------------------------------------------------------------------

        C = new Course("MAT1006", "Applied Statistics", "Math", 5, "EH",1);
        courselist.add(C);

        C = new Course("MAT1007", "Mathematical tools for scientists", "Math", 5, "DH",1);
        courselist.add(C);

        C = new Course("MAT2002", "Optimization", "Math",1 , "BG",1);
        C.addPrereq("MAT2004");
        courselist.add(C);

        C = new Course("MAT2004", "Linear Algebra", "Math",5 , "AG",1);
        courselist.add(C);

        C = new Course("MAT2005", "Statistics", "Math", 5, "BG",1);
        courselist.add(C);

        C = new Course("MAT2006", "Calculus", "Math",4 , "BG",1);
        courselist.add(C);

        C = new Course("MAT2007", "Introduction to Programming", "Math", 1, "CH",1);
        courselist.add(C);

        C = new Course("MAT2008", "Differential Equations", "Math",4 , "EH",1);
        C.addPrereq("MAT2006");
        courselist.add(C);

        C = new Course("MAT2009", "Multivariable Calculus", "Math",2 , "BG",1);
        C.addPrereq("MAT2006");
        courselist.add(C);

        //---NEUROSCIENCE-----------------------------------------------------------------------------------------------

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

        //---PHYSICS----------------------------------------------------------------------------------------------------

        C = new Course("PHY2001", "Classical Mechanics", "Physics", 5, "EH",1);
        C.addPrereq("MAT2006");
        courselist.add(C);

        C = new Course("PHY2002", "Thermodynamics and Statistical Physics", "Physics", 4, "CH",1);
        courselist.add(C);

        C = new Course("PHY2003", "Vibrations and Waves", "Physics",1 , "DH",1);
        C.addPrereq("PHY2001");
        courselist.add(C);

        C = new Course("PHY2004", "Electromagnetism", "Physics", 4, "EH",1);
        C.addPrereq("MAT2009");
        courselist.add(C);

        C = new Course("PHY2005", "Quantum Theory", "Physics", 5, "DH",1);
        C.addPrereq("MAT2004");
        courselist.add(C);

        C = new Course("PHY2006", "Electronics", "Physics",1 , "AG",1);
        courselist.add(C);

        C = new Course("PHY2007", "Optics", "Physics", 2, "AG",1);
        courselist.add(C);

        C = new Course("PHY2008", "Solar System Astronomy", "Physics", 4, "DH",1);
        courselist.add(C);

        C = new Course("PHY2009", "Stellar Astronomy", "Physics",1 , "EH",1);
        courselist.add(C);

        C = new Course("PHY2010", "Galactic Astronomy", "Physics", 2, "CH",1);
        courselist.add(C);

        C = new Course("PHY3001", "Quantum Mechanics", "Physics",1 , "BG",1);
        C.addPrereq("PHY2005");
        courselist.add(C);

        C = new Course("PHY3002", "Theory of Relativity", "Physics", 2, "DH",1);
        C.addPrereq("PHY2001");
        courselist.add(C);

        C = new Course("PHY3004", "Nuclear and Elementary Particle Physics", "Physics", 2, "BG",1);
        C.addPrereq("PHY2005");
        courselist.add(C);

        C = new Course("PHY3005", "Relativistic Electrodynamics", "Physics", 4, "BG",1);
        C.addPrereq("PHY2004");
        C.addPrereq("PHY3002");
        courselist.add(C);

        C = new Course("PHY3006", "General Relativity", "Physics", 5, "CH",1);
        C.addPrereq("PHY2001");
        C.addPrereq("PHY3002");
        courselist.add(C);

        C = new Course("PHY3007", "Advanced Mathematical Techniques of Physics", "Physics",1 , "EH",1);
        C.addPrereq("MAT2004");
        C.addPrereq("MAT2009");
        courselist.add(C);

        C = new Course("PHY3008", "Cosmology", "Physics",4 , "DH",1);
        C.addPrereq("MAT2004");//OR
        C.addPrereq("MAT2006");
        courselist.add(C);

        //---UCM--------------------------------------------------------------------------------------------------------

        C = new Course("SCI2031", "Immunology", "UCM", 5, "BG", 1);
        courselist.add(C);

        C = new Course("SCI3005", "Metabolism, Nutrition and Exercise", "UCM", 2, "BG", 1);
        C.addPrereq("CHE2006");
        courselist.add(C);

        C = new Course("SCI3007", "Endocrinology", "UCM", 1, "DH", 1);
        C.addPrereq("BIO2010");
        courselist.add(C);

        C = new Course("SCI3050", "Advances in Biomedical Sciences", "UCM", 2, "CH", 1);
        C.addPrereq("CHE2001"); //OR
        C.addPrereq("BIO2001");
        courselist.add(C);

        C = new Course("HUM2022", "Digital Media", "UCM", 2, "BG", 1);
        courselist.add(C);

        C = new Course("HUM2051","Philosophical Ethics", "UCM", 4, "AG", 1);
        courselist.add(C);
    }

    public void select(String code) {
        for (Course C : courselist) {
            if (code.equals(C.code)) {
                C.select();
            }
        }
    }

    public void deselect(String code) {
        for ( Course C : courselist ) {
            if (code.equals(C.code)) {
                C.deselect();
            }
        }
    }

    public ArrayList<Course> getSelected() {
        ArrayList <Course> selectedlist = new ArrayList<Course>();
        for( Course C : courselist) {
            if (C.isSelected()) {
                selectedlist.add(C);
            }
        }
        return selectedlist;
    }
    //check needs to be added for CHE2001, BIO2001 and BIO2007

    public static ArrayList<Course> getAll() {
        return courselist;
    }

    public boolean isSelected(String code) {
        for(Course C : getSelected()) {
            if (code.equals(C.code)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkMAT() {
        for( Course C : getSelected()) {
            if (C.discipline.equals("Math")) {
                return true;
            }
        }
        return false;
    }

    private boolean checkLAS() {
        for( Course C : getSelected()) {
            if (C.code.equals("HUM2051") || C.code.equals("INT3001") || C.code.equals("INT2007")) {
                return true;
            }
        }
        return false;
    }

    private boolean checkPRE() {
        for( Course C : getSelected()) {
            for(String S : C.getPrereqs()) {
                if (!isSelected(S)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkCO() {
        for(Course C : getSelected()) {
            for(String S : C.getCoreqs()) {
                if (!isSelected(S)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkAmount() {
        if(getSelected().size()==16) {
            return true;
        }
        return false;
    }

    private boolean checkHigh() {
        int num = 0;
        for(Course C : getSelected()) {
            if (C.code.charAt(3)=='3') {
                num++;
            }
        }
        if(num>=4) {
            return true;
        }
        return false;
    }


    private boolean checkLow() {
        int num = 0;
        for(Course C : getSelected()) {
            if (C.code.charAt(3)=='1') {
                num++;
            }
        }
        if(num<=4) {
            return true;
        }
        return false;
    }

    public boolean checkSelected() {
        if (!checkPRE()){
            return false;
        }

        if (!checkMAT()){
            return false;
        }

        if (!checkLAS()){
            return false;
        }

        if (!checkCO()){
            return false;
        }

        if (!checkAmount()){
            return false;
        }

        if (!checkHigh()){
            return false;
        }

        if (!checkLow()){
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Courses selected:");
        str.append("\n");
        for (Course C : getSelected()) {
            str.append(C.code + ": " + C.name);
            str.append("\n");
        }
        return str.toString();
    }
    public static void main(String... args) {
    	ArrayList<Course> select = getAll();
    	System.out.println(select.size());
    	
    }

    public void generateSchedule() {
    	

    }
}