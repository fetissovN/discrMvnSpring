<%--
  Created by IntelliJ IDEA.
  User: Николай
  Date: 09.04.2017
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form:form method="post" commandName="data" action="result">
    <p><form:label path="digitA">A:</form:label></p>
    <p><form:input path="digitA" /></p>
    <p><form:errors path="digitA"/></p>
    <p><form:label path="digitB">B:</form:label></p>
    <p><form:input path="digitB" /></p>
    <p><form:errors path="digitB"/></p>
    <p><form:label path="digitC">C:</form:label></p>
    <p><form:input path="digitC" /></p>
    <p><form:errors path="digitC"/></p>
    <input type="submit" value="Submit"/>
</form:form>
  <%--<div align="center" class="row">--%>
    <%--<div class="medium-6 medium-centered large-4 large-centered columns">--%>

      <%--<form id="form" action="/result" method="post">--%>
        <%--<div class="row column log-in-form">--%>
          <%--<h2 class="text-center">Set a,b,c</h2>--%>
          <%--&lt;%&ndash;<span style="color: red">${wrongLogin}</span>&ndash;%&gt;--%>
          <%--<h4 class="text-center">Example: ax^2+bx+c</h4>--%>
          <%--<span style="color: red">${letterErr}</span>--%>
          <%--<label>a:--%>
            <%--<input type="text" name="digitA" placeholder="3"><span id="errorA" style="color: red">${aErr}</span>--%>
            <%--&lt;%&ndash;<span id="errorA"></span>&ndash;%&gt;--%>
          <%--</label>--%>
          <%--<label>b:--%>
            <%--<input type="text"  name="digitB" placeholder="5"><span id="errorB" style="color: red">${bErr}</span>--%>
          <%--</label>--%>
          <%--<label>c:--%>
            <%--<input type="text"  name="digitC" placeholder="1"><span id="errorC" style="color: red">${cErr}</span>--%>
          <%--</label>--%>
          <%--<input type="submit" id="buttonSent" class="submit" value="Calculate">--%>

        <%--</div>--%>
      <%--</form>--%>
    <%--</div>--%>
  <%--</div>--%>
  </body>
</html>
