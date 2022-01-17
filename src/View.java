import java.awt.*;
import java.awt.event.MouseEvent;

public class View extends Container {

    private boolean chooseCourse = false;
    private boolean mouseDown = false;

    public boolean chooseCourse(){return this.chooseCourse;}
    public void mousePressed(MouseEvent e){this.mouseDown = true;}
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {this.mouseDown = false;}
    public void mouseMoved(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
