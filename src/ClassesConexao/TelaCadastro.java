package ClassesConexao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;


public class TelaCadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nome;
	private JTextField tfemail;
	private JPasswordField pfsenha;
	private JTextField tfcargo;
	private JTextField tfexperiencia;
	private JTextField tfprentensaosalarial;
	private JTextField tfformaçao;
	private JTextField tfemail2;
	private JPasswordField pfsenha2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lbfnome = new JLabel("NOME COMPLETO *");
		lbfnome.setBounds(47, 193, 182, 33);
		lbfnome.setForeground(Color.BLACK);
		lbfnome.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lbfnome);
		
		JLabel lbfemail = new JLabel("E-MAIL *");
		lbfemail.setBounds(154, 280, 87, 33);
		lbfemail.setForeground(Color.BLACK);
		lbfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lbfemail);
		
		nome = new JTextField();
		nome.setBounds(239, 193, 489, 33);
		nome.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(nome);
		nome.setColumns(10);
		
		tfemail = new JTextField();
		tfemail.setBounds(239, 280, 489, 33);
		tfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		tfemail.setColumns(10);
		contentPane.add(tfemail);
		
		JFormattedTextField tfcpf = new JFormattedTextField();
		tfcpf.setBounds(239, 236, 489, 33);
	    MaskFormatter mfCPF = new MaskFormatter();
	    try {
	        mfCPF.setMask("###.###.###-##");
	        mfCPF.install(tfcpf);
	        tfcpf.setText("");
	    } catch (ParseException e1) {
	        e1.printStackTrace();
	    }
	    contentPane.add(tfcpf, "cell 0 1,growx");
		tfcpf.setFont(new Font("Arial", Font.PLAIN, 18));
		tfcpf.setColumns(10);
		contentPane.add(tfcpf);
		 
		JFormattedTextField tftelefone = new JFormattedTextField();
		tftelefone.setBounds(1009, 370, 489, 33);
	    MaskFormatter mfTELEFONE = new MaskFormatter();
	    try {
	        mfTELEFONE.setMask("(##)#####-####");
	        mfTELEFONE.install(tftelefone);
	        tftelefone.setText("");
	    } catch (ParseException e1) {
	        e1.printStackTrace();
	    }
	    contentPane.add(tftelefone, "cell 0 1,growx");
		tftelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		tftelefone.setColumns(10);
		contentPane.add(tftelefone);
		
		pfsenha = new JPasswordField();
		pfsenha.setBounds(1009, 279, 489, 33);
		pfsenha.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(pfsenha);
		
		JLabel lblCpf = new JLabel("CPF *");
		lblCpf.setBounds(173, 236, 56, 33);
		lblCpf.setForeground(Color.BLACK);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("SENHA *");
		lblSenha.setBounds(922, 279, 87, 33);
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblSenha);
		
		tfformaçao = new JTextField();
		tfformaçao.setBounds(239, 417, 489, 131);
		tfformaçao.setHorizontalAlignment(SwingConstants.LEFT);
		tfformaçao.setFont(new Font("Arial", Font.PLAIN, 18));
		tfformaçao.setColumns(10);
		contentPane.add(tfformaçao);
		
		tfprentensaosalarial = new JTextField();
		tfprentensaosalarial.setBounds(239, 370, 489, 33);
		tfprentensaosalarial.setHorizontalAlignment(SwingConstants.LEFT);
	    tfprentensaosalarial.setFont(new Font("Arial", Font.PLAIN, 18));
	    tfprentensaosalarial.setColumns(10);
		contentPane.add(tfprentensaosalarial);
	    
		tfcargo = new JTextField();
		tfcargo.setBounds(1009, 236, 489, 33);
		tfcargo.setFont(new Font("Arial", Font.PLAIN, 18));
		tfcargo.setColumns(10);
		contentPane.add(tfcargo);
		
		JDateChooser data_nasc = new JDateChooser();
		data_nasc.setDateFormatString("dd'/' MM '/' yyyy");
		data_nasc.setFont(new Font("Arial", Font.PLAIN, 18));
		data_nasc.setBounds(1009, 193, 489, 33);
		contentPane.add(data_nasc);
		
		
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setBounds(685, 623, 210, 71);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroUsuario c1 = new CadastroUsuario();
				
				c1.setNome(nome.getText());
				c1.setCpf(tfcpf.getText());
				c1.setData_nasc(data_nasc.getDate());
				c1.setFormaçao_acad(tfformaçao.getText());
				c1.setPretensao_salarial(tfprentensaosalarial.getText());
				c1.setCargo_interesse(tfcargo.getText());
				c1.setExperiencia_profissional(tfexperiencia.getText());
				c1.setTelefone(tftelefone.getText());
				
				if (tfemail.getText().equals(tfemail2.getText())) {
					c1.setEmail(tfemail.getText());
				}
			    else{
			        JOptionPane.showMessageDialog(null, "E-mail não confere.");
				}
				
				if (new String(pfsenha.getPassword()).equals(new String(pfsenha2.getPassword()))) {
					c1.setSenha(new String(pfsenha.getPassword()));
				}
			    else{
			        JOptionPane.showMessageDialog(null, "A senha não confere.");
				} 
				
				if (c1.isCPF()) {
					try {
						Connection con = Conexao.faz_conexao();
						String sql = "insert into cadastro_usuario(email, senha, nome, cpf, data_nasc, formaçao_acad, pretensao_salarial, cargo_interesse, experiencia_profissional, telefone) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
						
						PreparedStatement stmt = con.prepareStatement(sql);
						stmt.setString(1, c1.getEmail());
						stmt.setString(2, c1.getSenha());
						stmt.setString(3, c1.getNome());
						stmt.setString(4, c1.getCpf());
						stmt.setDate(5, new Date(c1.getData_nasc().getTime()));
						stmt.setString(6, c1.getFormaçao_acad());
						stmt.setString(7, c1.getPretensao_salarial());
						stmt.setString(8, c1.getCargo_interesse());
						stmt.setString(9, c1.getExperiencia_profissional());
						stmt.setString(10, c1.getTelefone());
					
						stmt.execute();
						stmt.close();
						con.close();
						JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! Retornando a tela de Login.");
						TelaLogin abrir = new TelaLogin();
						abrir.setVisible(true);
						setVisible(false);
					} catch (SQLException e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Faltando informações obrigatórias!!");
					} 
				} else {
					JOptionPane.showMessageDialog(null, "CPF INVÁLIDO");
					
				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 531, 120);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Pictures\\PRO4TECH 22.jpg"));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDataNascimento = new JLabel("DATA NASCIMENTO *");
		lblDataNascimento.setBounds(815, 193, 194, 33);
		lblDataNascimento.setForeground(Color.BLACK);
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblDataNascimento);
		
		JLabel lblExperienciaProfissional = new JLabel("EXPERIÊNCIA PROFISSIONAL");
		lblExperienciaProfissional.setBounds(742, 413, 267, 33);
		lblExperienciaProfissional.setForeground(Color.BLACK);
		lblExperienciaProfissional.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblExperienciaProfissional);
		
		JLabel lblCargo = new JLabel("CARGO DESEJADO");
		lblCargo.setBounds(827, 236, 182, 33);
		lblCargo.setForeground(Color.BLACK);
		lblCargo.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblCargo);
		
		tfexperiencia = new JTextField();
		tfexperiencia.setBounds(1009, 417, 489, 131);
		tfexperiencia.setFont(new Font("Arial", Font.PLAIN, 18));
		tfexperiencia.setColumns(10);
		contentPane.add(tfexperiencia);
		
		JLabel lblPretensoSalarial = new JLabel("PRETENSÃO SALARIAL");
		lblPretensoSalarial.setBounds(20, 370, 210, 33);
		lblPretensoSalarial.setForeground(Color.BLACK);
		lblPretensoSalarial.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblPretensoSalarial);
		
		JLabel lblFormaoAcadmica = new JLabel("FORMAÇÃO ACADÊMICA *");
		lblFormaoAcadmica.setBounds(0, 413, 241, 33);
		lblFormaoAcadmica.setForeground(Color.BLACK);
		lblFormaoAcadmica.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblFormaoAcadmica);
		
		JLabel lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setBounds(897, 370, 102, 33);
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblTelefone);
		
		JLabel lblCamposObrigatrios = new JLabel("Campos obrigatórios *");
		lblCamposObrigatrios.setBounds(1007, 558, 194, 33);
		lblCamposObrigatrios.setForeground(Color.RED);
		lblCamposObrigatrios.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblCamposObrigatrios);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(0, 0, 517, 100);
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lbfemail2 = new JLabel("CONFIRMAÇÃO E-MAIL*");
		lbfemail2.setForeground(Color.BLACK);
		lbfemail2.setFont(new Font("Arial", Font.PLAIN, 18));
		lbfemail2.setBounds(20, 324, 221, 33);
		contentPane.add(lbfemail2);
		
		tfemail2 = new JTextField();
		tfemail2.setFont(new Font("Arial", Font.PLAIN, 18));
		tfemail2.setColumns(10);
		tfemail2.setBounds(239, 324, 489, 33);
		contentPane.add(tfemail2);
		
		JLabel lblSenha2 = new JLabel("CONFIRMAÇÃO SENHA *");
		lblSenha2.setForeground(Color.BLACK);
		lblSenha2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSenha2.setBounds(786, 323, 223, 33);
		contentPane.add(lblSenha2);
		
		pfsenha2 = new JPasswordField();
		pfsenha2.setFont(new Font("Arial", Font.PLAIN, 18));
		pfsenha2.setBounds(1009, 323, 489, 33);
		contentPane.add(pfsenha2);
		
		
		
		
		
		
		
		
	}
}
