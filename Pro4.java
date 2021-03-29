import java.util.*;
import java.io.*;

class Cards
{
    final Scanner scan = new Scanner(System.in);
    final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    private int i, rank, spades_size, diamonds_size, clubs_size, hearts_size;
    private String choice;
    private final ArrayList<Integer> spade_cards;
    private final ArrayList<Integer> hearts_cards;
    private final ArrayList<Integer> diamond_cards;
    private final ArrayList<Integer> clubs_cards;

    Cards(int i, int rank, int spades_size, int diamonds_size, int clubs_size, int hearts_size, String choice, ArrayList<Integer> spade_cards, ArrayList<Integer> hearts_cards, ArrayList<Integer> diamond_cards, ArrayList<Integer> clubs_cards)
    {
        this.i = i;
        this.rank = rank;
        this.spades_size = spades_size;
        this.diamonds_size = diamonds_size;
        this.clubs_size = clubs_size;
        this.hearts_size = hearts_size;
        this.choice = choice;
        this.spade_cards = spade_cards;
        this.hearts_cards = hearts_cards;
        this.diamond_cards = diamond_cards;
        this.clubs_cards = clubs_cards;
    }

    Cards()
    {
        this.i = 0;
        this.rank = 1;
        this.spades_size = 0;
        this.diamonds_size = 0;
        this.clubs_size = 0;
        this.hearts_size = 0;
        this.choice = "";
        this.spade_cards = new ArrayList<>();
        this.diamond_cards = new ArrayList<>();
        this.hearts_cards = new ArrayList<>();
        this.clubs_cards = new ArrayList<>();
    }

