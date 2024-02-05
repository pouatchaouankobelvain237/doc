package DocumentPdf;

//Adaptateur pour les documents PDF
public class AdaptateurDocumentPDF implements DocumentHTML  {
	private DocumentPDF documentPDF;

    public AdaptateurDocumentPDF(DocumentPDF documentPDF) {
        this.documentPDF = documentPDF;
    }

    @Override
    public void charger() {
        documentPDF.ouvrir();
        documentPDF.afficher();
    }

    @Override
    public void imprimer() {
        documentPDF.afficher();
    }

    @Override
    public void fermer() {
        documentPDF.fermer();
    }

}
