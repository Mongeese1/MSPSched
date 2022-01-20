

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Menu extends JMenuBar implements ActionListener, ItemListener {

    private Component frame;
    CourseList courselist = new CourseList();

    public JMenuBar createMenuBar(){

        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        //JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        menuBar = new JMenuBar();
        menu = new JMenu("Project 3000");

        menuBar.add(menu);

        menuItem= new JMenuItem("About");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menu.addSeparator();

        menuItem = new JMenuItem("Goals");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menu.addSeparator();

        menuItem = new JMenuItem("How does this work ?");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menu.addSeparator();

        menuItem = new JMenuItem("Quit");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //------------------------------------------------------------------

        menu = new JMenu ("Biology");
        menuBar.add(menu);


        submenu = new JMenu("lvl 2000");


        cbMenuItem = new JCheckBoxMenuItem("BIO2001 : Cell Biology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2002 Ecology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2003 General Botany");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2004 General Zoology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2005 Evolutionary Biology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2007 Genetics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2008 Great Transformations in Vertebrate Evolution");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2010 Human Anatomy and Physiology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);
        menu.add(submenu);

        menu.addSeparator();

        submenu = new JMenu("lvl 3000");

        cbMenuItem = new JCheckBoxMenuItem("BIO3001 Molecular Biology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3002 Ecophysiology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3003 Microbiology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3004 Animal Behavior");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3007 Tropical Ecology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3008 Hominin Paleontology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3010 Genomics and Proteomics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);
        menu.add(submenu);


        //------------------------------------------------------------------

        menu = new JMenu("Chemistry");
        menuBar.add(menu);

        submenu = new JMenu("lvl 2000");

        cbMenuItem = new JCheckBoxMenuItem("CHE2001 Organic Chemistry");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE2002 Inorganic Chemistry");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE2003 Physical Chemistry");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE2004 Spectroscopy");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE2006 Biochemistry");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE2007 Solid State Chemistry");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE2008 Main-Group Element Chemistry");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);

        menu.addSeparator();

        submenu = new JMenu("lvl 3000");

        cbMenuItem = new JCheckBoxMenuItem("CHE3001 Organic Reactions");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE3002 Transition Metal Chemistry");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE3004 Modern Catalytic Chemistry");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE3006 Quantum Chemistry");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE3007 Advanced Physical Chemistry");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE3008 Analytical Science and Technology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("CHE3009 Crystallography");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);


        //------------------------------------------------------------------

        menu = new JMenu("Mathematics & Computer Sciences");
        menuBar.add(menu);

        submenu = new JMenu("lvl 1000");

        cbMenuItem = new JCheckBoxMenuItem("MAT1006 Applied Statistics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("MAT1007 Mathematical tools for Scientists");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);

        menu.addSeparator();

        submenu = new JMenu("lvl 2000");

        cbMenuItem = new JCheckBoxMenuItem("MAT2002 Optimization");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("MAT2004 Linear Algebra");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("MAT2005 Statistics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("MAT2006 Calculus");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("MAT2007 Introduction to Programming");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("MAT2008 Differential Equations");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("MAT2009 Multivariable Calculus");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);
        //------------------------------------------------------------------

        menu = new JMenu("Physics");
        menuBar.add(menu);

        submenu = new JMenu("lvl 2000");

        cbMenuItem = new JCheckBoxMenuItem("PHY2001 Classical Mechanics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY2002 Thermodynamics and Statistical Physics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY2003 Vibrations and Waves");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY2004 Electromagnetism");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY2005 Quantum Theory");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY2006 Electronics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY2007 Optics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY2008 Solar System Astronomy");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY2009 Stellar Astronomy");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY2010 Galactic Astronomy");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);

        menu.addSeparator();

        submenu = new JMenu("lvl 3000");

        cbMenuItem = new JCheckBoxMenuItem("PHY3001 Quantum Mechanics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY3002 Theory of Relativity");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY3004 Nuclear and Elementary Particle Physics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY3005 Relativistic Electrodynamics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY3006 General Relativity");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY3007 Advanced Mathematical Techniques of Physics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("PHY3008 Cosmology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);
        //------------------------------------------------------------------

        menu = new JMenu("Neuroscience");
        menuBar.add(menu);

        submenu = new JMenu("lvl 1000");

        cbMenuItem = new JCheckBoxMenuItem("NEU1001 Introduction to Neuroscience");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("NEU1002 Cognitive Neurosciences: Biological Foundations of Behavior");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);

        menu.addSeparator();

        submenu = new JMenu("lvl 2000");

        cbMenuItem = new JCheckBoxMenuItem("NEU2001 Cognitive Neurosciences: Sensation and Perception");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("NEU2002 Neuropsychopharmacology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);

        menu.addSeparator();

        submenu = new JMenu("lvl 3000");

        cbMenuItem = new JCheckBoxMenuItem("NEU3001 Neuroscience of Action");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);
        //------------------------------------------------------------------

        menu = new JMenu("Interdisciplinary");
        menuBar.add(menu);

        submenu = new JMenu("lvl 1000");

        cbMenuItem = new JCheckBoxMenuItem("INT1003 Introduction to Biomedical Engineering");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("INT1005 Commercializing Science and Technology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("INT1006 Sustainable Development");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);

        menu.addSeparator();

        submenu = new JMenu("lvl 2000");

        cbMenuItem = new JCheckBoxMenuItem("INT2007 Science in Action");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("INT2008 Molecular Toxicology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("INT2009 Biophysics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("INT2010 Principles of Mass Spectrometry");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);

        menu.addSeparator();

        submenu = new JMenu("lvl 3000");

        cbMenuItem = new JCheckBoxMenuItem("INT3001 Philosophy of Technology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("INT3002 Advanced Microscopy: Theory and Applications");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("INT3003 Biomaterials");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("INT3005 Biobased Materials and Technology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("INT3007 Systems Biology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("INT3008 Regenerative Medicine");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("INT3010 Science and the Visual Arts");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);

        //------------------------------------------------------------------

        menu = new JMenu("UCM");

        submenu = new JMenu("lvl 2000");

        cbMenuItem = new JCheckBoxMenuItem("SCI2031 Immunology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("HUM2022 Digital Media");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("HUM2051 Philosophical Ethics");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);

        menu.addSeparator();

        submenu = new JMenu("lvl 3000");

        cbMenuItem = new JCheckBoxMenuItem("SCI3005 Metabolism, Nutrition and Exercise");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("SCI3007 Endocrinology");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("SCI3050 Advances in Biomedical Sciences");
        cbMenuItem.setSelected(false);
        cbMenuItem.addItemListener(this);
        submenu.add(cbMenuItem);

        menu.add(submenu);

        menuBar.add(menu);

        return menuBar;


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem) e.getSource();

        if (source.getText().equals("About")) {
            Main.showAboutDialog();
        }else if (source.getText().equals("Goals")){
            Main.showGoalsDialog();
        }else if (source.getText().equals("How does this work ?")){
            Main.showExplanationDialog();
        }else if (source.getText().equals("Quit")){
            System.exit(0);
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JMenuItem source = (JMenuItem)e.getSource();


        if (source.getText().contains("BIO")){
            for(Course C : courselist.courselist) {
                if(source.getText().contains(C.code)){
                    if(!courselist.isSelected(C.code)){
                        C.select();
                    }else {C.deselect();}
                    //System.out.println(courselist.getSelected().size());
                    System.out.println(courselist.toString());
                }
            }

        }else if (source.getText().contains("CHE")){
            for(Course C: courselist.courselist){
                if(source.getText().contains(C.code)){
                    if(!courselist.isSelected(C.code)){
                        C.select();
                    }else {C.deselect();}
                    //System.out.println(courselist.getSelected().size());
                    System.out.println(courselist.toString());
                }
            }

        }else if (source.getText().contains("MAT")){
            for(Course C: courselist.courselist){
                if(source.getText().contains(C.code)){
                    if(!courselist.isSelected(C.code)){
                        C.select();
                    }else {C.deselect();}
                    //System.out.println(courselist.getSelected().size());
                    System.out.println(courselist.toString());
                }
            }

        }else if (source.getText().contains("PHY")){
            for(Course C: courselist.courselist){
                if(source.getText().contains(C.code)){
                    if(!courselist.isSelected(C.code)){
                        C.select();
                    }else {C.deselect();}
                    //System.out.println(courselist.getSelected().size());
                    System.out.println(courselist.toString());
                }
            }

        }else if (source.getText().contains("NEU")){
            for(Course C: courselist.courselist){
                if(source.getText().contains(C.code)){
                    if(!courselist.isSelected(C.code)){
                        C.select();
                    }else {C.deselect();}
                    //System.out.println(courselist.getSelected().size());
                    System.out.println(courselist.toString());
                }
            }

        }else if (source.getText().contains("INT")){
            for(Course C: courselist.courselist){
                if(source.getText().contains(C.code)){
                    if(!courselist.isSelected(C.code)){
                        C.select();
                    }else {C.deselect();}
                    //System.out.println(courselist.getSelected().size());
                    System.out.println(courselist.toString());
                }
            }

        }else if (source.getText().contains("SCI")){
            for(Course C: courselist.courselist){
                if(source.getText().contains(C.code)){
                    if(!courselist.isSelected(C.code)){
                        C.select();
                    }else {C.deselect();}
                    //System.out.println(courselist.getSelected().size());
                    System.out.println(courselist.toString());
                }
            }

        }else if (source.getText().contains("HUM")){
            for(Course C: courselist.courselist){
                if(source.getText().contains(C.code)){
                    if(!courselist.isSelected(C.code)){
                        C.select();
                    }else {C.deselect();}
                    //System.out.println(courselist.getSelected().size());
                    System.out.println(courselist.toString());
                }
            }
        }

    }
}




