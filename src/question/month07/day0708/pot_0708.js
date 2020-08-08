<script>
        function check1(number){
            number1 = parseInt(number);
            switch(number1){
                case 1:
                result = "Seoul";
                break;

                case 2:
                result = "Washington";
                break;

                case 3:
                result = "Tokyo";
                break;

                case 4:
                result = "China";
                break;

                default:
                result = "None";
                break;
            }
            return result;
        }

        alert("1.Korea"+"\n"+"2:USA"+"\n"+"3:Japapn"
        +"\n"+"4:China");
        input = prompt("Number : ");
        document.write(check1(input));

    </script>
