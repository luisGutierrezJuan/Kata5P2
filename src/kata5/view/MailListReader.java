package kata5.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import kata5.model.Mail;

public class MailListReader {
    public static List<Mail> listaEmail = new ArrayList<Mail> ();
    
    public List<Mail> read(String fileName){
        File email;
        BufferedReader bReader;
        FileReader fReader;
        try{
            email = new File (fileName);
            fReader = new FileReader(email);
            bReader = new BufferedReader(fReader);
            String linea;
            while ((linea=bReader.readLine()) != null){
                if (linea.contains("@")){
                    listaEmail.add(new Mail(linea));
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return listaEmail;
    }
}
