# bash tips

## read multiline variables with parameters
```bash
id=123
read -r -d '' msg <<EOF
{
    "Timestamp": "1599146933217",
    "DatalakeBlobsCount": $id,
    "JobId": "779f4a4f461c3a1fb9ce09eb48868511-1599146933217",
    "Prefix": "lakitu",
    "Version": "779f4a4f461c3a1fb9ce09eb48868511",
    "Before": "1599146933217",
    "JobUri": "lakitu/779f4a4f461c3a1fb9ce09eb48868511-1599146933217"
}
EOF
```

## initialize variable / with a default value

> https://stackoverflow.com/a/2013589/314763

```bash
temp="${ELASTICSEARCH_URL:=http://localhost:1111}"
echo $temp

# >export ELASTICSEARCH_URL='http://localhost:9200'
# >source script/test-es.sh 
#     http://localhost:9200
# >export ELASTICSEARCH_URL=''                     
# >source script/test-es.sh   
#     http://localhost:1111
```
