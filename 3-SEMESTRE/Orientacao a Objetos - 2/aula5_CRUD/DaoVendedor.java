import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.Random;

public class DaoVendedor {
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

        public boolean inserir (Vendedor v){
            boolean result = false;
            try{
                this.conectar();
                Random random = new Random();
                int id = random.nextInt();

                String comando = "INSERT INTO tb_vendedor VALUES("
                + v.getId() + "', '" + v.getCpf() + "', '" + 
                v.getNome() + "', '" + v.getTelefone() 
                + "', " + v.getSalario()+ ");";
                st.executeUpdate(comando);
                result = true;
        }catch(Exception e){
            System.out.println("Erro ao inserir dados: " + e.getMessage());

        }finally{
            this.desconectar();
        }
        return result;
    }

    public ArrayList<Vendedor> buscarTodos(){
        ArrayList<Vendedor> resultado = new ArrayList<Vendedor>();
        try {
            this.conectar();
            ResultSet rs = st.executeQuery(
                "SELECT * FROM tb_vendedor ORDER BY nome");
            while(rs.next()){
              
                Vendedor v = new Vendedor();
                v.setId(rs.getInt("id"));
                v.setNome(rs.getString("nome"));
                v.setCpf(rs.getInt("cpf"));
                v.setTelefone(rs.getInt("telefone"));
                v.setSalario(rs.getFloat("salario"));
                resultado.add(v);
            }
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }finally{
            this.desconectar();
        }
        return resultado;
    }

    public int excluir(int id){
        int qtde = 0;
        try {
            this.conectar();
            String comando = "DELETE FROM tb_vendedor "
                + "WHERE id = " + id + ";";
            st.executeUpdate(comando);
            qtde = st.getUpdateCount();
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }finally{
            this.desconectar();
        }
        return qtde;
    }

    public Vendedor consultar(int id){
        Vendedor v = null;
        try{
            this.conectar();
            ResultSet rs = st.executeQuery(
                "SELECT * FROM tb_vendedor WHERE id = "
                    + id + ";");
            if(rs.next()){
                v = new Vendedor();
                v.setId(rs.getInt("id"));
                v.setNome(rs.getString("nome"));
                v.setCpf(rs.getInt("cpf"));
                v.setTelefone(rs.getInt("telefone"));
                v.setSalario(rs.getFloat("salario"));
            }
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }finally{
            this.desconectar();
        }
        return v;
    }

    public int alterar(Vendedor v){
        int qtde = 0;
        try {
            this.conectar();
            String comando = "UPDATE tb_vendedor SET "
                + " nome = '" + v.getNome() + "', "
                + " cpf = '" + v.getCpf() + "', "
                + " telefone = '" + v.getTelefone() + "', "
                + " salario = " + v.getSalario() 
                + " WHERE id = " + v.getId() + ";";
            // System.out.println(comando);
            st.executeUpdate(comando);
            qtde = st.getUpdateCount();
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }finally{
            this.desconectar();
        }
        return qtde;
    }
}
