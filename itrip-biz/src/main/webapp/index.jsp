<html>
    <header>


    </header>
<body>
<input type="text" id="userCode"/>
<input type="password" id="userpassword"/>
<input id="submit" type="button"/>
</body>

<script type="text/javascript" src="js/jquery.js"></script>
<script>
    $("#submit").click(function () {
       var  userCode = $("#userCode").val();
       var  userpassword = $("#userpassword").val();

       $.ajax({
           url:"/api/user/userlogin",
           type:"POST",
           data:{
               "userCode":userCode,
               "userpassword":userpassword
           },
           success:function (data) {

           }

       });

    });
</script>
</html>
