
import java.time.LocalDate;
import java.time.LocalTime;




public class VisitorMain {
    public static void main(String[] args) {
      //  Visitor Alice = new Visitor("Alice Copper",25, LocalDate.of(2014,12,24), LocalTime.of(16,30),"Well done","Mduduzi");
      //  Visitor bob = new Visitor("bob copper",38, LocalDate.now(), LocalTime.now(),"Nice Work","Putin");
        Visitor charlie = new Visitor("charlie copper",25, LocalDate.now(), LocalTime.now(),"No bad","Joe");
     //   Alice.save();
     //   bob.save();
        System.out.println(charlie.save());

      //  bob.load("bob Copper");
       // System.out.println(charlie.load("charlie coppers"));

    }
}
