package DocumentPdf;

public class Utilisateur {

	public static void main(String[] args) {
		// Exemple d'utilisation de l'adaptateur avec un document PDF existant
        DocumentPDF documentPDF = new DocumentPDFExistant("document.pdf");
        DocumentHTML documentHTML = new AdaptateurDocumentPDF(documentPDF);

        documentHTML.charger();
        documentHTML.imprimer();
        documentHTML.fermer();

	}

}
