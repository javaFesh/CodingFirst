<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="static/js/jquery.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="form1">
    <input type="text" id="id" name="id">
    <input type="password" id="pwd" name="pwd">
    <input type="submit" value="提交" onclick="sub()">
</form>
<script language="JavaScript">
    $.fn.serializeObject = function()
    {
        var o = {};
        var a = this.serializeArray();
        $.each(a, function() {
            if (o[this.name]) {
                if (!o[this.name].push) {
                    o[this.name] = [o[this.name]];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };
    function sub() {

        var json1 = $('#form1').serializeObject();
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/stuLogin",
            dataType: "json",
            data: json1,
            traditional: true,
            xhrFields: {
                withCredentials: true //session id 保持不变
            },
            success: function (tt) {

                alert("成功");
            },
            error: function (data) {
                alert("查询失败");
            }
        });
    }
</script>
</body>
</html>
