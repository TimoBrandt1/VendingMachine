import java.util.ArrayList;
import java.util.Scanner;


public class Main
{

    //Eten
    public static ArrayList<String> prodKoudEten = new ArrayList<String>();
    public static ArrayList<String> prodWarmEten = new ArrayList<String>();

    //Drinken
    public static ArrayList<String> prodKoudDrinken = new ArrayList<String>();
    public static ArrayList<String> prodWarmDrinken = new ArrayList<String>();

    //Besteling
    public static ArrayList<String> order = new ArrayList<String>();

    //Het geld waar je mee start
    public double budget = 20;

    //Kosten van de producten
    public double[] kost = {1.00, 2.00, 0.50, 1.50, 1.00, 5.00, 2.00, 2.50, 0.50, 0.50, 0.99, 0.99, 1.00, 1.00, 1.50, 0.50};


    public static void main(String[] args)
    {
        Main main = new Main();
        main.start();
    }

    public void start() {

        // Voegt Koud Eten Toe
        prodKoudEten.add("Chocolade Muffin $" + kost[0]);
        prodKoudEten.add("Chocolade Taart $" + kost[1]);
        prodKoudEten.add("Chocolade Koekje $" + kost[2]);
        prodKoudEten.add("Chocolade Reep $" + kost[3]);

        //Voegt Warm Eten toe
        prodWarmEten.add("Pannenkoek $" + kost[4]);
        prodWarmEten.add("Pizza $" + kost[5]);
        prodWarmEten.add("Patat $" + kost[6]);
        prodWarmEten.add("Poffertjes $" + kost[7]);

        //Voegt Koud Drinken toe
        prodKoudDrinken.add("Water $" + kost[8]);
        prodKoudDrinken.add("Limonade $" + kost[9]);
        prodKoudDrinken.add("Appelsap $" + kost[10]);
        prodKoudDrinken.add("Sinasappelsap $" + kost[11]);

        //Voegt Warm Drinken toe
        prodWarmDrinken.add("Thee $" + kost[12]);
        prodWarmDrinken.add("Koffie $" + kost[13]);
        prodWarmDrinken.add("Hete Chocomelk $" + kost[14]);
        prodWarmDrinken.add("Heet water $" + kost[15]);

        System.out.println("Goedendag u zult vragen krijgen over wat u wilt eten en drinken.");
        System.out.println("U heeft $20");
        System.out.println("Wilt u iets eten of iets drinken?");
        System.out.println("1 = Eten");
        System.out.println("2 = Drinken");
        Scanner scan = new Scanner(System.in);
        int Vraag = scan.nextInt();



        switch (Vraag)
        {
            //Eten
            case 1:
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
                    for(int i = 0; i < prodKoudEten.size(); i++)
                    {
                        System.out.println(i + 1 + ". " + prodKoudEten.get(i));
                    }
                }
                else{
                    System.out.println("U heeft het verkeerde nummer ingevult! Vul 1 of 2 in.");
                }
                break;

                //Drinken
            case 2:
                //Warm of Koud drinken Vraag
                System.out.println("Wilt u warm of koud drinken?");
                System.out.println("1 = Warm");
                System.out.println("2 = Koud");
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
                        for(int i = 0; i < prodWarmDrinken.size(); i++)
                        {
                            System.out.println(i + 1 + ". " + prodWarmDrinken.get(i));
                        }
                    }

                    //Koud Drinken
                    if (Drinken == 2) {
                        System.out.println("Dit zijn alle Koude Drankjes:");
                        for(int i = 0; i < prodKoudDrinken.size(); i++)
                        {
                            System.out.println(i + 1 + ". " + prodKoudDrinken.get(i));
                        }
                    } else {
                        System.out.println("U heeft het verkeerde nummer ingevult! Vul 1 of 2 in.");
                    }
                }

                /*
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
                */
                break;




        }


    }

}
