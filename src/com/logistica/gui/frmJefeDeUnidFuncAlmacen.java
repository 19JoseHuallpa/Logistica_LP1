package com.logistica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmJefeDeUnidFuncAlmacen extends JFrame {

	private JPanel contentPane;
	public JLabel lblNomJufa;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmJefeDeUnidFuncAlmacen frame = new frmJefeDeUnidFuncAlmacen();
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
	FondoPanel imagen = new FondoPanel();

	public frmJefeDeUnidFuncAlmacen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		this.setContentPane(imagen);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSistema = new JMenu("Sistema");
		menuBar.add(mnSistema);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmSalir(e);
			}
		});
		mnSistema.add(mntmSalir);
		
		JMenu mnBandejaDeEntrada = new JMenu("Bandeja de Entrada");
		menuBar.add(mnBandejaDeEntrada);
		
		JMenuItem mntmVerPecosas = new JMenuItem("Ver PECOSAS");
		mntmVerPecosas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmVerPecosas(e);
			}
		});
		mnBandejaDeEntrada.add(mntmVerPecosas);
		
		JMenu mnAlmacen = new JMenu("Almacen");
		menuBar.add(mnAlmacen);
		
		JMenuItem mntmGenerarCuadroDe = new JMenuItem("Generar Cuadro de Adquisiciones");
		mntmGenerarCuadroDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmGenerarCuadroDe(e);
			}
		});
		mnAlmacen.add(mntmGenerarCuadroDe);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmBienes = new JMenuItem("Bienes o Servicios");
		mnMantenimiento.add(mntmBienes);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel.setBounds(295, 11, 130, 36);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jefe de Unidad Funcional de Almacen");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(215, 47, 288, 16);
		getContentPane().add(lblNewLabel_1);
		
		lblNomJufa = new JLabel("New label");
		lblNomJufa.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomJufa.setForeground(Color.BLUE);
		lblNomJufa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNomJufa.setBounds(138, 87, 439, 16);
		getContentPane().add(lblNomJufa);
		
	}
	class FondoPanel extends JPanel
	{
		private Image img;
		
		@Override
		public void paint(Graphics g) {
			img = new ImageIcon(getClass().getResource("/img/Jefe de Almacen.jpg")).getImage();
			
			g.drawImage(img, 0, 0, getWidth(), getHeight(),this);
			
			setOpaque(false);
			
			super.paint(g);
			
		}
	}
	protected void actionPerformedMntmGenerarCuadroDe(ActionEvent e) {
		frmCuadroRequerimientos frm = new frmCuadroRequerimientos();
		frm.setVisible(true);
		frm.setLocationRelativeTo(null);
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedMntmVerPecosas(ActionEvent e) {
		frmPecosa frm = new frmPecosa();
		frm.setVisible(true);
		frm.setLocationRelativeTo(null);
	}
}
