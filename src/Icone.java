
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import static jdk.nashorn.internal.parser.TokenType.DO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wylla
 */
public class Icone extends NewJFrame {
URL caminhoImagem;
Image iconeTitulo;

public Icone(){
//super(“MUDANDO ICONE DO JAVA!”)
         caminhoImagem = this.getClass().getResource("/images/nasa.png");
       iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
       this.setIconImage(iconeTitulo);
 
 setIconImage(iconeTitulo);
 setResizable(false);
 setDefaultCloseOperation(NewJFrame.EXIT_ON_CLOSE);
 setSize(400, 300);
 setLocationRelativeTo(null);
 setVisible(true);
}
}
