using System;

namespace algorithm_57
{
    class ms_0915
    {
        static int Square(int x, int y)
        { 
            if(x > y)
                return x*x - y*y;
            else
                return y*y - x*x;
        }

        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int[] data = new int[2] { 0, 0 };

            for(int i = 0; i < data.Length; i++) 
            {
                int temp = Convert.ToInt32(input[i]);

                if(temp >= 0)
                    data[i] = temp;
            }

            Console.WriteLine(Square(data[0], data[1]));
        }
    }
}
