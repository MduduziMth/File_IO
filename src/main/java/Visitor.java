import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;


public class Visitor {
    private static final Logger logger = LogManager.getLogger(Visitor.class);
    public String FullName;
    public int Age;
    public LocalDate DateOfVisit;
    public LocalTime TimeOfVisit;
    public String Comments;
    public String NameOfAssistor;


    public Visitor(String FullName, int Age, LocalDate DateOfVisit, LocalTime TimeOfVisit, String Comments, String NameOFAssistor)
    {
        this.FullName = FullName;
        this.Age = Age;
        this.DateOfVisit = DateOfVisit;
        this.TimeOfVisit = TimeOfVisit;
        this.Comments = Comments;
        this.NameOfAssistor = NameOFAssistor;
    }

    public Visitor()
    {

    }


    public void save()
    {
        try{
            FullName = FullName.replaceAll(" ","_").toLowerCase();
            FileWriter newFile = new FileWriter("visitor_"+ FullName+".txt");
            newFile.write(FullName +"\n"+ Age+"\n" + DateOfVisit+"\n" + TimeOfVisit+"\n"+Comments+"\n" + NameOfAssistor);
            newFile.close();
            logger.info("saved successfully");
            //logger.

        } catch (IOException e){
            logger.error(e.getMessage());

        }

    }

    public void load(String fileNAme)
    {
        try{
            fileNAme = "visitor_"+fileNAme.replaceAll(" ","_").toLowerCase()+".txt";
            File loadedFile = new File(fileNAme);
            Scanner fileRead = new Scanner(loadedFile);

            while (fileRead.hasNext())
            {
                String data = fileRead.nextLine();
                System.out.println(data);
            }
            fileRead.close();
            logger.info("loaded successfully");
        } catch (FileNotFoundException e){

            logger.error(e.getMessage());
        }
        
    }


}
