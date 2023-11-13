<html>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <style>
        table, th, td {
           border:1px solid green;
        }
     </style>
    <body>
            <h4>INTO AUTHORS PAGE</h4>
            <table>
                <th>ID</th>
                <th>Name</th>
                <th>Title</th>
                <th>Category</th>
                <c:forEach  var="author" items="${authors}">
                    <tr>
                        <th>${author.id }</th>
                        <th>${author.name }</th>
                        <th>${author.title }</th>
                        <th>${author.category }</th>
                    </tr>
                </c:forEach>    
            </table>
        <form action = "/home" method="GET">
            <input type="submit" value="Register Another Author">
        </form>
    </body>
   
</html>