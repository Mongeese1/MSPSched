package courses.biology.lvl2000;

import courses.biology.BIOint;
import courses.Courses;

public class BIO2001 extends Courses implements BIOint {
    private String BIO2003;
    String[] PreReq = {BIO2002,BIO2003};
    int period = 5;

    @Override
    public String name(){return "Cell Biology"; }
}
