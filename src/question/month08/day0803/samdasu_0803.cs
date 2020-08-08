using System;
using System.Collections;

namespace samdasu_0803
{
    class samdasu_0803
    {
        static void Main(string[] args)
        {
            ArrayList array = new ArrayList();

            var n = Console.ReadLine();
            
            var Nstring = n.Split(' ');
            if (Nstring.Length >= 10)
            {

                for (int i = 0; i < Nstring.Length; i++)
                {
                    array.Add(Nstring[i]);
                }

                Console.Write(array[0] + " ");
                Console.Write(array[3] + " ");
                Console.Write(array[6] + " ");
                Console.WriteLine("");
            }
            else
            {
                Console.WriteLine("문자를 10개 이상 입력해 주세요");
            }
            
        }
    }
}
