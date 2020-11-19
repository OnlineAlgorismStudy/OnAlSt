using System;

namespace algorithm_104
{
    class ms_1119
    {
        static void Main(string[] args)
        {
            String[] data = new String[50];
            String word = "";
            int i = -1;

            while(word != "0" && i < 50)
            {
                word = Console.ReadLine();

                if(word.Length <= 100)
                {
                    i++;
                    data[i] = word;
                }
            }

            Console.WriteLine(i);

            for(int j = 0; j < i; j++)
            {
                if(j%2 == 0)
                {
                    Console.WriteLine(data[j]);
                }
            }
        }
    }
}
