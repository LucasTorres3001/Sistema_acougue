<%@page import="carnes.resposta.Acessorio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            iframe{
                padding: 4px;
            }
        </style>
    </head>
    
    <body>
        <main>
            <header>
                <h1>Sistema de um açougue</h1>
            </header>
            <section>
                <form action="indexII.jsp" method="POST" name="formulary" id="Form" target="nota">
                    <fieldset>
                        <legend>Opções</legend>
                        <p>
                            <input type="radio" name="opcao" id="alcatra" title="Alcatra" value="Alcatra"><label for="alcatra" title="Alcatra">Alcatra</label>
                            <input type="radio" name="opcao" id="file" title="Filé duplo" value="File"><label for="file" title="Filé duplo">Filé duplo</label>
                            <input type="radio" name="opcao" id="picanha" title="Picanha" value="Picanha"><label for="picanha" title="Picanha">Picanha</label>
                        </p>
                        <p>
                            <input type="radio" name="resposta" id="sim" title="Pagamento a cartão" value="Pagamento a cartao"><label for="sim" title="Pagamento a cartão">Pagamento a cartão</label>
                            <input type="radio" name="resposta" id="nao" title="Normal" value="Normal"><label for="nao" title="Normal">Normal</label>
                        </p>
                        <fieldset>
                            <label for="carne" title="Peso">Quantos kg o cliente deseja comprar:</label>
                            <input type="text" name="kg" id="carne" size="9" maxlength="9" placeholder="kg de carne" title="Peso" required="">
                            kg
                        </fieldset>
                    </fieldset>
                    <br>
                    <button type="submit" name="Click" id="click" title="Ver nota" value="Ver_nota">Ver nota</button>
                </form>
                <br>
                <iframe name="nota" id="Nota" height="253" width="361" title="nota"></iframe>
            </section>
            <footer>
                <center>
                    <%
                        out.print(Acessorio.dataHourAndAuthor());
                    %>
                </center>
            </footer>
        </main>
    </body>
</html>
