package kata5.view;

import java.util.List;
import kata5.model.Histogram;
import kata5.model.Mail;

public class MailHistogramBuilder {
    public static Histogram<String> histogram = new Histogram <String> ();
    
    public Histogram<String> build(List<Mail> lista){
        for (int i=0; i < lista.size(); i++){
            this.histogram.increment(lista.get(i).getDomain());
        }
        return this.histogram;
    }
}
