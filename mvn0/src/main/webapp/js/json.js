function testJson(){
    //获得参数值
    var name =$("#name").val();
    var pwd =$("#pwd").val();
   // alert(name+"=>"+pwd);

    //
    $.getJSON("myjson",{"uname":name,"upass":pwd},function(data){
       // alert(data.uname+"==>"+data.upass);
        $("#msg").html(data.uname+"=>"+data.upass).css("background","gray");
    });

}


$(function () {

    //单击事件
    $("#but").click(function () {
        //$("#frm").serialize()提交参数
        $.getJSON("mylogin",$("#frm").serialize(),function (data) {
           // alert(data);
            //清空
            if(data==1){
                $("#err").html("登录成功").css("color","blue");
            }else{
                $("#err").html("登录失败").css("color","red");
            }

        });
    });
});