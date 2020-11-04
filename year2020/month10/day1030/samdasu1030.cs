using System;

namespace samdasu1030
{
    class samdasu1030
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();

            if (input.Length < 101)
            {
                for(int i = 0; i<input.Length; i++)
                {
                    if((input[i]>=65 && input[i]<=90)
                        ||(input[i])>=97 && input[i] <= 122)
                    {
                        Console.Write(Char.ToLower(input[i]));
                    }
                    else if(input[i]>= 48 && input[i] <= 57)
                    {
                        Console.Write(input[i]);
                    }
                }
            }
        }
    }
}
