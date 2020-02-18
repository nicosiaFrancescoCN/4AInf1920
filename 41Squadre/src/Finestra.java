import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Finestra extends  JFrame implements ActionListener {
	
	JLabel lSquadra1;
	JLabel lSquadra2;
	JLabel lSquadra3;
	JLabel lSquadra4;
	JTextField tSquadra1;
	JTextField tSquadra2;
	JTextField tSquadra3;
	JTextField tSquadra4;
	JButton bInvia;
	JLabel lCompleto;
	
	public Finestra()
	{
		setSize(800,600);
		setLocation(200, 200);
		setTitle("MyFirstFrame");
		initComponets();
		//pack();
		JPanel myPanel = new JPanel();
		myPanel.setBackground(Color.BLUE);
		Container container = this.getContentPane();
		container.add(myPanel);
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 }
	
	private void initComponets() {
		// TODO Auto-generated method stub
		this.setLayout(new FlowLayout());
		lSquadra1 = new JLabel("Squadra 1: ");
		this.add(lSquadra1);
		tSquadra2 = new JTextField(20);
		this.add(tSquadra2);
		lSquadra2 = new JLabel("Squadra 2: ");
		this.add(lSquadra2);
		tSquadra1 = new JTextField(20);
		this.add(tSquadra1);
		lSquadra3 = new JLabel("Squadra 3: ");
		this.add(lSquadra3);
		tSquadra3 = new JTextField(20);
		this.add(tSquadra3);
		lSquadra4 = new JLabel("Squadra 4: ");
		this.add(lSquadra4);
		tSquadra4 = new JTextField(20);
		this.add(tSquadra4);
		this.setLayout(new FlowLayout());
		bInvia= new JButton("Invia");
		this.add(bInvia);
		lCompleto = new JLabel("Squadre");
		this.add(lCompleto);
		bInvia.addActionListener(this);
	}
	
	//@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource() == bInvia)
		{
			lCompleto.setText(tSquadra2.getText()+" "+ tSquadra1.getText()+" "+tSquadra3.getText()+" "+tSquadra4.getText());
		}
	}
	
	public static void main(String[] args)
	{
		Finestra fs = new Finestra();
	}
}
