<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="classes.Info" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Iforma��es do sistema</title>
<Link href="style.css" rel="stylesheet">
</head>

<body>
<header>
<h1><img src="https://cdn-icons-png.flaticon.com/512/4370/4370748.png"> Informa��es do seu computador</h1>
</header>
<h2>Informa��es abaixo</h2>
<div id="infs">

<div id="pc">
<h3>Informa��es sobre o PC</h3>
<%
Info info = new Info();

out.println("<br> N�mero de processadores: "+info.infocomp().get(0));
out.println("<br> Total de mem�ria livre: "+info.infocomp().get(1));
out.println("<br> Total de mem�ria do computador: "+info.infocomp().get(2));
out.println("<br> Mem�ria utilizada pelo computador: "+info.infocomp().get(3));
out.println("<br> Raiz do sistema: "+info.infocomp().get(28));
out.println("<br> Espa�o total de disco: "+info.infocomp().get(5));
out.println("<br> Espa�o livre do disco: "+info.infocomp().get(6));
out.println("<br> Espa�o usado no disco: "+info.infocomp().get(7));
%>
</div>

<div id="user">
<h3>Informa��es sobre o usuario</h3>
<% 
out.println("<br> Nome do sistema operacional: "+info.infocomp().get(20));
out.println("<br> Arquitetura do sistema: "+info.infocomp().get(21));
out.println("<br> Vers�o do sistema operacional: "+info.infocomp().get(22));
out.println("<br> Separador de arquivos: "+info.infocomp().get(11));
out.println("<br> Separador de packs: "+info.infocomp().get(12));
out.println("<br> Separador de linha: "+info.infocomp().get(13));
out.println("<br> Nome usuario: "+info.infocomp().get(26));
out.println("<br> Pasta usuario: "+info.infocomp().get(27));
out.println("<br> Pasta corrente do usuario: "+info.infocomp().get(28));
%>
</div>

</div>

<footer>Todos os direitos reservados DevGustavo �</footer>
</body>
<script>

alert("Estamos coletando dados do seu computador apenas para demonstrar, voc� est� seguro ! (SEUS DADOS EST�O PROTEGIDOS)")
</script>
</html>