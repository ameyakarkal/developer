##Query Optimization

### How is the query submitted to the server ?

#### ad hoc queries
```
 select firstname, lastname from dbo.person where id = 1;
 
 select firstname, lastname from dbo.person where id = 10001;

 select firstname, lastname from dbo.person where id = 32;

```
- all the above three queries can result in different plans to be cached.

#### ad hoc queries using variables
 





#### sp_execute 

```
declare @sql_statement = 'select firstname, lastname from dbo.person where id = @id'
EXEC sp_execute @sql_statement, N'@id INT', 12;
```
 - server caches plan for first execution, subsequent execution use cached plans.
 - 
 
```
declare @sql_statement nvarchar(4000) = 'select firstname, lastname from dbo.person where id =' + CAST(12 as nvarchar(10))
exec(@sql_statement)
```
 - optimized at runtime
 - plan is not cached
 



### How does the server build an execution plan ?

more to come...
