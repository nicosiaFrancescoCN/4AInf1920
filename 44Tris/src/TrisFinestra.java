import javafx.scene.shape.Circle;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrisFinestra extends JFrame implements ActionListener{

    JButton[] vButton;
    public static final int N_BUTTON = 9;

    public TrisFinestra()
    {
        vButton = new JButton[N_BUTTON];
        setSize(300,300);
        setLocation(200, 200);
        setTitle("Tris");
        initComponets();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponets() {
        this.setLayout(new GridLayout(3,3));
        for(int i = 0; i < N_BUTTON; i++){
            vButton[i] = new JButton();
            vButton[i].setBackground(Color.ORANGE);
            this.add(vButton[i]);
            vButton[i].addActionListener(this);
        }
    }

    public static void main(String[] args) {
        TrisFinestra finestra = new TrisFinestra();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String txt = "";
        for( int i = 0; i < N_BUTTON; i++){
            if(actionEvent.getSource() == vButton[i]){
                txt = vButton[i].getText();
                if(txt.equalsIgnoreCase("X")){
                    txt = "O";
                }else if(txt.equalsIgnoreCase("O") != txt.equalsIgnoreCase("")){
                    txt = "X";
                }
                vButton[i].setText(txt);
            }
        }
    }
}
