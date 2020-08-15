using System;
using System.Collections;

namespace samdasu_0811
{
    class samdasu_0811
    {
        static void Main(string[] args)
        {

            //var input = new int[10];
            var input = (Console.ReadLine());
            var _input = input.Split(' ');

            ArrayList n = new ArrayList();

            for(int i = 0; i<_input.Length; i++)
            {
                n.Add(_input[i]);
            }
            n.Sort();
            n.Reverse();
            

            foreach (var value in n)
            {
                Console.Write("{0} ", value);
            }
        }
    }
}
