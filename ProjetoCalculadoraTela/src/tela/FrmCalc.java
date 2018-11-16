package tela;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FrmCalc extends JFrame implements ActionListener{
	
	JLabel lblPergunta, valo1, valo2;
	JRadioButton rdbSoma, rdbSub, rdbMult, rdbDiv;
	ButtonGroup grpPergunta;
	Button btnVerifica, btnSair;
	JTextField txtVal1, txtVal2;
	float val1, val2, res;
	
	public FrmCalc() {
		//criar a textbox
		txtVal1 = new JTextField();
		txtVal1.setSize(200,20);
		txtVal1.setLocation(300,10);
		this.add(txtVal1);

		txtVal2 = new JTextField();
		txtVal2.setSize(200,20);
		txtVal2.setLocation(300,40);
		this.add(txtVal2);
		
		
		//criar a label
		lblPergunta = new JLabel("::Calculadora::");
		lblPergunta.setLocation(10,10);
		lblPergunta.setSize(200,20);
		lblPergunta.setForeground(Color.BLACK);
		this.add(lblPergunta);
		
		valo1 = new JLabel("Valor 1:");
		valo1.setLocation(250,10);
		valo1.setSize(200,20);
		valo1.setForeground(Color.BLACK);
		this.add(valo1);
		
		valo2 = new JLabel("Valor 2: ");
		valo2.setLocation(250,40);
		valo2.setSize(200,20);
		valo2.setForeground(Color.BLACK);
		this.add(valo2);
		
		rdbSoma = new JRadioButton("Soma");
		rdbSoma.setForeground(Color.BLACK);
		rdbSoma.setSize(200,20);
		rdbSoma.setLocation(10,50);
		rdbSoma.setBackground(null);
		this.add(rdbSoma);
		

		rdbSub = new JRadioButton("Subtração");
		rdbSub.setForeground(Color.BLACK);
		rdbSub.setSize(200,40);
		rdbSub.setLocation(10,70);
		rdbSub.setBackground(null);
		this.add(rdbSub);
		
		rdbMult = new JRadioButton("Multiplicação");
		rdbMult.setForeground(Color.BLACK);
		rdbMult.setSize(200,40);
		rdbMult.setLocation(10,100);
		rdbMult.setBackground(null);
		this.add(rdbMult);
		
		
		rdbDiv = new JRadioButton("Divisão");
		rdbDiv.setForeground(Color.BLACK);
		rdbDiv.setSize(200,80);
		rdbDiv.setLocation(10,110);
		rdbDiv.setBackground(null);
		this.add(rdbDiv);
		
		
		//para não permitir dois radios selecionados, fazer um ButtonGroup
		grpPergunta = new ButtonGroup();
		grpPergunta.add(rdbSoma);
		grpPergunta.add(rdbSub);
		grpPergunta.add(rdbMult);
		grpPergunta.add(rdbDiv);
		
		
		btnVerifica = new Button("Calcular");
		btnVerifica.setSize(70,20);
		btnVerifica.setLocation(10,200);
		btnVerifica.addActionListener(this);
		this.add(btnVerifica);

		btnSair = new Button("Sair");
		btnSair.setSize(50,20);
		btnSair.setLocation(95,200);
		btnSair.addActionListener(this);
		this.add(btnSair);

		
		this.setLayout(null);
		
		//titulo da janela
		this.setTitle("Teste de telas - Radio Button");
		
		//Tamanho do formulário
		this.setSize(600, 450);
		
		//controla como a tela aparecerá
		//maximizada ou não
		//this.setExtendedState(FrmTelaRadio.MAXIMIZED_BOTH);
		
		//posicionar no meio da tela
		this.setLocationRelativeTo(this);
		
		//controla o maximizar da tela
		this.setResizable(false);
		
		//coloca ou tira a barra de titulo
		this.setUndecorated(false);
		
		//cor formada pelo RGB liberdade total
		getContentPane().setBackground(new Color(200,200,200));
		
	}
	
	public void soma() {
		val1 = Float.parseFloat(txtVal1.getText());
		val2 = Float.parseFloat(txtVal2.getText());
		
		res = val1+val2;
		JOptionPane.showMessageDialog(this, "O resultado é:" + res);
		
		
	}
	public void subtracao() {
		val1 = Float.parseFloat(txtVal1.getText());
		val2 = Float.parseFloat(txtVal2.getText());
		
		res = val1-val2;
		JOptionPane.showMessageDialog(this, "O resultado é:" + res);
		
	}
	
	public void mult() {
		val1 = Float.parseFloat(txtVal1.getText());
		val2 = Float.parseFloat(txtVal2.getText());
		
		res = val1*val2;
		JOptionPane.showMessageDialog(this, "O resultado é:" + res);
		
	}
	
	public void div() {
		val1 = Float.parseFloat(txtVal1.getText());
		val2 = Float.parseFloat(txtVal2.getText());
		
		res = val1/val2;
		JOptionPane.showMessageDialog(this, "O resultado é:" + res);
		
	}
	public void verificaRadio() {
		if(rdbSoma.isSelected()){
			
			soma();
			
		}else if(rdbSub.isSelected()) {
			
			subtracao();
			
		}else if(rdbMult.isSelected()) {
			mult();
			
		}else if(rdbDiv.isSelected()) {
	
			div();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnSair) {
			System.exit(0);
		}else if(e.getSource() == btnVerifica) {
			verificaRadio();
		}
	}
}