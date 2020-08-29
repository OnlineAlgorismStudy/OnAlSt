using System;

namespace algorithm_30
{
    class ms_0807
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');

            if(input.Length != 10)
                return;

            bool[] check = new bool[10];

            for(int i = 0; i < 10; i++) {
                int temp = Convert.ToInt32(input[i]);

                if(0 < temp && temp < 100)
                    check[i] = true;
                else if(100 <= temp && temp < 10000)
                    check[i] = false;
            }

            int max = 0, min = 10000;

            for(int i = 0; i < 10; i++) {
                int temp = Convert.ToInt32(input[i]);

                if(check[i]) {
                    if(temp > max)
                        max = temp;
                } else {
                    if(temp < min)
                        min = temp;
                }

                if(temp < 1)
                    max = 100;
                else if(temp >= 10000)
                    min = 100;
            }

            Console.WriteLine($"{max} {min}");
        }
    }
}
