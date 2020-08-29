function change1(data){
            result1 = data * 91.44
            result2 = result1.toFixed(1);
            return result2;

        }
        input = prompt("yard ? ");
        document.write(input+"yard = " + change1(input));