    void createDeck()throws IOException
    {
        System.out.println("\nEnter you choice for Spade deck ");
        System.out.println("1 - 13 for cards numbers (where  1 : Ace; 11 : Jack; 12 : Queen; 13 : King)");
        System.out.print("\nHow many cards you wanna add : ");
        spades_size = scan.nextInt();
        if(spades_size <= 13)
        {
            for(i = 0; i < spades_size; i++)
            {
                System.out.print("Enter the "+(i + 1)+ " rank of card : ");
                rank = scan.nextInt();
                if(rank >= 1 && rank <= 13)
                    spade_cards.add(rank);
                else 
                {
                    System.out.println("\t\tSorry wrong card rank entered.");
                    System.out.print("Do you wanna continue with "+(spades_size - i)+" or wanna start over (Y/N) : ");
                    choice = in.readLine();
                    if(choice.contains("Y"))
                    {
                        createDeck();
                        spade_cards.clear();
                        hearts_cards.clear();
                        diamond_cards.clear();
                        clubs_cards.clear();
                    }
                    else 
                        System.out.println("\nYou may continue.");
                }
            }
        }
        else
        {
            System.out.println("\t\tSorry a deck can have only 13 cards.");
            System.out.print("Do you wanna continue or wanna start over (Y/N) : ");
            choice = in.readLine();
            if(choice.contains("Y"))
            {
                createDeck();
                spade_cards.clear();
                hearts_cards.clear();
                diamond_cards.clear();
                clubs_cards.clear();
            }
            else
                System.out.println("\nYou may continue.");
        }

        System.out.println("\nEnter you choice for Hearts deck ");
        System.out.println("1 - 13 for cards numbers (where  1 : Ace; 11 : Jack; 12 : Queen; 13 : King)");
        System.out.print("\nHow many cards you wanna add : ");
        hearts_size = scan.nextInt();
        if(hearts_size <= 13)
        {
            for(i = 0; i < hearts_size; i++)
            {
                System.out.print("Enter the "+(i + 1)+ " rank of card : ");
                rank = scan.nextInt();
                if(rank >= 1 && rank <= 13)
                    hearts_cards.add(rank);
                else
                {
                    System.out.println("\t\tSorry wrong card rank entered.");
                    System.out.print("Do you wanna continue with "+(hearts_size - i)+" or wanna start over (Y/N) : ");
                    choice = in.readLine();
                    if(choice.contains("Y"))
                    {
                        createDeck();
                        spade_cards.clear();
                        hearts_cards.clear();
                        diamond_cards.clear();
                        clubs_cards.clear();
                    }
                    else
                        System.out.println("\nYou may continue.");
                }
            }
        }
        else
        {
            System.out.println("\t\tSorry a deck can have only 13 cards.");
            System.out.print("Do you wanna continue or wanna start over (Y/N) : ");
            choice = in.readLine();
            if(choice.contains("Y"))
            {
                createDeck();
                spade_cards.clear();
                hearts_cards.clear();
                diamond_cards.clear();
                clubs_cards.clear();
            }
            else
                System.out.println("\nYou may continue.");
        }

        System.out.println("\nEnter you choice for Diamond deck ");
        System.out.println("1 - 13 for cards numbers (where  1 : Ace; 11 : Jack; 12 : Queen; 13 : King)");
        System.out.print("\nHow many cards you wanna add : ");
        diamonds_size = scan.nextInt();
        if(diamonds_size <= 13)
        {
            for(i = 0; i < diamonds_size; i++)
            {
                System.out.print("Enter the "+(i + 1)+ " rank of card : ");
                rank = scan.nextInt();
                if(rank >= 1 && rank <= 13)
                    diamond_cards.add(rank);
                else
                {
                    System.out.println("\t\tSorry wrong card rank entered.");
                    System.out.print("Do you wanna continue with "+(diamonds_size - i)+" or wanna start over (Y/N) : ");
                    choice = in.readLine();
                    if(choice.contains("Y"))
                    {
                        createDeck();
                        spade_cards.clear();
                        hearts_cards.clear();
                        diamond_cards.clear();
                        clubs_cards.clear();
                    }
                    else
                        System.out.println("\nYou may continue.");
                }
            }
        }
        else
        {
            System.out.println("\t\tSorry a deck can have only 13 cards.");
            System.out.print("Do you wanna continue or wanna start over (Y/N) : ");
            choice = in.readLine();
            if(choice.contains("Y"))
            {
                createDeck();
                spade_cards.clear();
                hearts_cards.clear();
                diamond_cards.clear();
                clubs_cards.clear();
            }
            else
                System.out.println("\nYou may continue.");
        }

        System.out.println("\nEnter you choice for Clubs deck ");
        System.out.println("1 - 13 for cards numbers (where  1 : Ace; 11 : Jack; 12 : Queen; 13 : King)");
        System.out.print("\nHow many cards you wanna add : ");
        clubs_size = scan.nextInt();
        if(clubs_size <= 13)
        {
            for(i = 0; i < clubs_size; i++)
            {
                System.out.print("Enter the "+(i + 1)+ " rank of card : ");
                rank = scan.nextInt();
                if(rank >= 1 && rank <= 13)
                    clubs_cards.add(rank);
                else
                {
                    System.out.println("\t\tSorry wrong card rank entered.");
                    System.out.print("Do you wanna continue with "+(clubs_size - i)+" or wanna start over (Y/N) : ");
                    choice = in.readLine();
                    if(choice.contains("Y"))
                    {
                        createDeck();
                        spade_cards.clear();
                        hearts_cards.clear();
                        diamond_cards.clear();
                        clubs_cards.clear();
                    }
                    else
                        System.out.println("\nYou may continue.");
                }
            }
        }
        else
        {
            System.out.println("\t\tSorry a deck can have only 13 cards.");
            System.out.print("Do you wanna continue or wanna start over (Y/N) : ");
            choice = in.readLine();
            if(choice.contains("Y"))
            {
                createDeck();
                spade_cards.clear();
                hearts_cards.clear();
                diamond_cards.clear();
                clubs_cards.clear();
            }
            else
                System.out.println("\nYou may continue.");
        }
    }

