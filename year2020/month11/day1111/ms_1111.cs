using System;

namespace algorithm_98
{
    class ms_1111
    {
        static String isIN(String data, String find) 
        {
            if(data.IndexOf(find) != -1)
                return "Yes";
            else
                return "No";
        }
        
        static void Main(string[] args)
        {
            String input = Console.ReadLine();

            if(input.Length <= 100)
                Console.WriteLine(isIN(input, "c") + " " + isIN(input, "ab"));
        }
    }
}
