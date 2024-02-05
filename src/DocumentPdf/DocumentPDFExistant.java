package DocumentPdf;

//Classe pour les documents PDF existants
public class DocumentPDFExistant implements DocumentPDF  {
	private String nomFichier;

    public DocumentPDFExistant(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    @Override
    public void ouvrir() {
        System.out.println("Ouverture du document PDF existant : " + nomFichier);
    }

    @Override
    public void afficher() {
        System.out.println("Affichage du document PDF existant : " + nomFichier);
    }

    @Override
    public void fermer() {
        System.out.println("Fermeture du document PDF existant : " + nomFichier);
    }

}
