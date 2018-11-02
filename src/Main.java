import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
    //Dit zij alle Array lists
    //Eten
    public static ArrayList<String> prodKoudEten = new ArrayList<String>();
    public static ArrayList<String> prodWarmEten = new ArrayList<String>();
    //Drinken
    public static ArrayList<String> prodKoudDrinken = new ArrayList<String>();
    public static ArrayList<String> prodWarmDrinken = new ArrayList<String>();
    //Besteling
    public static ArrayList<String> Bestelling = new ArrayList<String>();

    public static Scanner sc = new Scanner(System.in);
    //Kosten van de producten
    public double[] kost = {1.00, 2.00, 0.50, 1.50, 1.00, 5.00, 2.00, 2.50, 0.50, 0.50, 0.99, 0.99, 1.00, 1.00, 1.50, 0.50};


    public static void main(String[] args) {

        Main main = new Main();
        main.start();
    }


    public void start() {

        //Koud Eten
        prodKoudEten.add("Chocolade Muffin $" + kost[0]);
        prodKoudEten.add("Chocolade Taart $" + kost[1]);
        prodKoudEten.add("Chocolade Koekje $" + kost[2]);
        prodKoudEten.add("Chocolade Reep $" + kost[3]);

        //Warm Eten
        prodWarmEten.add("Pannenkoek $" + kost[4]);
        prodWarmEten.add("Pizza $" + kost[5]);
        prodWarmEten.add("Patat $" + kost[6]);
        prodWarmEten.add("Poffertjes $" + kost[7]);

        //Koud Drinken
        prodKoudDrinken.add("Water $" + kost[8]);
        prodKoudDrinken.add("Limonade $" + kost[9]);
        prodKoudDrinken.add("Appelsap $" + kost[10]);
        prodKoudDrinken.add("Sinasappelsap $" + kost[11]);

        //Warm Drinken
        prodWarmDrinken.add("Thee $" + kost[12]);
        prodWarmDrinken.add("Koffie $" + kost[13]);
        prodWarmDrinken.add("Hete Chocomelk $" + kost[14]);
        prodWarmDrinken.add("Heet water $" + kost[15]);


        System.out.println("Goedendag u zult vragen krijgen over wat u wilt eten en drinken.");
        System.out.println("U heeft $15");
        System.out.println("Heeft u honger?");
        System.out.println("1 = Ja");
        System.out.println("2 = Nee");
        Scanner scan = new Scanner(System.in);
        int Vraag = scan.nextInt();

        //Eten
        if(Vraag == 1)
        {
            //Warm of Koud eten Vraag
            System.out.println("Wilt u warm of koud eten?");
            System.out.println("1 = Warm");
            System.out.println("2 = Koud");
            int Eten = scan.nextInt();
            //Warm eten
            if(Eten == 1)
            {
                System.out.println("Dit is all het Warme Eten:");
                for(int i = 0; i < prodWarmEten.size(); i++)
                {
                    System.out.println(i + 1 + ". " + prodWarmEten.get(i));
                }
            }

            //Koud Eten
            if(Eten == 2)
            {
                System.out.println("Dit is all het Koude Eten:");
                System.out.println(prodKoudEten);
            }
            else{
                  System.out.println("U heeft het verkeerde nummer ingevult! Vul 1 of 2 in.");
            }
        }

        //Drinken
        if(Vraag == 2) {
            System.out.println("Heeft u Dorst?");
            System.out.println("1 = Ja");
            System.out.println("2 = Nee");
            int Dorst = scan.nextInt();
            if(Dorst == 1) {

                //Warm of Koud drinken Vraag
                System.out.println("Wilt u warm of koud drankje?");
                System.out.println("1 = Warm");
                System.out.println("2 = Koud");
                int Drinken = scan.nextInt();

                //Warm Drinken
                if (Drinken == 1) {
                    System.out.println("Dit zijn alle Warme Drankjes:");
                    System.out.println(prodWarmDrinken);
                }

                //Koud Drinken
                if (Drinken == 2) {
                    System.out.println("Dit zijn alle Koude Drankjes:");
                    System.out.println(prodKoudDrinken);
                } else {
                    System.out.println("U heeft het verkeerde nummer ingevult! Vul 1 of 2 in.");
                }
            }
            else {
                System.out.println("Wilt u stoppen?");
                System.out.println("1 = Ja");
                System.out.println("2 = Nee");
                int Stop = scan.nextInt();
                if(Stop == 1)
                {
                    System.exit(1);
                }
                if(Stop == 2)
                {
                    start();
                }
                else
                {
                    System.out.println("U heeft het verkeerde nummer ingevult! Vul 1 of 2 in.");
                }
            }
        }
    }

}
