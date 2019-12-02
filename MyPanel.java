import javax.swing.*;
import java.awt.event.*; 
import java.awt.*; 
/**
 * Write a description of class MyPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPanel extends JFrame
{
    private JTextField tf = new JTextField(20);
    private JTextArea ta = new JTextArea(7, 20);
    private String [] grades = {"1학년", "2학년", "3학년", "4학년"}; 
    private JLabel gradeLabel = new JLabel(grades[0]);
    private JComboBox<String> strCombo = new JComboBox<String> (grades);
    public JPanel mp;
    public JButton btn;
    
    public MyPanel(){
        setTitle("실습_4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("이름"));
        c.add(new JTextField(20));
        c.add(new JLabel("학과"));
        c.add(new JTextField("글로벌소프트웨어학과", 20));
        c.add(new JLabel("주소"));
        c.add(new JTextField("서울시 ...", 20));
        
        JComboBox<String> gradeCombo = new JComboBox<String>();
        for(int i=0; i<grades.length; i++) {
            gradeCombo.addItem(grades[i]); // 콤보박스에 문자열 아이템 삽입 
        }
        c.add(gradeCombo);
        JButton add = new JButton("추가");
        JButton clear = new JButton("Clear");
        c.add(add);
        c.add(clear);
        c.add(new JScrollPane(ta));

        
        // 텍스트필드에 Enter, 키 입력 때 발생하는 Action 이벤트의 리스너 등록 
        tf.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent e) { 
                    JTextField t = (JTextField)e.getSource();
                    ta.append(t.getText() + "\n"); // 텍스트필드의 문자열을 텍스트 영역 창에 추가 
                    t.setText(""); // 현재 텍스트필드에 입력된 내용 지우기 
                }
            });
        setSize (300, 300); 
        setVisible(true); 
    }
}
