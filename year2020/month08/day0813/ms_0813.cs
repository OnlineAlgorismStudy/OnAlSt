using System;

namespace algorithm_34
{
    class ms_0813
    {
        static void Main(string[] args)
        {
            int[] data = new int[100];
            int i = 0, count = 0;

            while(i < data.Length) 
            {
                int digit = Convert.ToInt32(Console.ReadLine());

                if(-1000 < digit && digit < 1000) 
                {
                    if(digit != 999) 
                    {
                        data[i] = digit;
                        count++;
                    } 
                    else break;
                } 
                else continue;

                i++;
            }
            
            int max = -1000, min = 1000;

            for(i = 0; i < count; i++) 
            {
                if(max < data[i]) max = data[i];
                if(min > data[i]) min = data[i];
            }

            Console.WriteLine($"max : {max}\nmin : {min}");
        }
    }
}
