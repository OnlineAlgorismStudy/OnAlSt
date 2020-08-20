<script>
        var array1 = new Array(10);
        
        for(i=0;i<array1.length;i++){
            array1[i] = parseInt(prompt(""));
        }
        array1.sort(function(a,b){
            return b - a;
        });
        document.write(array1);
        

    </script>
