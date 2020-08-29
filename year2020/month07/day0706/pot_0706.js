<script>
        function check(year){
            if(year % 400 == 0){
                document.write("leap year");
            }else if(year % 4 == 0 && year % 100 !=0){
                document.write("leap year");
            }else{
                document.write("common year");
            }
        }
        
        year = prompt("년도 입력 : ");
        check(year);

    </script>
