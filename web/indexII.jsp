<%@page import="nota.acougue.Nota"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <style>
            table, th, td{
                border: 1px solid #aaa;
            }
            th, td{
                padding: 8px;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <%
            try{
                
                Nota nota = new Nota();
                
                String tipo = request.getParameter("opcao");
                String formaDePagamento = request.getParameter("resposta");
                String kg_txt = request.getParameter("kg");
                double kg = Double.parseDouble(kg_txt);
                
                nota.setTipo(tipo);
                nota.setFormaDePagamento(formaDePagamento);
                nota.setKgDeCarne(kg);
                
                out.print(nota.resposta());
            }
            catch(Exception e){
                out.print("<h3>Error :/ ... " + e.getMessage() + "</h3>");
            }
        %>
    </body>
</html>
