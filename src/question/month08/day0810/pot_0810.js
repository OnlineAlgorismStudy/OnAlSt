    <script>
        var array1 = new Array(10);
        var sum1 = 0;
        var sum2 = 0;
        var count = 0;
        for(i=0;i<array1.length;i++){
            array1[i] = parseInt(prompt(""));
            if(i%2==1){
                sum1 += array1[i];
                count++;
            }else{
                sum2 += array1[i];
            }
        }
        document.write(sum1+"<br>");
        document.write(parseFloat(sum2) / count);

    </script>
