import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActeMedicalDAO {

    // Ajouter un acte médical
    public void insertActeMedical(ActeMedical acteMedical) throws SQLException {
        String sql = "INSERT INTO ActeMedical (IDActeMedical, IDPatient, TypeActeMedical, DateActeMedical, MedecinActeMedical) "
                + "VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, acteMedical.getIdActeMedical());
            pstmt.setInt(2, acteMedical.getIdPatient());
            pstmt.setString(3, acteMedical.getTypeActeMedical());
            pstmt.setDate(4, acteMedical.getDateActeMedical());
            pstmt.setString(5, acteMedical.getMedecinActeMedical());

            pstmt.executeUpdate();
            System.out.println("Acte médical inséré avec succès !");
        }
    }

    // Récupérer tous les actes médicaux d'un patient
    public List<ActeMedical> getActesByPatientId(int idPatient) throws SQLException {
        String sql = "SELECT * FROM ActeMedical WHERE IDPatient = ?";
        List<ActeMedical> actes = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idPatient);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                ActeMedical acte = new ActeMedical(
                        rs.getInt("IDActeMedical"),
                        rs.getInt("IDPatient"),
                        rs.getString("TypeActeMedical"),
                        rs.getDate("DateActeMedical"),
                        rs.getString("MedecinActeMedical")
                );
                acte.setIdDossierMedical(rs.getInt("IDDossierMedical"));
                actes.add(acte);
            }
        }
        return actes;
    }

    // Mettre à jour un acte médical
    public void updateActeMedical(ActeMedical acteMedical) throws SQLException {
        String sql = "UPDATE ActeMedical SET TypeActeMedical = ?, DateActeMedical = ?, MedecinActeMedical = ? "
                + "WHERE IDActeMedical = ? AND IDPatient = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, acteMedical.getTypeActeMedical());
            pstmt.setDate(2, acteMedical.getDateActeMedical());
            pstmt.setString(3, acteMedical.getMedecinActeMedical());
            pstmt.setInt(4, acteMedical.getIdActeMedical());
            pstmt.setInt(5, acteMedical.getIdPatient());

            pstmt.executeUpdate();
            System.out.println("Acte médical mis à jour avec succès !");
        }
    }

    // Supprimer un acte médical
    public void deleteActeMedical(int idActeMedical) throws SQLException {
        String sql = "DELETE FROM ActeMedical WHERE IDActeMedical = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idActeMedical);
            pstmt.executeUpdate();
            System.out.println("Acte médical supprimé avec succès !");
        }
    }
}

