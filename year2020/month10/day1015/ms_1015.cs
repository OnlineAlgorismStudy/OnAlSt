using System;

namespace algorithm_79
{
    class ms_1015
    {
        static int MultNums(int value) 
        {   
            if(value == 0)
                return 1;

            int division = value / 10;
            int remainder = value % 10;
            
            if(remainder != 0)
                return remainder * MultNums(division);
            else
                return MultNums(division);
        }
        
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int[] data = new int[3];

            for(int i = 0; i < input.Length; i++)
                if(input[i].Length == 3)
                    data[i] = Convert.ToInt32(input[i]);

            Console.WriteLine(MultNums(data[0] * data[1] * data[2]));
        }
    }
}
