package DocumentPdf;

//Classe pour les documents HTML existants
public class DocumentHTMLExistant implements DocumentHTML  {
	
	private String nomFichier;

    public DocumentHTMLExistant(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    @Override
    public void charger() {
        System.out.println("Chargement du document HTML existant : " + nomFichier);
    }

    @Override
    public void imprimer() {
        System.out.println("Impression du document HTML existant : " + nomFichier);
    }

    @Override
    public void fermer() {
        System.out.println("Fermeture du document HTML existant : " + nomFichier);
    }

}
