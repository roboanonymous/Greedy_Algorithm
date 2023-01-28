import org.w3c.dom.ls.LSOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
 class ItemValue
{
     int val;
     int wt;
    public ItemValue(int val, int wt)
    {
        this.wt = wt;
        this.val = val;
    }

    @Override
    public String toString() {
        return "ItemValue{" +
                "val=" + val +
                ", wt=" + wt +
                '}';
    }
}
public class knapsack {

     public static double getMaxValue(ArrayList<ItemValue> list , int w)
     {
         Arrays.sort(list, new Comparator<ItemValue>() {
             @Override
             public int compare(ItemValue item1,
                                ItemValue item2)
             {
                 int  cpr1 = item1.val/ item1.wt;
                 int  cpr2 = new (item2.val / item2.wt);

                 if (cpr1 < cpr2)
                     return 1;
                 else
                     return -1;
             }
         });


         return 0;
     }
    public static void main (String[] args)
    {
        int n = 3, w = 50;
        int value[] = {60,100,120};
        int weight[] = {10, 20, 30};

        ArrayList <ItemValue> list = new ArrayList<>();
        for(int i=0 ; i<n; i++)
        {
            list.add(new ItemValue(value[i], weight[i]));
        }


        System.out.println(list);

        double maxValue = getMaxValue(list, w);
        // Function call
        System.out.println(maxValue);
    }


}
