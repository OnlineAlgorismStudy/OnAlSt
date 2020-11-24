using System;
using System.Collections;

namespace _1119
{
    class samdasu1119
    {
        static void Main(string[] args)
        {
            ArrayList arInput = new ArrayList();
            while (true)
            {
                string input = Console.ReadLine();

                

                if (input.Equals("0"))
                {
                    break;
                }
                else
                {
                    arInput.Add(input);
                }
            }

            
            Console.WriteLine(arInput.Count);
            for (int i = 0; i < arInput.Count; i = i + 2)
            {
                Console.WriteLine(arInput[i]);
            }


        }
    }
}