    void printCard()
    {
        System.out.print("\nYou have these cards : ");
            if(spade_cards.contains(1) || diamond_cards.contains(1) || hearts_cards.contains(1) || clubs_cards.contains(1))
                System.out.print("\n\t\tAce");
            if(spade_cards.contains(2) || diamond_cards.contains(2) || hearts_cards.contains(2) || clubs_cards.contains(2))
                System.out.print("\n\t\t2");
            if(spade_cards.contains(3) || diamond_cards.contains(3) || hearts_cards.contains(3) || clubs_cards.contains(3))
                System.out.print("\n\t\t3");
            if(spade_cards.contains(4) || diamond_cards.contains(4) || hearts_cards.contains(4) || clubs_cards.contains(4))
                System.out.print("\n\t\t4");
            if(spade_cards.contains(5) || diamond_cards.contains(5) || hearts_cards.contains(5) || clubs_cards.contains(5))
                System.out.print("\n\t\t5");
            if(spade_cards.contains(6) || diamond_cards.contains(6) || hearts_cards.contains(6) || clubs_cards.contains(6))
                System.out.print("\n\t\t6");
            if(spade_cards.contains(7) || diamond_cards.contains(7) || hearts_cards.contains(7) || clubs_cards.contains(7))
                System.out.print("\n\t\t7");
            if(spade_cards.contains(8) || diamond_cards.contains(8) || hearts_cards.contains(8) || clubs_cards.contains(8))
                System.out.print("\n\t\t8");
            if(spade_cards.contains(9) || diamond_cards.contains(9) || hearts_cards.contains(9) || clubs_cards.contains(9))
                System.out.print("\n\t\t9");
            if(spade_cards.contains(10) || diamond_cards.contains(10) || hearts_cards.contains(10) || clubs_cards.contains(10))
                System.out.print("\n\t\t10");
            if(spade_cards.contains(11) || diamond_cards.contains(11) || hearts_cards.contains(11) || clubs_cards.contains(11))
                System.out.print("\n\t\tJack");
            if(spade_cards.contains(12) || diamond_cards.contains(12) || hearts_cards.contains(12) || clubs_cards.contains(12))
                System.out.print("\n\t\tQueen");
            if(spade_cards.contains(13) || diamond_cards.contains(13) || hearts_cards.contains(13) || clubs_cards.contains(13))
                System.out.print("\n\t\tKing");
    }

    void printDeck()
    {
        System.out.print("\nYour deck has : ");
            if (!spade_cards.isEmpty())
                System.out.print("\n\t\t"+spade_cards+" of Spades");
            if (!hearts_cards.isEmpty())
                System.out.print("\n\t\t"+hearts_cards+" of Hearts");
            if (!clubs_cards.isEmpty())
                System.out.print("\n\t\t"+clubs_cards+" of Clubs");
            if (!diamond_cards.isEmpty())
                System.out.print("\n\t\t"+diamond_cards+" of Diamonds");
    }

    void sameCard()
    {
        int flag = 0;

        if(!spade_cards.isEmpty())
        {
            for(i = 0; i < spades_size; i++)
            {
                for(int j = (i + 1); j < spades_size; j++)
                {
                    if(spade_cards.get(i).equals(spade_cards.get(j)))
                    {
                        System.out.print("\nYou have similar cards in spades deck.");
                        flag = flag + 1;
                    }
                }
            }
        }
        if(!diamond_cards.isEmpty())
        {
            for(i = 0; i < diamonds_size; i++)
            {
                for(int j = (i + 1); j < diamonds_size; j++)
                {
                    if(diamond_cards.get(i).equals(diamond_cards.get(j)))
                    {
                        System.out.print("\nYou have similar cards in diamond deck.");
                        flag = flag + 1;
                    }
                }
            }
        }
        if(!clubs_cards.isEmpty())
        {
            for(i = 0; i < clubs_size; i++)
            {
                for(int j = (i + 1); j < clubs_size; j++)
                {
                    if(clubs_cards.get(i).equals(clubs_cards.get(j)))
                    {
                        System.out.print("\nYou have similar cards in clubs deck.");
                        flag = flag + 1;
                    }
                }
            }
        }
        if(!hearts_cards.isEmpty())
        {
            for(i = 0; i < hearts_size; i++)
            {
                for(int j = (i + 1); j < hearts_size; j++)
                {
                    if(hearts_cards.get(i).equals(hearts_cards.get(j)))
                    {
                        System.out.print("\nYou have similar cards in hearts deck.");
                        flag = flag + 1;
                    }
                }
            }
        }
        if(flag == 0)
            System.out.print("\nYou do not have similar cards in your deck.");
    }

    void compareCard()
    {
        ArrayList<Integer> first_card = new ArrayList<>();
        ArrayList<Integer> second_card = new ArrayList<>();
        int deck1, deck2, rank1, rank2;
        
        System.out.println("\nYour options for 1st are ");
        System.out.println("1 - 4 (where 1 : Spades; 2 : Hearts; 3 : Diamonds; 4 : Clubs)");
        System.out.print("Enter your choice : ");
        deck1 = scan.nextInt();
        System.out.print("Enter the rank of the 1st card : ");
        rank1 = scan.nextInt();
        System.out.println("\nYour options 2nd are ");
        System.out.println("1 - 4 (where 1 : Spades; 2 : Hearts; 3 : Diamonds; 4 : Clubs)");
        System.out.print("Enter your choice : ");
        deck2 = scan.nextInt();
        System.out.print("Enter the rank of the 2nd card : ");
        rank2 = scan.nextInt();

        first_card.add(deck1);
        first_card.add(rank1);
        second_card.add(deck2);
        second_card.add(rank2);

        System.out.print("\nThe cards you have entered are same : "+first_card.equals(second_card));
    }

