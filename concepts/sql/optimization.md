##Query Optimization

>  gets NOT the BEST plan, but a GOOD plan FAST

There are few factors taken into consideration for selecting a good plan
- data selectivity , how many rows will be returned by presented query.


###Data Selectivity
- Sql server estimates how many rows are going to selected by the presented query. If the data returned is small enough, it will try to use a non clustered index associated with the data or else it will scan the entire table.
- small enough = usually 1-2% of data

###Statistics
- Estimated rows returned by presented query can be used to filter plans.

```
DBCC SHOW_STATISTICS N'dbo.Person', N'IX_Person_Lastname'
```
shows three statistics for the table `dbo.Person` with respect to the index `IX_Person_Lastname`

- header, [single row summary]
  -  when the statistics for the table was updated. 
  -  how many rows the table contains
  -  how many rows were sampled to collect the statistic
- data density vector, [density of rows with values for column]
  -  density * number of sample rows ~= estimated rows
- histogram [rows for each value]
  - used if data can be _sniffed_
  - 200 max steps

- statistics are updated when usually 20% of the data is changed or manually triggered using a flag
- manually triggered by maintenance
- disabled with `SET AUTO_CREATE_STATISTICS OFF`

### Heuristics

When statistics are not available, SQL server uses constants

> heuristics values not shown since they may vary between sql server versions

<hr/>



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
