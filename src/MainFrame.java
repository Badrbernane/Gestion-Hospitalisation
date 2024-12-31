import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        // Configuration de la fenêtre principale
        setTitle("Application Gestion Hospitalisation");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Création du panneau principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 10, 10));

        // Boutons pour les options
        JButton btnPatient = new JButton("Mise à jour des Patients");
        JButton btnActeMedical = new JButton("Mise à jour des Actes Médicaux");

        // Actions des boutons
        btnPatient.addActionListener(e -> {
            JFrame patientFrame = new JFrame("Mise à jour des Patients");
            patientFrame.setContentPane(new PatientUpdatePanel());
            patientFrame.setSize(500, 400);
            patientFrame.setLocationRelativeTo(null);
            patientFrame.setVisible(true);
        });

        btnActeMedical.addActionListener(e -> {
            JFrame acteMedicalFrame = new JFrame("Mise à jour des Actes Médicaux");
            acteMedicalFrame.setContentPane(new ActeMedicalUpdatePanel());
            acteMedicalFrame.setSize(500, 400);
            acteMedicalFrame.setLocationRelativeTo(null);
            acteMedicalFrame.setVisible(true);
        });

        // Ajout des boutons au panneau
        panel.add(btnPatient);
        panel.add(btnActeMedical);

        // Ajout du panneau à la fenêtre
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
