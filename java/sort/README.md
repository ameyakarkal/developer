##Sorting
### Bubble Sort
#### time complexity
- best O (n) when the input is almost sorted.
- time : O(n ^ 2)
- space : no additional space

```
for i = 1 to n
	swapped = false
	j = 1;
	while(swapped){
		if(input[j-1] > input[j]){
		  swap j and j-1
		  swapped = true;
		}
	}
```

> across the entire array, we swap one element. and continue till there are no swaps.
