<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Insert title here</title>
	<style>
        *{
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }
        .main_div{
            background-color: #7C9D96;
            width: 100vw;
            height: 100vh;

            display: flex;
            justify-content: center;
            align-items: center;
            
            position: relative;
            

        }
        .sub_div{
            width: 41vw;
            height: 36
            vh;
            background-color: #E9B384;
            border-radius: 5%;
            

           
            /* display: grid;
            place-items: center; */
        }
        .A{
            padding: 20px 90px;     
        }
        body form input {
            font-size: 18px;
            text-align: center;
            
            outline: none;
        }

        div select {
            font-size: 18px;
            outline: none;
        }
        

    </style>
</head>
<body>
	<h3>Welcome to User-Login Area</h3>
	
	<%
		String emailMsg = (String)request.getAttribute("incorrectEmail");
		String passMsg = (String)request.getAttribute("incorrectPassword");
	%>
	<%if(emailMsg != null){ %>
		<h3 style="color:red"><%=emailMsg %></h3>
	<%} %>
	<%if(passMsg != null){ %>
		<h3 style="color:red"><%=passMsg %></h3>
	<%} %>
	
    <div class="main_div">
        
        <form action="userLogin" method="post">
            <div class="sub_div">
                <div class="A">
                    <input type="email" name="userEmail" placeholder="Email">
                </div>
                <div class="A">
                    <input type="password" name="userPassword" placeholder="Password">
                </div>
                <div class="A">
                    <select name="" id="">
                        <option value="admin">Admin</option>
                        <option value="owner">Owner</option>
                        <option value="user">User</option>
                    </select>
                </div>
                <div class="A B">
                    <input type="submit" value="Login">
                </div>
                <div class="A C">
                    <!--<input type="submit" value="Signup">-->
                </div>
            </div>
        </form>
                    <a href="user-register.jsp"><button>Signup</button></a>
    				<jsp:include page="back-home.jsp"></jsp:include>
        
    </div>
</body>
</html>