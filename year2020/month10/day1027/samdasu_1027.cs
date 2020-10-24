using System;
using System.Collections;

namespace samdasu_1027
{
    class Program
    {
        static void Main(string[] args)
        {
            //string input 
            /*ArrayList _input = new ArrayList();
            
            
                _input.Add(Convert.ToChar(Console.ReadLine()));

                for (int i = 0; i < _input.Count; i++)
                {
                    if (Convert.ToInt32(_input[i]) >= 65 && Convert.ToInt32(_input[i]) <= 122)
                    {
                        Console.Write(_input[i].ToString().ToUpper());
                    }
                }*/


            string input = Console.ReadLine();
            char[] a = new char[100];
            for (int j = 0; j<input.Length; j++)
            {
                a[j] = input[j];

                if(Convert.ToInt32(a[j])>=65&& Convert.ToInt32(a[j]) <= 122)
                {
                    Console.Write(a[j].ToString().ToUpper());
                }
                
                
            }

            
            
            



        }
    }
}
