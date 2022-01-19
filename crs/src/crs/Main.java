package crs;
import crs.CourseList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Main implements ActionListener, ItemListener {
    private JFrame frame;
    CourseList courselist = new CourseList();

    public void actionPerformed(ActionEvent e){

        JMenuItem source = (JMenuItem)e.getSource();

        if (source.getText().equals("About")){
            showAboutDialog();
        }else if (source.getText().equals("Goals")){
            showGoalsDialog();
        }else if (source.getText().equals("How does this work ?")){
            showExplanationDialog();
        }else if (source.getText().equals("Quit")){
            System.exit(0);
        }
    }

    public void itemStateChanged(ItemEvent e){

        JMenuItem source = (JMenuItem)e.getSource();

        if (source.getText().contains("BIO")){
            //brows through course list loop through course list compare name with button
            for(Course C : courselist.courselist) {
                if (C.code.equals(source.getText())) {
                    C.select();
                }
            }

        }else if (source.getText().contains("CHE")){
            for(Course C: courselist.courselist){
                if(C.code.equals(source.getText())){
                    C.select();
                }
            }

        }else if (source.getText().contains("MAT")){
            for(Course C: courselist.courselist){
                if(C.code.equals(source.getText())){
                    C.select();
                }
            }

        }else if (source.getText().contains("PHY")){
            for(Course C: courselist.courselist){
                if(C.code.equals(source.getText())){
                    C.select();
                }
            }

        }else if (source.getText().contains("NEU")){
            for(Course C: courselist.courselist){
                if(C.code.equals(source.getText())){
                    C.select();
                }
            }

        }else if (source.getText().contains("INT")){
            for(Course C: courselist.courselist){
                if(C.code.equals(source.getText())){
                    C.select();
                }
            }

        }

    }

    public void showAboutDialog(){
        JOptionPane.showMessageDialog(
                this.frame,
                "\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "Schedule Helper",
                -1);
    }

    public void showGoalsDialog(){
        JOptionPane.showMessageDialog(
                this.frame,
                "\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "Goals",
                -1);
    }

    public void showExplanationDialog(){
        JOptionPane.showMessageDialog(
                this.frame,
                "\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "Explanation",
                -1);
    }

    void setTitle(){
        String title = "Schedule Helper";
        this.frame.setTitle(title);
    }

    void createGUI() {
        this.frame = new JFrame();
        setTitle();

        JMenuBar menuBar = new Menu()
        this.frame.setJMenuBar(menuBar);

        int menuHeight = 48;
        int sx = 800;
        int sy = 800;
        this.frame.setSize(800, 848);

        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(3);
        this.frame.setVisible(true);
        }

        public static void main(String[] args){

            createGUI();
        }
    }

