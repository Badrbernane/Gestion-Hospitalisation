import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientDAO {
    private static final String INSERT_SQL =
            "INSERT INTO Patient (NCIN, NomPrenomPatient, AdressePatient, TelPatient, MutuellePatient, TypeMutuellePatient) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";

    public void insertPatient(Patient patient) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL)) {

            pstmt.setString(1, patient.getNcin());
            pstmt.setString(2, patient.getNomPrenomPatient());
            pstmt.setString(3, patient.getAdressePatient());
            pstmt.setString(4, patient.getTelPatient());
            pstmt.setBoolean(5, patient.isMutuellePatient());
            pstmt.setString(6, patient.getTypeMutuellePatient());

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Patient inséré avec succès !");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de l'insertion : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
}

