import br.com.faunacatalogo.gui.Usuario;
import br.com.faunacatalogo.gui.Adm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NovoMain extends JFrame {

    public NovoMain() {
        setTitle("Catálogo da Fauna - Mata Santa Ganebra");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        // Painel principal com layout Box
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.setBackground(new Color(234, 242, 235));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        // Título estilizado
        JLabel titulo = new JLabel("Catálogo da Fauna");
        titulo.setFont(new Font("Serif", Font.BOLD, 28));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setForeground(new Color(34, 85, 58));

        JLabel subtitulo = new JLabel("Mata Santa Ganebra");
        subtitulo.setFont(new Font("Serif", Font.PLAIN, 18));
        subtitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        subtitulo.setForeground(new Color(67, 107, 82));

        painelPrincipal.add(titulo);
        painelPrincipal.add(subtitulo);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 40)));

        // Botões
        JButton btnUsuario = new JButton("Entrar como Usuário");
        JButton btnAdmin = new JButton("Entrar como Administrador");

        estilizarBotao(btnUsuario);
        estilizarBotao(btnAdmin);

        // Ações dos botões
        btnUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Usuario();
                dispose();
            }
        });

        btnAdmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Adm();
                dispose();
            }
        });

        painelPrincipal.add(btnUsuario);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));
        painelPrincipal.add(btnAdmin);

        add(painelPrincipal);
        setVisible(true);
    }

    private void estilizarBotao(JButton botao) {
        botao.setFont(new Font("SansSerif", Font.BOLD, 16));
        botao.setBackground(new Color(102, 153, 102));
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
        botao.setPreferredSize(new Dimension(200, 40));
        botao.setMaximumSize(new Dimension(250, 40));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NovoMain());
    }
}
