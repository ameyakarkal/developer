##Query Optimization

### How is the query submitted to the server ?

sp_execute 

```
declare @sql_statement = 'select firstname, lastname from dbo.person where id = @id'
EXEC sp_execute @sql_statement, N'@id INT', 12;
```
 - server caches plan for first execution, subsequent execution use cached plans
 
```
declare @sql_statement nvarchar(4000) = 'select firstname, lastname from dbo.person where id =' + CAST(12 as nvarchar(10))
exec(@sql_statement)
```
 - optimized at runtime
 - plan is not cached
 

### How does the server build an execution plan ?

more to come...
