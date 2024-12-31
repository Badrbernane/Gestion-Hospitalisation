import javax.swing.*;
import java.awt.*;
import java.sql.Date;

public class ActeMedicalUpdatePanel extends JPanel {
    private JTextField txtIdActeMedical, txtIdPatient, txtTypeActeMedical, txtDateActeMedical, txtMedecinActeMedical;

    public ActeMedicalUpdatePanel() {
        setLayout(new GridLayout(6, 2, 10, 10));

        // Labels et champs de texte
        add(new JLabel("ID Acte Médical:"));
        txtIdActeMedical = new JTextField();
        add(txtIdActeMedical);

        add(new JLabel("ID Patient:"));
        txtIdPatient = new JTextField();
        add(txtIdPatient);

        add(new JLabel("Type Acte Médical:"));
        txtTypeActeMedical = new JTextField();
        add(txtTypeActeMedical);

        add(new JLabel("Date Acte Médical (yyyy-MM-dd):"));
        txtDateActeMedical = new JTextField();
        add(txtDateActeMedical);

        add(new JLabel("Médecin Responsable:"));
        txtMedecinActeMedical = new JTextField();
        add(txtMedecinActeMedical);

        // Bouton pour insérer
        JButton btnInsert = new JButton("Insérer");
        btnInsert.addActionListener(e -> insertActeMedical());
        add(btnInsert);
    }

    private void insertActeMedical() {
        try {
            int idActeMedical = Integer.parseInt(txtIdActeMedical.getText());
            int idPatient = Integer.parseInt(txtIdPatient.getText());
            String typeActeMedical = txtTypeActeMedical.getText();
            Date dateActeMedical = Date.valueOf(txtDateActeMedical.getText());
            String medecinActeMedical = txtMedecinActeMedical.getText();

            ActeMedical acteMedical = new ActeMedical(idActeMedical, idPatient, typeActeMedical, dateActeMedical, medecinActeMedical);
            ActeMedicalDAO acteMedicalDAO = new ActeMedicalDAO();
            acteMedicalDAO.insertActeMedical(acteMedical);

            JOptionPane.showMessageDialog(this, "Acte médical inséré avec succès !");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors de l'insertion de l'acte médical : " + ex.getMessage());
        }
    }
}
