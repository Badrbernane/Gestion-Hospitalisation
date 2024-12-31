public class App {
    public static void main(String[] args) {
        // Lancer l'application avec l'interface graphique Swing
        javax.swing.SwingUtilities.invokeLater(() -> {
            // Créer et afficher la fenêtre principale
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
