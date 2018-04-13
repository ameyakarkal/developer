### checking indexes

```
select * from sys.indexes
where object_id = (select object_id from sys.objects where name = '<table name>')

dbcc show_statistics(CommunityMember,IX_CommunityMember_CommunityIdDeleted_Covering)
```
