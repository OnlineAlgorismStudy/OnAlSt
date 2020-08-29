    <script>
        var array1 = new Array(100);
        
        for(i=0;i<array1.length;i++){
            array1[i] = prompt();
            if(array1[i]==0){
                break;
            }
            
            array1.sort(function(a,b){
                return a-b;
            });
            data = array1.filter(function(){return true});

        }
        document.write(data);
        
            

        

    </script>
