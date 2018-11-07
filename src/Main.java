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
    public Scanner sc = new Scanner(System.in);

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
                    warmEten();
                }

                //Koud Eten
                if(Eten == 2)
                {
                    koudEten();
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
                    }

                    //Koud Drinken
                    if (Drinken == 2)
                    {
                        koudDrinken();
                    }


                    else {
                        System.out.println("U heeft het verkeerde nummer ingevult! Vul 1 of 2 in.");
                    }
                    break;
                }

                //Laat het geld zien wat je hebt
                System.out.println("Wat wilt u bestellen? U heeft $" + budget);

                int keuze = sc.nextInt();
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
                        order.add(" ________ ");
                        order.add("/        \\");
                        order.add("|        |");
                        order.add("------------");
                        order.add("|----------|");
                        order.add("|----------|");
                        order.add("\\----------/");

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
                        order.add(" ________ ");
                        order.add("/        \\");
                        order.add("|        |");
                        order.add("------------");
                        order.add("|----------|");
                        order.add("|----------|");
                        order.add("\\----------/");

                        break;


                        //De 4 cases hieronder zijn voor het Warme Eten
                    case 5://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[4];
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

                    case 6://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[5];
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

                    case 7://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[6];
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

                    case 8://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[7];
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

                    //De 4 cases hieronder zijn voor het Koude drinken
                    case 9://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[8];
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

                    case 10://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[9];
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

                    case 11://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[10];
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

                    case 12://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[11];
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

                    //De 4 cases hieronder zijn voor het Warme drinken
                    case 13://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[12];
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

                    case 14://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[13];
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

                    case 15://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[14];
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

                    case 16://Chocolade Muffin
                        //Dit is het budget min de kosten van het product
                        budget -= kost[15];
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
