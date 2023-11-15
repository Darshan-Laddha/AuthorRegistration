H2 Database
H2 database in this microservice is used to store the following information about the author
1) Author ID(Primary Key) -> id
2) Author Name -> name
3) Author Title -> title
4) Author Category -> category

Developers working on this microservice looking to add their own custom queries can add the queries in the 
DAO layer(AuthorDAO.java).
For example if we need to get authors with a specific author id
```
@Query("SELECT author FROM Author author WHERE author.id=?1")
List<Author> findAuthorByID(int id);
``````


