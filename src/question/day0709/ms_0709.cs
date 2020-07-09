using System;

namespace algorithm_09
{
    class ms_0709
    {
        static void Main(string[] args)
        { 
            char cnd;
            
            do {
                Console.Write("Base = ");
                int width = Convert.ToInt32(Console.ReadLine());
                
                Console.Write("Height = ");
                int height = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine($"Triangle width = {width*height/2.0:.0}");
                
                Console.Write("Continue? ");
                cnd = Convert.ToChar(Console.ReadLine());
            } while(cnd == 'Y' || cnd == 'y');
        }
    }
}
