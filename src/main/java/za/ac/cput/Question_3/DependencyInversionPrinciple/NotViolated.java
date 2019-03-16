package za.ac.cput.Question_3.DependencyInversionPrinciple;

import java.util.List;

public class NotViolated {

    //Dependency Inversion Principle not Violated

    public interface Programmers{
        public void programming();
    }

    public class JavaDeveloper implements Programmers{
        @Override
        public void programming() {
            writeCode();
        }
        public void writeCode(){
            System.out.println("Java");
        }
    }

    public class C_Developer implements Programmers{
        @Override
        public void programming() {
            writeCode();
        }
        public void writeCode(){
            System.out.println("C#");
        }
    }

    public class Software {


        public List<NotViolated> prog;

        public Software(List<NotViolated> prog) {
            this.prog = prog;
        }
        public void startDeveloping() {
        }
    }
}
