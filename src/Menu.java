import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

public class Menu extends JMenuBar{

    public static void main (String[] args){

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
        //menuItem.addActionListener(actionListener);
        menu.add(menuItem);

        menu.addSeparator();

        menuItem = new JMenuItem("Goals");
        //menuItem.addActionListener(actionListener);
        menu.add(menuItem);

        menu.addSeparator();

        menuItem = new JMenuItem("How does this work ?");
        menu.add(menuItem);

        menu.addSeparator();

        menuItem = new JMenuItem("Quit");
        //menuItem.addActionListener(actionListener);
        menu.add(menuItem);

        //------------------------------------------------------------------

       menu = new JMenu("Frame Schedule");
        menuBar.add(menu);

        ButtonGroup group = new ButtonGroup();
        rbMenuItem  = new JRadioButtonMenuItem("Current");
        rbMenuItem.setSelected(true);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);


        rbMenuItem = new JRadioButtonMenuItem("Optimized");
       //rbMenuItem.addItemListener(itemListener);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        //------------------------------------------------------------------

        menu = new JMenu("Period");
        menuBar.add(menu);

        group = new ButtonGroup();
        rbMenuItem  = new JRadioButtonMenuItem("Period 1");
        rbMenuItem.setSelected(true);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);


        rbMenuItem = new JRadioButtonMenuItem("Period 2");
        //rbMenuItem.addItemListener(itemListener);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Period 4");
        //rbMenuItem.addItemListener(itemListener);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Period 5");
        //rbMenuItem.addItemListener(itemListener);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);


        //------------------------------------------------------------------

        menu = new JMenu ("Biology");
        menuBar.add(menu);


        submenu = new JMenu("lvl 2000");


        cbMenuItem = new JCheckBoxMenuItem("BIO2001 : Cell Biology");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2002 Ecology");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2003 General Botany");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2004 General Zoology");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2005 Evolutionary Biology");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2007 Genetics");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2008 Great Transformations in Vertebrate Evolution");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO2010 Human Anatomy and Physiology");
        submenu.add(cbMenuItem);
        menu.add(submenu);

        menu.addSeparator();

        submenu = new JMenu("lvl 3000");

        cbMenuItem = new JCheckBoxMenuItem("BIO3001 Molecular Biology");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3002 Ecophysiology");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3003 Microbiology");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3004 Animal Behavior");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3007 Tropical Ecology");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3008 Hominin Paleontology");
        submenu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("BIO3010 Genomics and Proteomics");
        submenu.add(cbMenuItem);
        menu.add(submenu);


        //------------------------------------------------------------------

        menu = new JMenu("Chemistry");
        menuBar.add(menu);

        //------------------------------------------------------------------

        menu = new JMenu("Mathematics & Computer Sciences");
        menuBar.add(menu);

        //------------------------------------------------------------------

        menu = new JMenu("Physics");
        menuBar.add(menu);

        //------------------------------------------------------------------

        menu = new JMenu("Neuroscience");
        menuBar.add(menu);

        //------------------------------------------------------------------

        menu = new JMenu("Interdisciplinary");
        menuBar.add(menu);

    }
}

