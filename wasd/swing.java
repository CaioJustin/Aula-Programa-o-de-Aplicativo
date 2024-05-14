package wasd;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing {

	public static void main(String[] args) {
		
		//Criar uma nova janela
		JFrame frame = new JFrame("Sistema de Gestão de Estoque");
		frame.setSize(500,300);//Definir o tamando da janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	
		//Criar Um Botão
		JButton button=new JButton("Cique aqui para acessar o sistema");
		//adicionar um ouvinte de evento para o botao
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ação a ser executada quando o botão for clicado
				JOptionPane.showMessageDialog(frame, "Sistema em Construção");
				JOptionPane.showMessageDialog(frame, "Tentar Mais Tarde");
                JOptionPane.showMessageDialog(frame, "Denovo aqui muleke vai embora");
                JOptionPane.showMessageDialog(frame, "Tentar Mais Tarde");
                JOptionPane.showMessageDialog(frame, "Esse e o Ultimo");
			}
		});
		
		
		//Adicionar botao a janela 
		frame.getContentPane().add(button);
		
		//Exibir a janela
		frame.setVisible(true);
		
		
	}

}
