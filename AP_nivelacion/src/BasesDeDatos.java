import java.sql.*;
public class BasesDeDatos {
    private String url;
    private String username;
    private String password;

    public BasesDeDatos(){}

    public BasesDeDatos(String urlParam, String usernameParam, String passwordParam){
        this.url = urlParam;
        this.username = usernameParam;
        this.password = passwordParam;
    }

    public static String ConsultarTodos(String nombreDB, BasesDeDatos objDB){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + objDB.url + "/" + nombreDB, objDB.username, objDB.password);
            Statement stm = con.createStatement();

            ResultSet result = stm.executeQuery("SELECT * FROM `persona`");
            StringBuilder sb = new StringBuilder();
            sb.append("Resultados:\n");
            while(result.next()) {
                sb.append("id: ").append(result.getInt(1)).append("\n");
                sb.append("nombre: ").append(result.getString(2)).append("\n");
                sb.append("apellido: ").append(result.getString(3)).append("\n");
                sb.append("edad: ").append(result.getInt(4)).append("\n");
                sb.append("fecha creacion: ").append(result.getDate(5)).append("\n");
                sb.append("provincia:").append(result.getString(6)).append("\n");
            }
            con.close();
            return sb.toString();
        } catch (Exception e){
            return "Ha ocurrido un error: " + e;
        }
    }
}
