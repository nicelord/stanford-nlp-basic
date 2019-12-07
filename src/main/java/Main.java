import edu.stanford.nlp.ie.crf.CRFClassifier;
import edu.stanford.nlp.ling.CoreLabel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    public static void main(String[] args) {

        String input = "After spent some times to holiday in Hawaii, Jim bought 300 shares of Acme Corp. in 2006.";

        CRFClassifier<CoreLabel> crf = CRFClassifier.getDefaultClassifier();
        String s = crf.classifyWithInlineXML(input);
        System.out.println(s);

    }
}
