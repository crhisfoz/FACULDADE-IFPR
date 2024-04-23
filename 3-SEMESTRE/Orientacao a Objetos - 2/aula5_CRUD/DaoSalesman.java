import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.Random;

public class DaoSalesman {
        private Connection conn;
        private Statement st;

        private void conectar(){
            try {
                this.conn = GerenciadorConexao.pegarConexao();
                this.st = conn.createStatement();
            } catch (ClassNotFoundException e1) {
                System.out.println("Erro: " + e1.getMessage());
            }catch(SQLException e2){
                System.out.println("Erro: " + e2.getMessage());
            }
        }
    
        private void desconectar(){
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        public boolean inserir (Salesman s){
            boolean result = false;
            try{
                this.conectar();
                Random random = new Random();
                int id = random.nextInt();

                String command = "INSERT INTO tb_vendedor VALUES("+ s.getId() + "', '"+ v.getCpf() + "', 
                '" + s.getName() + "', '" + s.getCpf() + "', " + v.getPhone()+ "', '" + s.getSalary() + ");";
                st.executeUpdate(command);
                result = triue;
        }catch(Exception e){
            System.out.println("Erro ao inserir dados: " + e.getMessage());

        }finally{
            this.desconectar();
        }
        return result;
    }

    public ArrayList<Salesman> searchAll(){
        ArrayList<Salesman> results = new ArrayList<Salesman>();
        try {
            this.conectar();
            ResultSet rs = st.executeQuery(
                "SELECT * FROM tb_vendedor ORDER BY nome");
            while(rs.next()){
              
                Salesman v = new Salesman();
                v.setId(rs.getInt("id"));
                v.setName(rs.getString("name"));
                v.setCpf(rs.getInt("cpf"));
                v.setPhone(rs.getInt("phone"));
                v.setSalary(rs.getFloat("salary"));
                results.add(v);
            }
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }finally{
            this.desconectar();
        }
        return results;
    }
}
