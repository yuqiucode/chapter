<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>登陆</title>
    <link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet" >
    <script src='<c:url value="/resources/js/jquery-3.2.1.min.js" />'></script>
    <script type="text/javascript" language="JavaScript">
        $(document).ready(function () {
            $("#login").click(function () {
               if(!$("#account").val()||!$("#password").val()){
                   alert("用户名和密码不能为空！")
                   return false
               }
            })
        })
    </script>
    <script type="text/javascript" language="JavaScript">

    </script>
    <style type="text/css">
        /* Override some defaults */
        html, body {
            background-color: #eee;
        }
        body {
            padding-top: 40px;
        }
        .container {
            width: 300px;
        }

        /* The white background content wrapper */
        .container > .content {
            background-color: #fff;
            padding: 20px;
            margin: 0 -20px;
            -webkit-border-radius: 10px 10px 10px 10px;
            -moz-border-radius: 10px 10px 10px 10px;
            border-radius: 10px 10px 10px 10px;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.15);
            -moz-box-shadow: 0 1px 2px rgba(0,0,0,.15);
            box-shadow: 0 1px 2px rgba(0,0,0,.15);
        }

        .login-form {
            margin-left: 65px;
        }

        legend {
            margin-right: -50px;
            font-weight: bold;
            color: #404040;
        }

    </style>

</head>
<body>
<div class="container">
    <div class="content">
        <div class="row">
            <div class="login-form">
                <h2>Login</h2>
                <form id="loginForm" action='<c:url value="/login" />' method="post" autocomplete="off" >
                    <fieldset>
                        <c:if test="${sessionScope.message != null}">
                            <div class="alert alert-error clearfix" style="margin-bottom: 5px;width: 195px; padding: 2px 15px 2px 10px;">
                                    ${sessionScope.message}
                            </div>
                        </c:if>
                        <div class="clearfix">
                            <input id="account" type="text" placeholder="用户名" name="userCode" value="zhangsan" >
                        </div>
                        <div class="clearfix">
                            <input id="password" type="password" placeholder="密码" name="password" value="zhangsan">
                        </div>
                        <button class="btn btn-primary" id="login" type="submit">登 录</button>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div> <!-- /container -->
</body>

</html>