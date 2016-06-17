<%--
  Created by IntelliJ IDEA.
  User: boreas
  Date: 16/6/6
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>study.scinitializer</title>
    <script type="text/javascript">

        function test() {
            var ret;
            var xmlHttpRequest =
                    new XMLHttpRequest();
            xmlHttpRequest.onreadystatechange=function () {
                if (xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200) {
                    ret = xmlHttpRequest.responseText;
                }
            };
            xmlHttpRequest.open("GET", "/ajax", false);
            xmlHttpRequest.send();
            return ret;
        }

     window.onload=function () {
         alert(test());
     }

    </script>
</head>
<body>
Hello Word study.scinitializer
</body>
</html>
