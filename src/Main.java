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

    //Scanner
    Scanner scan = new Scanner(System.in);

    //Het geld waar je mee start
    public double budget = 20;

    //Kosten van de producten
    public double[] kost = {1.00, 2.00, 0.50, 1.50, 1.00, 5.00, 2.00, 2.50, 0.50, 0.50, 0.99, 0.99, 1.00, 1.00, 1.50, 0.50};


    public static void main(String[] args)
    {
        Main main = new Main();
        main.start();
    }

    //Funtie van Koud eten
    public void koudEten()
    {
        System.out.println("U kunt maar 1 product per keer kiezen \n");
        System.out.println("Dit is all het Koude Eten:");
        for(int i = 0; i < prodKoudEten.size(); i++)
        {
            System.out.println(i + 1 + ". " + prodKoudEten.get(i));
        }

    }

    //Functie van het warm eten
    public void warmEten()
    {
        System.out.println("U kunt maar 1 product per keer kiezen \n");
        System.out.println("Dit is all het Warme Eten:");
        for(int i = 0; i < prodWarmEten.size(); i++)
        {
            System.out.println(i + 1 + ". " + prodWarmEten.get(i));
        }


    }

    public void koudDrinken()
    {
        System.out.println("U kunt maar 1 product per keer kiezen \n");
        System.out.println("Dit zijn alle Koude Drankjes:");
        for(int i = 0; i < prodKoudDrinken.size(); i++)
        {
            System.out.println(i + 1 + ". " + prodKoudDrinken.get(i));
        }

    }

    public void warmDrinken()
    {
        System.out.println("U kunt maar 1 product per keer kiezen \n");
        System.out.println("Dit zijn alle Warme Drankjes:");
        for(int i = 0; i < prodWarmDrinken.size(); i++)
        {
            System.out.println(i + 1 + ". " + prodWarmDrinken.get(i));
        }

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


        //Het begin van de vragen
        System.out.println("Goedendag u zult vragen krijgen over wat u wilt eten en drinken.");
        System.out.println("U heeft $20");

        //Wilt u Eten of drinken vraag
        System.out.println("Wilt u iets eten of iets drinken?");
        System.out.println("1 = Eten");
        System.out.println("2 = Drinken");

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
                    warmEten();
                    int warmEtenKeuze = scan.nextInt();
                    if()
                    break;


                }

                //Koud Eten
                if(Eten == 2)
                {
                    koudEten();
                    break;
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
                    if (Drinken == 1)
                    {
                        warmDrinken();
                        break;
                    }

                    //Koud Drinken
                    if (Drinken == 2)
                    {
                        koudDrinken();
                        break;
                    }


                    else {
                        System.out.println("U heeft het verkeerde nummer ingevult! Vul 1 of 2 in.");
                    }
                    break;
                }

                //Laat het geld zien wat je hebt
                System.out.println("Wat wilt u bestellen? U heeft $" + budget);

                int keuze = scan.nextInt();
                switch(keuze)
                {
                    //De 4 cases hieronder zijn voor het Koude eten
                    case 1://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[0];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                         order.add(" ________ ");
                         order.add("/        \\");
                         order.add("|        |");
                        order.add("------------");
                        order.add("|----------|");
                        order.add("|----------|");
                        order.add("\\----------/");

                        break;

                    case 2://Chocolade Taart
                        //Dit is het budget min de kosten van het product
                        budget -= kost[1];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);


                        //Voegt de keuze toe aan een de Array order
                        order.add("         (");
                        order.add("          )");
                        order.add("    __..---..__");
                        order.add(",-='  /  |  \\  `=-.");
                        order.add(":--..___________..--;");
                        order.add("\\.,_____________,./");


                        break;

                    case 3://Chocolade Koekje
                        //Dit is het budget min de kosten van het product
                        budget -= kost[2];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add(" ________ ");
                        order.add("/        \\");
                        order.add("|        |");
                        order.add("------------");
                        order.add("|----------|");
                        order.add("|----------|");
                        order.add("\\----------/");

                        break;

                    case 4://Chocolade Reep
                        //Dit is het budget min de kosten van het product
                        budget -= kost[3];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add(" _____________,-.___     _");
                        order.add("|____        { {]_]_]   [_]");
                        order.add("|___ `-----.__\\ \\_]_]_    . `");
                        order.add("|   `-----.____} }]_]_]_   ,");
                        order.add("|_____________/ {_]_]_]_] , `");
                        order.add("              `-'");


                        break;


                        //De 4 cases hieronder zijn voor het Warme Eten
                    case 5://Pannenkoeken
                        //Dit is het budget min de kosten van het product
                        budget -= kost[4];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("             _____");
                        order.add("          .-'     '-.");
                        order.add("        .'           '.");
                        order.add("       /               \\");
                        order.add("      ;                 ;");
                        order.add("      |                 |");
                        order.add("      ;                 ;");
                        order.add("       \\               /");
                        order.add("        '.           .'");
                        order.add("          '-._____.-'");



                        break;

                    case 6://Pizza
                        //Dit is het budget min de kosten van het product
                        budget -= kost[5];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("// \"\"--.._");
                        order.add("||  (_)  _ \"-._");
                        order.add("||    _ (_)    '-.");
                        order.add("||   (_)   __..-'");
                        order.add(" \\\\__..--\"\"");

                        break;

                    case 7://Patat
                        //Dit is het budget min de kosten van het product
                        budget -= kost[6];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");

                        break;

                    case 8://Poffertjes
                        //Dit is het budget min de kosten van het product
                        budget -= kost[7];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("                   .-'''-.");
                        order.add("           .-'''-./       \\.-'''-.");
                        order.add("   .-'''-./       \\       /       \\.-'''-.");
                        order.add("  /       \\       /'-...-'\\.-'''-./       \\");
                        order.add("  \\       /'-...-'\\.-'''-./       \\       /");
                        order.add("   '-...-'\\       /       \\       /'-...-'");
                        order.add("           '-...-'\\       /'-...-'");
                        order.add("                   '-...-'\n");

                        break;

                    //De 4 cases hieronder zijn voor het Koude drinken
                    case 9://Water
                        //Dit is het budget min de kosten van het product
                        budget -= kost[8];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("     _____________");
                        order.add("    <_____________> ___");
                        order.add("    |             |/ _ \\");
                        order.add("    |               | | |");
                        order.add("    |               |_| |");
                        order.add(" ___|             |\\___/");
                        order.add("/    \\___________/    \\");
                        order.add("\\_____________________/");


                        break;

                    case 10://limonade
                        //Dit is het budget min de kosten van het product
                        budget -= kost[9];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");

                        break;

                    case 11://Appelsap
                        //Dit is het budget min de kosten van het product
                        budget -= kost[10];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");

                        break;

                    case 12://Sinasappelsap
                        //Dit is het budget min de kosten van het product
                        budget -= kost[11];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");;

                        break;

                    //De 4 cases hieronder zijn voor het Warme drinken
                    case 13://Thee
                        //Dit is het budget min de kosten van het product
                        budget -= kost[12];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("    (  )   (   )  )");
                        order.add("     ) (   )  (  (");
                        order.add("     ( )  (    ) )");
                        order.add("     _____________");
                        order.add("    <_____________> ___");
                        order.add("    |             |/ _ \\");
                        order.add("    |               | | |");
                        order.add("    |               |_| |");
                        order.add(" ___|             |\\___/");
                        order.add("/    \\___________/    \\");
                        order.add("\\_____________________/");


                        break;

                    case 14://Koffie
                        //Dit is het budget min de kosten van het product
                        budget -= kost[13];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("      )  (");
                        order.add("     (   ) )");
                        order.add("      ) ( (");
                        order.add("    _______)_");
                        order.add(" .-'---------|  ");
                        order.add("( C|/\\/\\/\\/\\/|");
                        order.add(" '-./\\/\\/\\/\\/|");
                        order.add("   '_________'");
                        order.add("    '-------'");

                        break;

                    case 15://Hete Chocolademelk
                        //Dit is het budget min de kosten van het product
                        budget -= kost[14];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("      )  (");
                        order.add("     (   ) )");
                        order.add("      ) ( (");
                        order.add("    _______)_");
                        order.add(" .-'---------|  ");
                        order.add("( C|/\\/\\/\\/\\/|");
                        order.add(" '-./\\/\\/\\/\\/|");
                        order.add("   '_________'");
                        order.add("    '-------'");

                        break;

                    case 16://Heet water
                        //Dit is het budget min de kosten van het product
                        budget -= kost[15];
                        System.out.println("U heeft een product aangeschaft. U heeft nu nog $" + budget);
                        System.out.println("De kosten van de producten: €" + budget);



                        //Voegt de keuze toe aan een de Array order
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");
                        order.add("");

                        break;
                }

                if(budget < 0)
                {
                    System.out.println("U heeft geen geld meer!");
                    System.out.println("U krijgt nu uw geld trug en u moet opnieuw beginnen met bestellen.");
                }

                System.out.println("Wilt u nog een product kopen?");
                System.out.println("Ja = 1");
                System.out.println("Nee = 2");
                int antwoord = scan.nextInt();
                while(antwoord == 1);
                if(antwoord == 2)
                {

                    for(String order : order)
                    {
                        System.out.println(order);
                    }
                    System.out.println("Bedankt voor uw aankopen!");
                    System.out.println("Ik wens u nog een fijne dag!");

                    //Laat het geld wat je over hebt zien
                    System.out.println("U heeft $"+ budget + "over.");
                    System.exit(1);
                }



        }


    }

}