    void sortCard()
    {
        Collections.sort(spade_cards);
        Collections.sort(diamond_cards);
        Collections.sort(hearts_cards);
        Collections.sort(clubs_cards);

        System.out.println("Spades have : "+spade_cards);
        System.out.println("Diamonds have : "+diamond_cards);
        System.out.println("Hearts have : "+hearts_cards);
        System.out.println("Clubs have : "+clubs_cards);
    }


    void findCard()
    {
        int deck, rank1;
        System.out.println("\nYour options are ");
        System.out.println("1 - 4 (where 1 : Spades; 2 : Hearts; 3 : Diamonds; 4 : Clubs)");
        System.out.print("Enter your choice : ");
        deck = scan.nextInt();

        if (deck == 1)
        {
            System.out.print("\nEnter the rank of the card : ");
            rank1 = scan.nextInt();
            if (spade_cards.contains(rank1))
                System.out.print("\nCard you searched is present in the deck you created.");
            else
                System.out.print("\nCard you searched is not present in the deck you created.");
        }

        if (deck == 2)
        {
            System.out.print("\nEnter the rank of the card : ");
            rank1 = scan.nextInt();
            if (hearts_cards.contains(rank1))
                System.out.print("\nCard you searched is present in the deck you created.");
            else
                System.out.print("\nCard you searched is not present in the deck you created.");
        }

        if (deck == 3)
        {
            System.out.print("\nEnter the rank of the card : ");
            rank1 = scan.nextInt();
            if (diamond_cards.contains(rank1))
                System.out.print("\nCard you searched is present in the deck you created.");
            else
                System.out.print("\nCard you searched is not present in the deck you created.");
        }

        if (deck == 4)
        {
            System.out.print("\nEnter the rank of the card : ");
            rank1 = scan.nextInt();
            if (clubs_cards.contains(rank1))
                System.out.print("\nCard you searched is present in the deck you created.");
            else
                System.out.print("\nCard you searched is not present in the deck you created.");
        }
    }

    void dealCards()
    {
        ArrayList<Integer> deck = new ArrayList<>();
        deck.addAll(spade_cards);
        deck.addAll(diamond_cards);
        deck.addAll(hearts_cards);
        deck.addAll(clubs_cards);

        for(i = 0; i < 5; i++)
        {
            int randomIndex = (int) (Math.random() * deck.size());
            System.out.println(deck.get(randomIndex));
        }
    }
}


public class Pro4
{
    @Override
    public void finalize()
    {
        System.out.println("Object is collecting garbage. ");
    }

    public static void main(String[] args)
    {
        Cards c = new Cards();
        new Cards(0, 0, 0, 0, 0, 0, "",new ArrayList<>(0), new ArrayList<>(0), new ArrayList<>(0), new ArrayList<>(0));

        Scanner sc = new Scanner(System.in);

        int choice;

        try
        {
            while(true)
            {
                System.out.print("\n\n\tThese are your options : \n");
                System.out.println("1) Create your own custom deck of cards.");
                System.out.println("2) Print a card from your deck.");
                System.out.println("3) Print the deck.");
                System.out.println("4) Same card.");
                System.out.println("5) Compare card.");
                System.out.println("6) Sort the cards.");
                System.out.println("7) Find a cards.");
                System.out.println("8) Deal random cards from the deck.");
                System.out.println("9) See the use of garbage collection and exit.");
                System.out.println("10) Exit.");
                System.out.print("\t\tPlease enter your choice : ");
                choice = sc.nextInt();

                switch(choice)
                {
                    case 1 :
                        c.createDeck();
                        break;
                    case 2 :
                        c.printCard();
                        break;
                    case 3 :
                        c.printDeck();
                        break;
                    case 4 :
                        c.sameCard();
                        break;
                    case 5 :
                        c.compareCard();
                        break;
                    case 6 :
                        c.sortCard();
                        break;
                    case 7 :
                        c.findCard();
                        break;
                    case 8 :
                        c.dealCards();
                        break;
                    case 9 :
                    {
                        c = null;
                        System.gc();
                        System.exit(0);
                    }
                    case 10 :
                        System.out.print("\n\n\tThank You!!");
                        System.exit(0);
                    default :
                        System.out.print("\nPlease enter a valid choice!");
                }

            }
        }

        catch (Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
}