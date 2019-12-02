
import javax.swing.*;
import java.awt.event.*; 
import java.awt.*; 
/**
 * Write a description of class MyPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPanel extends JPanel implements MouseListener
{
    private JTextField tf = new JTextField(20);
    private String [] grades = {"1학년", "2학년", "3학년", "4학년"}; 
    private JLabel gradeLabel = new JLabel(grades[0]);
    private JComboBox<String> strCombo = new JComboBox<String> (grades);
    public JPanel mp;
    public JButton btn;
    public JTextField mtfName;
    public JTextField mtfDept;
    public JTextField mtfAddress;
    public JTextArea Ta;
    
    
    public MyPanel(){

        JLabel MyName = new JLabel("이름");
        this.add(MyName);
        mtfName = new JTextField(20);
        this.add(mtfName);

        JLabel MyDept = new JLabel("학과");
        this.add(MyDept);
        mtfDept = new JTextField("글로벌소프트웨어학과", 20);
        this.add(mtfDept);

        JLabel MyAddress = new JLabel("주소");
        this.add(MyAddress);
        mtfAddress = new JTextField("서울시...", 20);
        this.add(mtfAddress);

        JComboBox<String> cbSchoolYear = new JComboBox<String>();
        for(int i=0; i<grades.length; i++) {
            cbSchoolYear.addItem(grades[i]); // 콤보박스에 문자열 아이템 삽입 
        }
        this.add(cbSchoolYear);
        JButton mb = new JButton("추가");
        mb.addMouseListener(this);
        JButton clear = new JButton("Clear");
        clear.addMouseListener(this);
        this.add(mb);
        this.add(clear);
        Ta = new JTextArea(10, 24);
        this.add(new JScrollPane(Ta));

   
    }
    
    public void mouseClicked(MouseEvent e){};
    public void mouseEntered(MouseEvent e){};
    public void mouseExited(MouseEvent e){};
    public void mousePressed(MouseEvent e){
        JButton btn = (JButton)e.getSource();
        if(btn.getText().equals("추가")){
            Ta.append(mtfName.getText() + "\n");
            Ta.append(mtfDept.getText() + "\n");
            Ta.append(mtfAddress.getText() + "\n");
        }
        
        if(btn.getText().equals("Clear")){
            mtfName.setText("");
            mtfDept.setText("");
            mtfAddress.setText("");
            Ta.setText("");
        }

        
        
        
        
    };
    public void mouseReleased(MouseEvent e){};

}

