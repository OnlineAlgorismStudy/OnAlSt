using System;

namespace samdasu0731
{
    class samdasu0731
    {
        static void Main(string[] args)
        {
            int s = Convert.ToInt32(Console.ReadLine());
            int e = Convert.ToInt32(Console.ReadLine());



            for(int i = 1; i<=9; i++)
            {
                if((s<2|| s>9) || (e<2|| e > 9))
                {
                    Console.WriteLine("INPUT ERROR");
                }
                else
                {
                    if (s < e)
                    {
                        for(int j = s; j<=e; j++)
                        {
                            Console.Write("{0} * {1} = {2}   ", j, i, j * i);
                        }
                    }
                    else
                    {
                        for(int j =s; j>=e; j--)
                        {
                            Console.Write("{0} * {1} = {2}   ", j, i, j * i);
                        }
                    }
                    Console.WriteLine("");
                }                
            }
        }
    }
}
