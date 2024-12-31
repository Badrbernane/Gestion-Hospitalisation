import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // URL pour se connecter à PostgreSQL
    private static final String URL = "jdbc:postgresql://localhost:5433/GestionHospitalisation";
    private static final String USER = "postgres"; // Remplacez par votre utilisateur PostgreSQL
    private static final String PASSWORD = "admin"; // Votre mot de passe PostgreSQL

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
