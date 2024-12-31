public class Patient {
    private int idPatient; // Optionnel, généré automatiquement par la DB
    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }
    private String ncin;
    private String nomPrenomPatient;
    private String adressePatient;
    private String telPatient;
    private boolean mutuellePatient;
    private String typeMutuellePatient;

    // Constructeurs, getters et setters
    public Patient(String ncin, String nomPrenomPatient, String adressePatient, String telPatient, boolean mutuellePatient, String typeMutuellePatient) {
        this.ncin = ncin;
        this.nomPrenomPatient = nomPrenomPatient;
        this.adressePatient = adressePatient;
        this.telPatient = telPatient;
        this.mutuellePatient = mutuellePatient;
        this.typeMutuellePatient = typeMutuellePatient;
    }

    // Getters et setters
    public String getNcin() { return ncin; }
    public void setNcin(String ncin) { this.ncin = ncin; }
    public String getNomPrenomPatient() { return nomPrenomPatient; }
    public void setNomPrenomPatient(String nomPrenomPatient) { this.nomPrenomPatient = nomPrenomPatient; }
    public String getAdressePatient() { return adressePatient; }
    public void setAdressePatient(String adressePatient) { this.adressePatient = adressePatient; }
    public String getTelPatient() { return telPatient; }
    public void setTelPatient(String telPatient) { this.telPatient = telPatient; }
    public boolean isMutuellePatient() { return mutuellePatient; }
    public void setMutuellePatient(boolean mutuellePatient) { this.mutuellePatient = mutuellePatient; }
    public String getTypeMutuellePatient() { return typeMutuellePatient; }
    public void setTypeMutuellePatient(String typeMutuellePatient) { this.typeMutuellePatient = typeMutuellePatient; }
}
