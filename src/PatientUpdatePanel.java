import javax.swing.*;
import java.awt.*;

public class PatientUpdatePanel extends JPanel {
    private JTextField txtNcin, txtNomPrenom, txtAdresse, txtTelephone, txtTypeMutuelle;
    private JCheckBox chkMutuelle;

    public PatientUpdatePanel() {
        setLayout(new GridLayout(7, 2, 10, 10));

        // Labels et champs de texte
        add(new JLabel("NCIN:"));
        txtNcin = new JTextField();
        add(txtNcin);

        add(new JLabel("Nom et Prénom:"));
        txtNomPrenom = new JTextField();
        add(txtNomPrenom);

        add(new JLabel("Adresse:"));
        txtAdresse = new JTextField();
        add(txtAdresse);

        add(new JLabel("Téléphone:"));
        txtTelephone = new JTextField();
        add(txtTelephone);

        add(new JLabel("Mutuelle:"));
        chkMutuelle = new JCheckBox();
        add(chkMutuelle);

        add(new JLabel("Type de Mutuelle:"));
        txtTypeMutuelle = new JTextField();
        add(txtTypeMutuelle);

        // Bouton pour insérer
        JButton btnInsert = new JButton("Insérer");
        btnInsert.addActionListener(e -> insertPatient());
        add(btnInsert);
    }

    private void insertPatient() {
        String ncin = txtNcin.getText();
        String nomPrenom = txtNomPrenom.getText();
        String adresse = txtAdresse.getText();
        String telephone = txtTelephone.getText();
        boolean mutuelle = chkMutuelle.isSelected();
        String typeMutuelle = txtTypeMutuelle.getText();

        Patient patient = new Patient(ncin, nomPrenom, adresse, telephone, mutuelle, typeMutuelle);
        PatientDAO patientDAO = new PatientDAO();
        patientDAO.insertPatient(patient);
    }
}
