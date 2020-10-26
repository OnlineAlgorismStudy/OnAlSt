using System;

namespace algorithm_86
{
    class ms_1026
    {
        static void Main(string[] args)
        {
            char data;
            
            while(true)
            {
                data = Convert.ToChar(Console.ReadLine());

                if((65 <= data && data <= 90) || (97 <= data && data <= 122))
                    Console.WriteLine(data);

                else if(48 <= data && data <= 57)
                    Console.WriteLine(Convert.ToInt32(data));
            
                else
                    break;
            }
        }
    }
}
