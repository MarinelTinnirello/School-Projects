import java.util.Arrays;
import java.lang.Math;

public class TestAppliance
{
    public static void main (String[] args)
    {
        Appliance[] arr = new Appliance[40];
        int k = 0;

        for(int i = 0; i < 40; i++)
        {
            k = (int)(4 * Math.random());

            if (k == 0) {
                arr[i] = new Toaster(100, "blue", "JP", 50);
            } else if (k == 1)
            {
                arr[i] = new TV(300, "green", "KO", 500);
            }else
            {
                arr[i] = new Telephone(10, "red", "CH", 75);
            }
        }

        Appliance temp = new Appliance(0, "black", "nowhere", 0);

        for (int i = 0; i < 40; i++)
        {
            for (int j = 1; j < 40; j++)
            {
                if (arr[j].getPrice() > arr[i].getPrice())
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr[5]);
        System.out.println(arr[19]);
        System.out.println(arr[39]);
    }
}
