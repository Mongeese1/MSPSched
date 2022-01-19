package crs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;


    public class Menu extends JMenuBar {

        public Menu (ActionListener actionListener, ItemListener itemListener){

            JMenuBar menuBar;
            JMenu menu, submenu;
            JMenuItem menuItem;
            JRadioButtonMenuItem rbMenuItem;
            JCheckBoxMenuItem cbMenuItem;

            JFrame frame = new JFrame("MSP Frame Schedule Planner");

            frame.setVisible(true);
            frame.setSize(1500,848);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            ImageIcon img = new ImageIcon("C:\\Users\\charl\\Downloads\\ImageMSPLogo.jpg");
            frame.setIconImage(img.getImage());


            menuBar = new JMenuBar();

            UIManager.put("MenuBar.background", Color.decode("#faa643"));
            Font M = new Font("Verdana", Font.BOLD, 12);
            UIManager.put("Menu.font", M);
            frame.setJMenuBar(menuBar);
            menu = new JMenu("Project 3000");

            menuBar.add(menu);

            menuItem= new JMenuItem("About");
            menuItem.addActionListener(actionListener);
            menu.add(menuItem);

            menu.addSeparator();

            menuItem = new JMenuItem("Goals");
            menuItem.addActionListener(actionListener);
            menu.add(menuItem);

            menu.addSeparator();

            menuItem = new JMenuItem("How does this work ?");
            menuItem.addActionListener(actionListener);
            menu.add(menuItem);

            menu.addSeparator();

            menuItem = new JMenuItem("Quit");
            menuItem.addActionListener(actionListener);
            menu.add(menuItem);

            /*------------------------------------------------------------------

            menu = new JMenu("Frame Schedule");
            menuBar.add(menu);

            ButtonGroup group = new ButtonGroup();
            rbMenuItem  = new JRadioButtonMenuItem("Current");
            rbMenuItem.setSelected(true);
            menuItem.addActionListener(actionListener);
            group.add(rbMenuItem);
            menu.add(rbMenuItem);


            rbMenuItem = new JRadioButtonMenuItem("Optimized");
            rbMenuItem.addItemListener(itemListener);
            group.add(rbMenuItem);
            menu.add(rbMenuItem);*/

            /*------------------------------------------------------------------

            menu = new JMenu("Period");
            menuBar.add(menu);

            group = new ButtonGroup();
            rbMenuItem  = new JRadioButtonMenuItem("Period 1");
            rbMenuItem.setSelected(true);
            menuItem.addItemListener(itemListener);
            group.add(rbMenuItem);
            menu.add(rbMenuItem);


            rbMenuItem = new JRadioButtonMenuItem("Period 2");
            rbMenuItem.addItemListener(itemListener);
            group.add(rbMenuItem);
            menu.add(rbMenuItem);

            rbMenuItem = new JRadioButtonMenuItem("Period 4");
            rbMenuItem.addItemListener(itemListener);
            group.add(rbMenuItem);
            menu.add(rbMenuItem);

            rbMenuItem = new JRadioButtonMenuItem("Period 5");
            rbMenuItem.addItemListener(itemListener);
            group.add(rbMenuItem);
            menu.add(rbMenuItem);*/


            //------------------------------------------------------------------

            menu = new JMenu ("Biology");
            menuBar.add(menu);


            submenu = new JMenu("lvl 2000");


            cbMenuItem = new JCheckBoxMenuItem("BIO2001 : Cell Biology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO2002 Ecology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO2003 General Botany");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO2004 General Zoology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO2005 Evolutionary Biology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO2007 Genetics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO2008 Great Transformations in Vertebrate Evolution");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO2010 Human Anatomy and Physiology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);
            menu.add(submenu);

            menu.addSeparator();

            submenu = new JMenu("lvl 3000");

            cbMenuItem = new JCheckBoxMenuItem("BIO3001 Molecular Biology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO3002 Ecophysiology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO3003 Microbiology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO3004 Animal Behavior");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO3007 Tropical Ecology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO3008 Hominin Paleontology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("BIO3010 Genomics and Proteomics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);
            menu.add(submenu);


            //------------------------------------------------------------------

            menu = new JMenu("Chemistry");
            menuBar.add(menu);

            submenu = new JMenu("lvl 2000");

            cbMenuItem = new JCheckBoxMenuItem("CHE2001 Organic Chemistry");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE2002 Inorganic Chemistry");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE2003 Physical Chemistry");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE2004 Spectroscopy");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE2006 Biochemistry");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE2007 Solid State Chemistry");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE2008 Main-Group Element Chemistry");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            menu.add(submenu);

            menu.addSeparator();

            submenu = new JMenu("lvl 3000");

            cbMenuItem = new JCheckBoxMenuItem("CHE3001 Organic Reactions");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE3002 Transition Metal Chemistry");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE3004 Modern Catalytic Chemistry");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE3006 Quantum Chemistry");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE3007 Advanced Physical Chemistry");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE3008 Analytical Science and Technology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("CHE3009 Crystallography");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            menu.add(submenu);


            //------------------------------------------------------------------

            menu = new JMenu("Mathematics & Computer Sciences");
            menuBar.add(menu);

            submenu = new JMenu("lvl 1000");

            cbMenuItem = new JCheckBoxMenuItem("MAT1006 Applied Statistics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("MAT1007 Mathematical tools for Scientists");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            menu.add(submenu);

            menu.addSeparator();

            submenu = new JMenu("lvl 2000");

            cbMenuItem = new JCheckBoxMenuItem("MAT2002 Optimization");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("MAT2004 Linear Algebra");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("MAT2005 Statistics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("MAT2006 Calculus");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("MAT2007 Introduction to Programming");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("MAT2008 Differential Equations");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("MAT2009 Multivariable Calculus");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            menu.add(submenu);
            //------------------------------------------------------------------

            menu = new JMenu("Physics");
            menuBar.add(menu);

            submenu = new JMenu("lvl 2000");

            cbMenuItem = new JCheckBoxMenuItem("PHY2001 Classical Mechanics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY2002 Thermodynamics and Statistical Physics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY2003 Vibrations and Waves");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY2004 Electromagnetism");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY2005 Quantum Theory");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY2006 Electronics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY2007 Optics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY2008 Solar System Astronomy");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY2009 Stellar Astronomy");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY2010 Galactic Astronomy");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            menu.add(submenu);

            menu.addSeparator();

            submenu = new JMenu("lvl 3000");

            cbMenuItem = new JCheckBoxMenuItem("PHY3001 Quantum Mechanics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY3002 Theory of Relativity");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY3004 Nuclear and Elementary Particle Physics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY3005 Relativistic Electrodynamics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY3006 General Relativity");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY3007 Advanced Mathematical Techniques of Physics");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("PHY3008 Cosmology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            menu.add(submenu);
            //------------------------------------------------------------------

            menu = new JMenu("Neuroscience");
            menuBar.add(menu);

            submenu = new JMenu("lvl 1000");

            cbMenuItem = new JCheckBoxMenuItem("NEU1001 Introduction to Neuroscience")
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);;
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("NEU1002 Cognitive Neurosciences: Biological Foundations of Behavior");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            menu.add(submenu);

            menu.addSeparator();

            submenu = new JMenu("lvl 2000");

            cbMenuItem = new JCheckBoxMenuItem("NEU2001 Cognitive Neurosciences: Sensation and Perception");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            cbMenuItem = new JCheckBoxMenuItem("NEU2002 Neuropsychopharmacology");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            menu.add(submenu);

            menu.addSeparator();

            submenu = new JMenu("lvl 3000");

            cbMenuItem = new JCheckBoxMenuItem("NEU3001 Neuroscience of Action");
            cbMenuItem.setSelected();
            cbMenuItem.addItemListener(itemListener);
            submenu.add(cbMenuItem);

            menu.add(submenu);
            //------------------------------------------------------------------

            menu = new JMenu("Interdisciplinary");
            menuBar.add(menu);


        }
    }

}
