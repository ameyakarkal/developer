##Sorting
### Bubble Sort

> across the entire array, we continue swapping neighboring elements. and continue till there are no swaps.

#### complexity
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

### Merge Sort
> divide array into half and continue recursively. Smallest problem size is array of 1 element where the array is sorted by default. merge sorted arrays.

#### complexity
- best O(nlog n)

### Insertion Sort
> for each iteration i, sort the array till the ith element

#### complexity
- best O(n ^ 2)
