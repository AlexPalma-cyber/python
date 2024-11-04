package calculadoraNueva;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class calculadoraGUI {
	JFrame ventana;
	JTextField display;
	JButton bcero;
	JButton buno;
	JButton bdos;
	JButton btres;
	JButton bcuatro;
	JButton bcinco;
	JButton bseis;
	JButton bsiete;
	JButton bocho;
	JButton bnueve;
	JButton bsuma;
	JButton bresta;
	JButton bmultiplicar;
	JButton bdividir;
	JButton bcalcular;
	
	public calculadoraGUI(){
		ventana = new JFrame();
		ventana.setTitle("Calculadora 1.0");
		ventana.setLayout(new GridLayout(4,6));
		ventana.setBounds(100, 50, 400, 600);
		display = new JTextField();
		display.setBounds(15, 15, 370, 50);
		
		bcero = new JButton("0");
		bcero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("0");			
			}
		});
		buno = new JButton("1");
		buno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("1");		
			}
		});
		bdos = new JButton("2");
		bdos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("2");	
			}
		});
		btres = new JButton("3");
		btres.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("3");		
			}
		});
		bcuatro = new JButton("4");
		bcuatro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("4");	
			}
		});
		bcinco = new JButton("5");
		bcinco.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("5");
			}
		});
		bseis = new JButton("6");
		bseis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("6");	
			}
		});
		bsiete = new JButton("7");
		bsiete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("7");
			}
		});
		bocho = new JButton("8");
		bocho.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("8");	
			}
		});
		bnueve = new JButton("9");
		bnueve.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("9");
			}
		});
		bsuma = new JButton("+");
		bsuma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("+");
			}
		});
		bresta = new JButton("-");
		bresta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("-");
			}
		});
		bmultiplicar = new JButton("*");
		bmultiplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("*");
			}
		});
		bdividir = new JButton("/");
		bdividir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("/");
			}
		});
		bcalcular = new JButton("=");
		bcalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				digitar("=");
			}
		});
		bsiete.setBounds(0, 50, 100, 100);
		
		
		ventana.add(display);
		ventana.add(bsuma);
		ventana.add(bresta);
		ventana.add(bmultiplicar);
		ventana.add(bdividir);
		ventana.add(bcalcular);
		ventana.add(bcero);
		ventana.add(buno);
		ventana.add(bdos);
		ventana.add(btres);
		ventana.add(bcuatro);
		ventana.add(bcinco);
		ventana.add(bseis);
		ventana.add(bsiete);
		ventana.add(bocho);
		ventana.add(bnueve);
		ventana.setVisible(true);
		
	} 
	
	public static void main (String[] args){
		new calculadoraGUI();
		
	}
	private void digitar(String n) {
		// TODO Auto-generated method stub
		String auxDisplay = display.getText();
		auxDisplay = auxDisplay + n;
		display.setText(auxDisplay);
	}

   public void actionPerformed(ActionEvent e) {
	operar("=");
}

private void operar(String string) {
	// TODO Auto-generated method stub
	
} 
private void operar1 (String op) {
    String numero1;
    String numero2;
    String operacion = null;

    if(op.equals("=")) {
        String numero2 = display.getText();
        if(operacion.equals("+")) {
            float n1 = Float.parseFloat(numero1);
            float n2 = Float.parseFloat(numero2);
            calculadoraGUI.setNumeros(n1, n2);
            String valor = String.valueOf(calculadoraGUI.getSuma());
            display.setText(valor);
        }
        // Agrega otros casos de operación aquí
    } else {
        operacion = op;
        numero1 = display.getText();
        display.setText("");
    }
}

private static char[] getSuma() {
	// TODO Auto-generated method stub
	return null;
}

private static void setNumeros(float n1, float n2) {
	// TODO Auto-generated method stub
	
}
}
