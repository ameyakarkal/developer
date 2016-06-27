##Query Optimization

>  gets NOT the BEST plan, but a GOOD plan FAST

There are few factors taken into consideration for selecting a good plan
- data selectivity , how many rows will be selected by the presented query.
- estimates


Estimates

```
DBCC SHOW_STATISTICS N'dbo.Person', N'IX_Person_Lastname'
```
shows three statistics for the table `dbo.Person` with respect to the index `IX_Person_Lastname`
- header, when the statistics for the table was updated. how many rows the table contains and how many rows were sampled to collect the statistic
- data density vector
- histogram, helps the optimizer how much data might be present, can be used if data can be _sniffed_


Statistics
- statistics are used to generate the estimated values, which are then used to pick a good plan.
- statistics are updated when usually 20% of the data is changed or manually triggered using a flag
- histogram allows 200 steps.


How the queries are presented affects how the statistics are used by the optimizer
- if statistics are not present, optimizer uses Heuristics (mathematics based plan)
- if optimizer cannot sniff the value, it cannot use the histogram (specific plan) and it falls back on density vector (general plan)
- 

```

```

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
