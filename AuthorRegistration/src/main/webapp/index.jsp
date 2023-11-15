<html>
    <body>
        <h1> AUTHOR REGISTRATION FORM</h1>
        <form action="/addAuthor" method="POST">
            <label for="id">ID:</label>
            <input type="text" id ="id" name="id"><br>
            <label for="name">Name:</label>
            <input type="text" id = "name" name="name"> <br>
            <label for="title">Title:</label>
            <input type="text" id = "title" name="title"> <br>
            <label for="category">Category:</label>
            <input type="text" id= "category" name="category"><br>
            <input type="submit" value="Add">           
        </form>
        <form action="/viewAuthorsAdded" method="GET">
            <input type="submit" value="View Authors Added">
        </form>
        <form action="/fetchSingleAuthorData" method="GET">
            <input type="submit" value="Fetch Single Author By ID">
        </form>
    </body>
</html>