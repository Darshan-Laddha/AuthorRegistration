<html>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <body>
        <c:choose>
                <c:when test="${empty author}">
                    <h4>Author data not present<h4>
                </c:when>
                <c:otherwise>
                    <h3>Author data:</h3>
                    <h4>Name: ${author.name}</h4>
                    <h4>ID: ${author.id}</h4>
                    <h4>Category: ${author.category}</h4>
                    <h4>Title: ${author.title}</h4>
                </c:otherwise>
            </c:choose>
    </body>
</html>