##Query Optimization

### How is the query submitted to the server ?

#### ad hoc queries

*safe queries*

```
 select firstname, lastname from dbo.person where id = 1;
 
 select firstname, lastname from dbo.person where id = 10001;

 select firstname, lastname from dbo.person where id = 32;
```
- sql server will put three plans into cache (due to difference in the data type SQL might use for 1 and 10001)
- underlying query hash and query plan might remaine same

*unsafe queries*


#### ad hoc queries using variables
 





#### sp_execute 

```
declare @sql_statement = 'select firstname, lastname from dbo.person where id = @id'
EXEC sp_execute @sql_statement, N'@id INT', 12;
```
 - the first execution *defines* the plan, all subsequent executions use the cached plan.
 Always check the _Estimated Counts_ and _Actual Counts_ on the execution plan to know if the cached plan is really effective.
 
```
declare @sql_statement nvarchar(4000) = 'select firstname, lastname from dbo.person where id =' + CAST(12 as nvarchar(10))
exec(@sql_statement)
```
 - optimized at runtime
 - plan is not cached
 



### How does the server build an execution plan ?

more to come...
