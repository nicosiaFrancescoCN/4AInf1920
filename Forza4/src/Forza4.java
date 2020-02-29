import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Forza4 extends JFrame implements ActionListener {

    public static final String FILE_PATH = "C:\\Users\\Ciccio\\IdeaProjects\\Forza4\\text.txt";
    public static final String B = "B";
    public static final String R = "R";

    private JButton mat[][];
    JButton Start;
    private int turn = 0;
    private int contaC = 0;
    private int contaR = 0;
    private int contaD = 0;

    public Forza4(){
        mat = new JButton[4][4];
        setSize(400, 400);
        setTitle("Gioco Forza 4");
        setResizable(false);
        initComponents();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent){
        if(actionEvent.getSource() == Start){
            newGame();
        }
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                if((turn % 2) == 0){
                    if(actionEvent.getSource() == mat[r][c]){
                        System.out.println("Turn" + turn + "of the player");
                        toggle(mat[r][c]);
                        mat[r][c].setEnabled(false);
                        turn++;
                        if(r-1>=0){
                            mat[r-1][c].setEnabled(true);
                        }
                        controlRow();
                        controlCol();
                        controlDiago1();
                        controlDiago2();
                    }
                } else {
                    System.out.println("Turno" + turn + "of the computer");
                    computer();
                }
            }
        }
    }

    private void toggle(JButton jButton){
        String txt = "";
        if((turn % 2) == 0){
            txt = B;
            jButton.setBackground(Color.BLUE);
        }
        else{
            txt = R;
            jButton.setBackground(Color.RED);
        }
        jButton.setText(txt);
    }

    private void initComponents(){
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(4, 4));
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                mat[r][c] = new JButton();
                mat[r][c].setText("");
                mat[r][c].setBackground(Color.WHITE);
                if(r == 3){
                    mat[r][c].setEnabled(true);
                }
                else{
                    mat[r][c].setEnabled(false);
                }
                grid.add(mat[r][c]);
                mat[r][c].addActionListener(this);
            }
        }
        this.add(grid);
        JPanel sPanel = new JPanel();
        Start = new JButton("Play");
        sPanel.add(Start);
        Start.addActionListener(this);
        this.add(sPanel, BorderLayout.SOUTH);
    }

    private void newGame(){
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                mat[r][c].setBackground(Color.WHITE);
                mat[r][c].setText("");
                if( r == 3){
                    mat[r][c].setEnabled(true);
                }
                else{
                    mat[r][c].setEnabled(false);
                }
            }
        }
        turn = 0;
    }

    private void endGame(){
        int cont = 0;
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++){
                if(mat[r][c].getText().equalsIgnoreCase(B) || mat[r][c].getText().equalsIgnoreCase(R)){
                    cont++;
                }
            }

        }
        if (cont == 16){
            winner("Draw");
        }
    }

    private void computer(){
        boolean play = false;

        while (!play) {
            Random random = new Random();
            int r = random.nextInt((3)+1);
            int c = random.nextInt((3)+1);
            if (mat[r][c].getText().equalsIgnoreCase("") && (mat[r][c].isEnabled()==true)) {
                toggle(mat[r][c]);
                if(r-1>=0) {
                    mat[r - 1][c].setEnabled(true);
                }
                mat[r][c].setEnabled(false);
                turn++;
                controlRow();
                controlCol();
                controlDiago1();
                controlDiago2();
                endGame();
                play = true;
            }
        }
    }

    private void winner(String winner){
        JOptionPane.showMessageDialog(this, winner);
        save(winner);
        newGame();
    }

    private void save(String stri){
        BufferedWriter bw;
        String str = "";
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        str = str + sdf.format(calendar.getTime()) + "\n" ;
        str = str + stri.toUpperCase() + "\n";
        try{
            bw = new BufferedWriter(new FileWriter(FILE_PATH,true));
            for(int r=0; r<4; r++){
                for(int c=0; c<4; c++){
                    String btnText = mat[r][c].getText();
                    if(btnText.equals("")){
                        btnText = "-";
                    }
                    str = str + btnText + " ";
                }
                str = str + "\n";
            }
            str = str + "\n";

            bw.write(str);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void controlRow(){
        for (int r = 0; r < 4; r++) {
            contaR = 0;
            for (int c = 0; c < 4; c++) {
                if (mat[r][c].getText().equalsIgnoreCase(R)) {
                    contaR++;
                }
                if (mat[r][c].getText().equalsIgnoreCase(B)) {
                    contaR--;
                }
            }
            if (contaR == 4) {
                this.winner("Red won (row" +(3-r+1)+")");
            }
            if (contaR == -4) {
                this.winner("Blue Won (row " +(3-r+1)+")");
            }
        }
    }

    private void controlCol(){
        for (int c = 0; c < 4; c++) {
            contaC = 0;
            for (int r = 0; r < 4; r++) {
                if (mat[r][c].getText().equalsIgnoreCase(R)) {
                    contaC++;
                }
                if (mat[r][c].getText().equalsIgnoreCase(B)) {
                    contaC--;
                }
            }
            if (contaC == 4) {
                this.winner("Red won (row" +(3-c+1)+")");
            }
            if (contaC == -4) {
                this.winner("Blue Won (row " +(3-c+1)+")");
            }
        }
    }

    private void controlDiago1(){
        contaD = 0;
        for(int r=0; r<4; r++){
            for(int c=0; c<4; c++){
                if(mat[r][c].getText().equalsIgnoreCase(R) && r==c){
                    contaD++;
                }
                if(mat[r][c].getText().equalsIgnoreCase(B) && r==c){
                    contaD--;
                }
            }
            if(contaD == 4){
                this.winner("Won: " + R);
            }
            if(contaD == -4){
                this.winner("Won: " + B);
            }
        }
    }

    private void controlDiago2(){
        contaD = 0;
        for(int r=0; r<4; r++){
            for(int c=0; c<4; c++){
                if(mat[r][c].getText().equalsIgnoreCase(R) && (r+c==3)){
                    contaD++;
                }
                if(mat[r][c].getText().equalsIgnoreCase(B) && (r+c==3)){
                    contaD--;
                }
            }
            if(contaD == 4){
                this.winner("Won: " + R);
            }
            if(contaD == -4){
                this.winner("Won: " + B);
            }
        }
    }

    public static void main(String[] args) {
        Forza4 forza4 = new Forza4();
    }

}
