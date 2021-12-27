package kata5.main;

import kata5.model.Mail;
import kata5.model.Histogram;
import kata5.view.MailHistogramBuilder;
import kata5.view.HistogramDisplay;
import kata5.view.MailListReaderBD;
import java.util.ArrayList;
import java.util.List;

public class Kata5 {
    MailListReaderBD mailListReader;
    List<Mail> listaEmails;
    MailHistogramBuilder mailHistogramBuilder;
    Histogram <String> histogram;
    
    public static void main(String[] args) {
        Kata5 ejecucion = new Kata5();
        ejecucion.execute();
    }
    public void execute(){
        input();
        process();
        output();
    }
    
    protected void input(){
        mailListReader = new MailListReaderBD();
        listaEmails = mailListReader.read("KATA5.db");
        mailHistogramBuilder = new MailHistogramBuilder();
    }
    
    protected void process(){
        histogram = mailHistogramBuilder.build(listaEmails);
    }
    
    protected void output(){
        new HistogramDisplay(histogram).execute();
    }
    
}
