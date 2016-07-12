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


##Deep Dive

### Statistics
- Statististics are defined for each index. 
- Left bound subset
- Histogram are based on the first column of the index known as the higher order element

#### Header
- date  
   - last time the statistics were created. 
- rows and row sampled
   -  sampling is used when the table is bigger than 10K Pages. Sampling can result in inaccurate estimates ONLY if the data in the table is highly skewed. In this case we can turn off AUT0_UPDATE_STATISTICS and always generate statistics using a full table scan using `UPDATE STATISTICS WITH FULLSCAN`
#### Density Vector
- left based subset for column used.
#### Histogram
- shows count of row for actual value
- can be used for range queries
  - coming soon, example explaining this.  
