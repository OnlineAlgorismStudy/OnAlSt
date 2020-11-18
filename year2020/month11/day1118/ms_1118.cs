using System;

namespace algorithm_103
{
    class ms_1118
    {
        static void Main(string[] args)
        {
            String[] data = { "flower", "rose", "lily", "daffodil", "azalea" };
            char input = Convert.ToChar(Console.ReadLine());
            int count = 0;

            for(int i = 0; i < data.Length; i++)
            {
                char second = Convert.ToChar(data[i][1]);
                char third = Convert.ToChar(data[i][2]);

                if((second == input) || (third == input)) 
                {
                    Console.WriteLine(data[i]);
                    count++;
                }
            }

            Console.WriteLine(count);
        }
    }
}
