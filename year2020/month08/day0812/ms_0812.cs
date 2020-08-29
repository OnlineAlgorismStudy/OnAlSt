using System;

namespace algorithm_33
{
    class ms_0812
    {
        static void Main(string[] args)
        {
            int[] data = new int[10];
            int odd = 0, even = 0;

            for(int i = 0; i < data.Length; i++) 
            {
                data[i] = Convert.ToInt32(Console.ReadLine());

                if(i%2 == 0)
                    odd += data[i];
                else
                    even += data[i];
            }

            Console.WriteLine($"odd : {odd}\neven : {even}");
        }
    }
}
