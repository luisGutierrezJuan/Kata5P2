package kata5.main;

import kata5.model.Mail;
import kata5.model.Histogram;
import kata5.view.MailHistogramBuilder;
import kata5.view.HistogramDisplay;
import kata5.view.MailListReader;
import java.util.ArrayList;
import java.util.List;

public class Kata5 {
    MailListReader mailListReader;
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
        mailListReader = new MailListReader();
        listaEmails = mailListReader.read("email.txt");
        mailHistogramBuilder = new MailHistogramBuilder();
    }
    
    protected void process(){
        histogram = mailHistogramBuilder.build(listaEmails);
    }
    
    protected void output(){
        new HistogramDisplay(histogram).execute();
    }
    
}
