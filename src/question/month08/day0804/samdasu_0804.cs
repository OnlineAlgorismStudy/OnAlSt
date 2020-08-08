using Microsoft.VisualBasic;
using System;
using System.Collections;
using System.Linq;

namespace samdasu_0804
{
    class samdasu_0804
    {
        static void Main(string[] args)
        {
            ArrayList arrayList = new ArrayList();
            var n = Console.ReadLine();
            var Nstring = n.Split(' ');

            if(Nstring.Length <= 100)
            {
                for(int i = 0; i<Nstring.Length; i++)
                {
                    
                    if (Nstring[i] == "0")
                    {
                        break;                        
                    }
                    arrayList.Add(Nstring[i]);

                }
                arrayList.Reverse();

                for (int j = 0; j<arrayList.Count; j++)
                {
                    Console.Write(arrayList[j].ToString() + " ");
                }
            }

        }
    }
}
