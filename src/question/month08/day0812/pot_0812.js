        var array1 = new Array(10);
        var odd = 0;
        var even = 0;
        for(i=0;i<array1.length;i++){
            array1[i] = parseInt(prompt(""));
            if(i%2==1){
                even += array1[i];
            }else{
                odd += array1[i];
            }
        }
        document.write("odd : " + odd+"<br>" +"even : "+even);
