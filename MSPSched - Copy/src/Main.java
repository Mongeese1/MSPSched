

import javax.swing.*;
import java.awt.*;


public class Main{

    private static JFrame frame; //look into this with group

     /*public void actionPerformed(ActionEvent e){

        JMenuItem source = (JMenuItem)e.getSource();

        if (source.getText().equals("About")){
            showAboutDialog();
        /*}else if (source.getText().equals("Goals")){
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
            for(Course C : courselist.courselist) {
                if (source.getText().contains(C.code)) {
                    C.select();
                }
            }

        }else if (source.getText().contains("CHE")){
            for(Course C: courselist.courselist){
                if (source.getText().contains(C.code)) {
                    C.select();
                }
            }

        }else if (source.getText().contains("MAT")){
            for(Course C: courselist.courselist){
                if (source.getText().contains(C.code)) {
                    C.select();
                }
            }

        }else if (source.getText().contains("PHY")){
            for(Course C: courselist.courselist){
                if (source.getText().contains(C.code)) {
                    C.select();
                }
            }

        }else if (source.getText().contains("NEU")){
            for(Course C: courselist.courselist){
                if (source.getText().contains(C.code)) {
                    C.select();
                }
            }

        }else if (source.getText().contains("INT")){
            for(Course C: courselist.courselist){
                if (source.getText().contains(C.code)) {
                    C.select();
                }
            }

        }else if (source.getText().contains("SCI")){
            for(Course C: courselist.courselist){
                if (source.getText().contains(C.code)) {
                    C.select();
                }
            }

        }else if (source.getText().contains("HUM")){
            for(Course C: courselist.courselist){
                if(source.getText().contains(C.code)){
                    C.select();
                }
            }
        }

    }*/

    public static void showAboutDialog(){
        JOptionPane.showMessageDialog(
                frame,
                "\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "Schedule Helper",
                -1);
    }


    public static void showGoalsDialog(){
        JOptionPane.showMessageDialog(
                frame,
                "\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "Goals",
                -1);
    }

    public static void showExplanationDialog(){
        JOptionPane.showMessageDialog(
                frame,
                "\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "Explanation",
                -1);
    }


    Menu menu = new Menu();
    static void createGui(Menu menu){

        JFrame frame = new JFrame("MSP Frame Schedule Planner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setJMenuBar(menu.createMenuBar());




        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);


        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        Main main = new Main();
        //System.out.println(main.menu.courselist.getSelected().size());


        javax.swing.SwingUtilities.invokeLater(() -> createGui(main.menu));
    }
}



