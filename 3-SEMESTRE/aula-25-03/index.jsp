<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<%-- request.getContextPath() ---> caminho para o servidor --%>
<form action="<%= request.getContextPath()%>/hello-servlet" method="get">
  <input type="text" name="campo_texto" value="" placeholder="texto"/> <br>
  <input type="number" name="campo_numerico" placeholder="numero"/><br>
  <input type="date" name="campo_data"/><br>
  <input type="radio" name="campo_opcao_radio" value="opcao a"/> "A"<br>
  <input type="radio" name="campo_opcao_radio" value="opcao b"/> "B"<br>
  <input type="checkbox" name="campo_opcao_checkbox" value="Batman"/> Batman <br>
  <input type="checkbox" name="campo_opcao_checkbox" value="Coringa"/> Coringa <br>
  <input type="checkbox" name="campo_opcao_checkbox" value="Hulk"/> Hulk <br>
  <button type="submit"> enviar </button>

</form>
</body>
</html>