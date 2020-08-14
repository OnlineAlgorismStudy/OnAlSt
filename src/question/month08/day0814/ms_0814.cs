using System;

namespace algorithm_35
{
    class ms_0814
    {
        static void Main(string[] args)
        {
            int[] data = new int[100];
            int count = 0, i = 0;

            while(i < data.Length) 
            {
                int temp = Convert.ToInt32(Console.ReadLine());

                if(temp != 0) 
                {
                    data[i] = temp;
                    count++;
                }
                else break;

                i++;
            }

            int sum = 0, multiples = 0;

            for(i = 0; i < count; i++) 
            {
                if(data[i]%5 == 0) 
                {
                    sum += data[i];
                    multiples++;
                }
            }

            double avg = sum / Convert.ToDouble(multiples);

            Console.WriteLine($"Multiples of 5 : {multiples}");
            Console.WriteLine($"sum : {sum}\navg : {avg:.0}");
        }
    }
}
