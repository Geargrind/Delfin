import java.util.ArrayList;
import java.util.Scanner;

public class BreastDiscipline {

    static ArrayList<CompetitiveSwimmer> breastSwimmers = new ArrayList<>();
    public void createBreastSvimmer() {

        CompetitiveSwimmer breastSwimmer1 = new CompetitiveSwimmer("Mathias","Hillerød","bedste dk", 12.23 );
        CompetitiveSwimmer breastSwimmer2 = new CompetitiveSwimmer("Frank","Horens","bedst sk", 22.29 );
        CompetitiveSwimmer breastSwimmer3 = new CompetitiveSwimmer("Ida","Holte","vm cup", 11.29 );
        CompetitiveSwimmer breastSwimmer4 = new CompetitiveSwimmer("Uggi","Holbæk","sjællands bedst", 20.29 );
        CompetitiveSwimmer breastSwimmer5 = new CompetitiveSwimmer("Wei","Birkerød","bedste ever", 21.29 );

        breastSwimmers.add(breastSwimmer1);
        breastSwimmers.add(breastSwimmer2);
        breastSwimmers.add(breastSwimmer3);
        breastSwimmers.add(breastSwimmer4);
        breastSwimmers.add(breastSwimmer5);

    }



    public void addBreastSwimmer(CompetitiveSwimmer obj){
        breastSwimmers.add(obj);

        System.out.println(breastSwimmers);
    }

    public void print(){
        System.out.println("Name           Location       Competition              Time                       \n ");
        for (CompetitiveSwimmer breast: breastSwimmers) {
            System.out.printf("%-12s%-10s%-10s%-10s%n", breast.getName(), breast.getLocation(),
                    breast.getCompetition(),breast.getTime()
            );
        }
    }

    public void printBreastSwimmers() {
        System.out.println("-----------------------------------------------BREAST SWIMMERS-----------------------------------------------");
        print();
    }


    double breastTime;
    public double getBreastTime() {
        return breastTime;
    }

    public void setBreastTime(double breastTime) {
        this.breastTime = breastTime;
    }

    public void registerBreastTime(){
        System.out.println("What is your fastest time at breast swimming?");
        setBreastTime(readDouble());
    }


    public int readInt() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        int choice = -1;
        while (!validChoice) {
            System.out.print(" ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                validChoice = true;
            } else {
                System.err.println("Please input a number");
                scanner.nextLine();
            }
        }
        return choice;
    }

    public String readString() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        String choice2 = " ";
        while (!validChoice) {
            System.out.print(" ");
            if (scanner.hasNextLine()) {
                choice2 = scanner.nextLine();
                validChoice = true;
            } else {
                System.err.println("Please input a string");
                scanner.nextLine();
            }
        }
        return choice2;
    }

    public char readChar() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        char choice2 = ' ';
        while (!validChoice) {
            System.out.print(" ");
            if (scanner.hasNextLine()) {
                choice2 = scanner.next().toUpperCase().charAt(0);
                validChoice = true;
            } else {
                System.err.println("Please input a character");
                scanner.nextLine();
            }
        }
        return choice2;
    }

    public double readDouble() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        double choice = -1;
        while (!validChoice) {
            System.out.print(" ");
            if (scanner.hasNextDouble()) {
                choice = scanner.nextDouble();
                validChoice = true;
            } else {
                System.err.println("Please input a number");
                scanner.nextLine();
            }
        }
        return choice;
    }

}
