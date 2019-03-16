package za.ac.cput.Question_3.DependencyInversionPrinciple;

public class Violated {

    //Dependency Inversion Principle Violated

    public class JavaDeveloper{
        public void writeCode(){
            System.out.println("Java");
        }
    }

    public class C_Developer {
        public void writeCode() {
            System.out.println("C#");
        }
    }

    public class Software{
        public JavaDeveloper JD = new JavaDeveloper();
        public C_Developer CD = new C_Developer();

        public void startDeveloping(){
            CD.writeCode();
            JD.writeCode();
        }
    }
    }
