using System;

namespace samdasu0928
{
    class samdasu0928
    {
        static void Main(string[] args)
        {
            double[] input = new double[3];

            for(int i = 0; i<3; i++)
            {
                input[i] = Convert.ToDouble(Console.ReadLine());
                                
            }

            fn_sum(input);
        }

        static void fn_sum(double[] a)
        {
            double round;
            double avg;
            double round1 = 0;
            double avg1 = 0;
            for(int i = 0; i<3; i++)
            {
                avg = a[i];
                round =Math.Round(a[i]);        //반올림 먼저
                /*Console.WriteLine(a[i]);
                Console.WriteLine("1= ",round);*/

                avg1 += avg;
                round1 += round;

            /*    Console.WriteLine("총= "+avg1);
                Console.WriteLine("반올림= "+round1);*/

            }
            
            
            Console.WriteLine(Math.Round(avg1 /3));
            Console.WriteLine(Math.Round(round1 / 3));


        }
    }
}
