package espe.logsjava;

import java.awt.BorderLayout;
import org.apache.log4j.Logger;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {
	private static Logger logJava = Logger.getLogger(GUI.class);
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JButton btnNewButton = new JButton("Crear Log");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logJava.info("DAVID ALEJANDRO PÉREZ VILLAGÓMEZ");
				logJava.debug("LOG DEBUG: Generado por David Pérez");
				logJava.info("LOG INFO: Generado por David Pérez");
				logJava.warn("LOG WARN: Generado por David Pérez");
				logJava.error("LOG ERROR: Generado por David Pérez");
				logJava.fatal("LOG FATAL: Generado por David Pérez");	
				// #DEBUG. Usado para escribir mensajes de depuración
				// #INFO. Mensajes puramente informativos de determinada acción
				// #WARN. Para alertar de eventos de los que se quiere dejar constancia pero que no afectan al funcionamiento de la aplicación
				// #ERROR. Usado para los mensajes de eventos que afectan al programa pero lo dejan seguir funcionando.
				// #FATAL. Usado para errores críticos. Normalmente después de guardar el mensaje el programa terminará.
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		JLabel lblNewLabel = new JLabel("Logs David Pérez");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
	}

}
