using System;

namespace algorithm_106
{
    class ms_1123
    {
        static bool isIN(String data, String find) 
        {
            if(data.IndexOf(find) != -1)
                return true;
            else
                return false;
        }

        static void Main(string[] args)
        {
            String[] data = new String[5];

            for(int i = 0; i < data.Length; i++)
            {
                String temp = Console.ReadLine();

                if(temp.Length <= 100)
                {
                    data[i] = temp;
                }
                else i--;
            }

            char c = Convert.ToChar(Console.ReadLine());
            String input = "";

            for(int i = 0; i < 1; i++)
            {
                String temp = Console.ReadLine();

                if(temp.Length <= 100)
                {
                    input = temp;
                }
                else i--;
            }

            bool isAny = false;

            for(int i = 0; i < data.Length; i++)
            {
                if(isIN(data[i], Convert.ToString(c)) || isIN(data[i], input)) 
                {
                    Console.WriteLine(data[i]);
                    isAny = true;
                }
            }

            if(!isAny)
                Console.WriteLine("none");
        }
    }
}
