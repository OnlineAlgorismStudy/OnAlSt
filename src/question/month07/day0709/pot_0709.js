while(true){
        data1 = prompt("base and height : ").split(" ");
        result1 = parseInt((data1[0]) * parseInt(data1[1])/2);
        
        document.write("Base : "+data1[0]+"<br>");
        document.write("Height : "+data1[1]+"<br>");
        document.write("Triangle Width " +result1+"<br>");
        
        
        data2 = prompt("Continue? : ");
        if(data2 == "y" || data2=="Y"){
            document.write("Continue : "+ data2+"<br>");
            document.write("----------"+"<br>");
            continue;
        }else{
            document.write("Continue : "+ data2+"<br>");
            document.write("----------"+"<br>");
            break;
        }
    }
