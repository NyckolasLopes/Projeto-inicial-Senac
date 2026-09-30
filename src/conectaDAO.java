import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
            // ATENÇÃO: Apague a palavra SUA_SENHA_AQUI e digite a senha do seu MySQL no lugar dela.
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=root");
            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO: " + erro.getMessage());
        }
        return conn;
    }
}