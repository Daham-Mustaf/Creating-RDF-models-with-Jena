import model.rdf.RDF;

public class Main {
    public static void main(String[] args) {
//        @prefix : <http://www.example.org#>
        RDF rdf = new RDF();
        rdf.createModel();
        rdf.writeModel();
    }
}
