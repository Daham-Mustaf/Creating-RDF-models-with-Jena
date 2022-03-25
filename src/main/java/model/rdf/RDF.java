package model.rdf;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.jena.rdf.model.*;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

@Data
@NoArgsConstructor
public class RDF {
    private Model model;
    private static final String ns = "http://www.example.org#";
    public void writeModel(){
    // Writes model to System.out in Turtle (TTL) format.
    model.write(System.out, "TTL");
   }
    public void addStatement(String s, String p, String o){
        Resource subject = model.createResource(s);
        Property predicate = model.createProperty(p);
        RDFNode object = model.createResource(o);
        Statement stmt = model.createStatement(subject, predicate, object);
        model.add(stmt);
    }
    public void createModel(){
        model = ModelFactory.createDefaultModel();
        addStatement(ns+"richard", ns+"homeTel", "(229) 276-5135");
        addStatement(ns+"richard", ns+"email",  "richard49@hotmail.com");
        addStatement(ns+"cindy", ns+"homeTel",  "(245) 646-5488");
        addStatement(ns+"cindy", ns+"email",  "cindym@gmail.com");
        addStatement(ns+"craig", ns+"homeTel",  "(194) 966-1505");
        addStatement(ns+"craig", ns+"email",  "craigellis@yahoo.com");
        addStatement(ns+"craig", ns+"email",  "c.ellis@usairwaysgroup.com");
    }

}
