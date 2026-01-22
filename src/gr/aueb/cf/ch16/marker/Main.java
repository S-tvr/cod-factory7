package gr.aueb.cf.ch16.marker;

public class Main {

    public static void main(String[] args) {
        Attachment attachment = new Attachment("vat", "pdf");

        archive(attachment);
    }

    // πολυμορφικη
    public static void archive(IArchivable iArchivable) {
        if (iArchivable instanceof Attachment){    // ελεγχει αν αυτο το iArchivable ανοικει στην κλάση Attachment.
            System.out.println(((Attachment) iArchivable).getFilename() + "."
            + ((Attachment) iArchivable).getExtension());
        } else {
            System.out.println("Document is not archivable.");
        }

    }
}
