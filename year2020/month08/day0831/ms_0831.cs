using System;

namespace algorithm_46
{
    class Program
    {
        static void Main(string[] args)
        {
            char[,] data = new char[3, 5];

            for(int i = 0; i < 3; i++) 
            {
                string[] inputs = Console.ReadLine().Split(' ');
                int j = 0;

                foreach(var word in inputs) 
                {
                    char temp = Convert.ToChar(word);

                    if('A' <= temp && temp <= 'Z') 
                    {
                        data[i, j] = temp;
                        j++;
                    } 
                    else 
                    {
                        i--;
                        continue;
                    }
                }
            }

            for(int i = 0; i < 3; i++) 
            {
                for(int j = 0; j < 5; j++) 
                {
                    Console.Write($"{Convert.ToChar(data[i, j] + 32)}");

                    if(j != 5)
                        Console.Write(' ');
                }

                Console.WriteLine();
            }
        }
    }
}
