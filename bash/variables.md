# bash tips


read multiline variables
id=123
```bash
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
