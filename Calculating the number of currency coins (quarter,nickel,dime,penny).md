

```python
import math
def numberofcoins(x):
    rem1=x%25
    quarter=math.floor(x/25)
    print(f'please give {quarter} quarters')
    
    rem2=rem1%10
    dim=math.floor(rem1/10)
    print(f'please give {dim} dime')
    
    rem3=rem2%5
    nickel=math.floor(rem2/5)
    print(f'please give {nickel} nickel')
        
    rem4=rem3%1
    penny=math.floor(rem3/1)
    print(f'please give {penny} pennies')
    
    total=quarter+dim+nickel+penny
    
    print(f'total number of coins is : {total}')


cents = int(input('Enter the number of cents: '))
numberofcoins(cents)
```

    Enter the number of cents: 100
    please give 4 quarters
    please give 0 dime
    please give 0 nickel
    please give 0 pennies
    total number of coins is : 4
    


```python

```


```python


```


```python

```


```python

```


```python

```


```python

```


```python

```


```python

```


```python

```


```python

```


```python

```


```python

```


```python

```
