using System;

namespace algorithm_36
{
    class ms_0817
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
                } else break;

                i++;
            }

            Console.WriteLine(count);

            for(i = 0; i < count; i++) 
            {
                if(data[i]%2 == 0)
                    Console.Write(data[i]/2);
                else
                    Console.Write(data[i]*2);

                Console.Write(' ');
            }
        }
    }
}
