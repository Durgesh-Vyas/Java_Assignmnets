import java.util.*;

class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        ArrayList<Integer> t3 = new ArrayList<>();
        ArrayList<Integer> t4 = new ArrayList<>();

        int size, i, j, flag = 0;

        System.out.print("\nEnter the size : ");
        size = sc.nextInt();

        for(i = 0; i < size; i++)
        {
            System.out.print("Enter "+(i + 1)+ " element : ");
            t1.add(sc.nextInt());
        }
        for(i = 0; i < size; i++)
        {
            System.out.print("Enter "+(i + 1)+ " element : ");
            t2.add(sc.nextInt());
        }
        for(i = 0; i < size; i++)
        {
            System.out.print("Enter "+(i + 1)+ " element : ");
            t3.add(sc.nextInt());
        }
        for(i = 0; i < size; i++)
        {
            System.out.print("Enter "+(i + 1)+ " element : ");
            t4.add(sc.nextInt());
        }

        for(i = 0; i < size; i++)
        {
            for(j = (i +1); j < size; j++)
            {
                if(t1.get(i).equals(t1.get(j)) || t2.get(i).equals(t2.get(j)) || t3.get(i).equals(t3.get(j)) || t4.get(i).equals(t4.get(j)))
                {
                    System.out.print("\nSame element found.");
                    flag = flag + 1;
                }
            }
        }
        if(flag == 0)
            System.out.print("\nNo element is same.");
    }
}