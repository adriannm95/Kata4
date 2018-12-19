package main;
import java.io.IOException;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;



public class Kata4 {

    public static void main(String[] args) throws IOException {

        String filname =  "emails.txt";
        List<Mail> mailList = MailListReader.read(filname);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
       HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}