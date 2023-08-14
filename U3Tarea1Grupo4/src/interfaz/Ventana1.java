package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import programacionDinamica.Fibonacci;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField ingresoBox;
	private JTextField impresionBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 437);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setLocationRelativeTo(null);
		setTitle("Programacion Dinamica");
		setResizable(false);
		addFocusListener(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FIBONACCI");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblNewLabel.setBounds(52, 24, 211, 52);
		contentPane.add(lblNewLabel);
		
		ingresoBox = new JTextField();
		ingresoBox.setHorizontalAlignment(SwingConstants.CENTER);
		ingresoBox.addKeyListener(new KeyAdapter() {
			@Override
			//Es un evento de teclado 
			public void keyTyped(KeyEvent e) {
				//getKeyChar es para oobtener la tecla que hemos ingresado
				char caracter = e.getKeyChar();
				
				//Lo que hace el if es ignorar cualquier otra cosa que no sea numeros para evitar errores o congelamientos en la interfaz
				//si no se encuentra dentro de los rangos de los numeros 0 a 9 se ignorara y no escribira
				if ((caracter < '0' || caracter > '9') && (caracter != KeyEvent.VK_BACK_SPACE)) {
					e.consume();// si se cumple lo anterior lo que hace es que se ignore y no ingrese los caracteres que no estan validados
				}
			}
		});
		ingresoBox.setForeground(new Color(0, 0, 0));
		ingresoBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ingresoBox.setBounds(73, 129, 174, 31);
		contentPane.add(ingresoBox);
		ingresoBox.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese un numero:");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(72, 94, 187, 25);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBackground(new Color(204, 204, 255));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resultado = 0;
				int ingresoNum = Integer.parseInt(ingresoBox.getText());
				
				Fibonacci fibonacci = new Fibonacci();
				
				int numero=fibonacci.validacionNegativo(ingresoNum);
				
				resultado = fibonacci.fibonacci(numero);
		    	System.out.println("El resultado Fibonacci es: "+ resultado);
		    	String resultadoString = Integer.toString(resultado);
		    	impresionBox.setText(resultadoString);
				
			}
		});
		btnCalcular.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		btnCalcular.setBounds(39, 181, 116, 40);
		contentPane.add(btnCalcular);
		
		impresionBox = new JTextField();
		impresionBox.setHorizontalAlignment(SwingConstants.CENTER);
		impresionBox.setForeground(new Color(0, 0, 0));
		impresionBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		impresionBox.setEditable(false);
		impresionBox.setColumns(10);
		impresionBox.setBounds(73, 276, 174, 31);
		contentPane.add(impresionBox);
		
		JButton btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setBackground(new Color(204, 204, 255));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresoBox.setText("");
				impresionBox.setText("");
			}
		});
		btnLimpiar.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		btnLimpiar.setBounds(165, 181, 116, 40);
		contentPane.add(btnLimpiar);
		
		JLabel lblNewLabel_1_1 = new JLabel("Resultado:");
		lblNewLabel_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(113, 243, 107, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("\"Calcula el n-ésimo número en la serie de Fibonacci");
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.ITALIC, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(39, 326, 251, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("donde cada número después del segundo es la suma");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Arial Narrow", Font.ITALIC, 12));
		lblNewLabel_2_1.setBounds(39, 341, 251, 15);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("de los dos números anteriores.\"");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Arial Narrow", Font.ITALIC, 12));
		lblNewLabel_2_1_1.setBounds(39, 357, 251, 15);
		contentPane.add(lblNewLabel_2_1_1);
		
		
	}
}
