using System;

namespace _1118
{
    class samdasu1118
    {
        static void Main(string[] args)
        {
            string a = "flower";
            string b = "rose";
            string c = "lily";
            string d = "daffodil";
            string e = "azalea";


            string aa = a.Substring(0, 3);
            string bb = b.Substring(0, 3);
            string cc = c.Substring(0, 3);
            string dd = d.Substring(0, 3);
            string ee = e.Substring(0, 3);

            string input = Console.ReadLine();

            int count = 0;

            
            if (aa.Contains(input))
            {
                Console.WriteLine(a);
                count++;
            }
            if (bb.Contains(input))
            {
                Console.WriteLine(b);
                count++;
            }
            if (cc.Contains(input))
            {
                Console.WriteLine(c);
                count++;
            }
            if (dd.Contains(input))
            {
                Console.WriteLine(d);
                count++;
            }
            if (ee.Contains(input))
            {
                Console.WriteLine(e);
                count++;
            }
            if(count > 0)
            {
                Console.WriteLine(count);
            }
            else
            {
                Console.WriteLine("0");
            }
            
        }
    }
}
