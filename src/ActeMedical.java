import java.sql.Date;

public class ActeMedical {
    private int idDossierMedical; // Généré automatiquement par la base de données
    private int idActeMedical; // Identifiant de l'acte médical
    private int idPatient; // Référence au patient
    private String typeActeMedical; // Type de l'acte médical
    private Date dateActeMedical; // Date de l'acte médical
    private String medecinActeMedical; // Nom du médecin responsable

    // Constructeur
    public ActeMedical(int idActeMedical, int idPatient, String typeActeMedical, Date dateActeMedical, String medecinActeMedical) {
        this.idActeMedical = idActeMedical;
        this.idPatient = idPatient;
        this.typeActeMedical = typeActeMedical;
        this.dateActeMedical = dateActeMedical;
        this.medecinActeMedical = medecinActeMedical;
    }

    // Getters et setters
    public int getIdDossierMedical() {
        return idDossierMedical;
    }

    public void setIdDossierMedical(int idDossierMedical) {
        this.idDossierMedical = idDossierMedical;
    }

    public int getIdActeMedical() {
        return idActeMedical;
    }

    public void setIdActeMedical(int idActeMedical) {
        this.idActeMedical = idActeMedical;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getTypeActeMedical() {
        return typeActeMedical;
    }

    public void setTypeActeMedical(String typeActeMedical) {
        this.typeActeMedical = typeActeMedical;
    }

    public Date getDateActeMedical() {
        return dateActeMedical;
    }

    public void setDateActeMedical(Date dateActeMedical) {
        this.dateActeMedical = dateActeMedical;
    }

    public String getMedecinActeMedical() {
        return medecinActeMedical;
    }

    public void setMedecinActeMedical(String medecinActeMedical) {
        this.medecinActeMedical = medecinActeMedical;
    }
}
