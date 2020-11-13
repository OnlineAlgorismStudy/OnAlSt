using System;

namespace algorithm_100
{
    class ms_1113
    {
        static void Main(string[] args)
        {
            String input = Console.ReadLine();

            if(input.Length <= 20)
            {
                for(int i = 0; i < input.Length; i++) 
                {
                    char temp = Convert.ToChar(input[i]);

                    if(!(('0' <= temp && temp <= '9') || temp == '.'))
                        input = input.Replace(temp, '0');
                }

                double data = Convert.ToDouble(input);

                Console.WriteLine(2* Convert.ToInt32(data));
                Console.WriteLine($"{data:0.00}");
            }
        }
    }
}
