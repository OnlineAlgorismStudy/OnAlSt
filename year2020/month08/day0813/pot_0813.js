    <script>
        var array1 = new Array(100);
        var max = 0;
        var min = 0;
        var stop = 999;
        for(i=0;i<array1.length;i++){
            array1[i] = parseInt(prompt(""));
            if(array1[i] == 999){
                break;
            }else if(max < array1[i]){
                max = array1[i];
            }else if(min > array1[i]){
                min = array1[i];
            }
        }
        document.write("max : " + max + "<br>" + "min : "+min);
        
        

    </script>
