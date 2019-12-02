import javax.swing.*;
/**
 * Write a description of class TextFieldFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TextFieldFrame extends JFrame
{
    public TextFieldFrame(){
        this.setTitle("실습_4");
        this.setSize(270, 350);
        
        MyPanel mp = new MyPanel();
        this.add(mp);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
