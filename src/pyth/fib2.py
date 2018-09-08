def fibR(n):
 if n==1 or n==2:
  return 1
 print(n)
 return fibR(n-1)+fibR(n-2)

print fibR(6)
## Example 4: Using memoization
def memoize(fn, arg):
 memo = {}
 if arg not in memo:
  memo[arg] = fn(arg)
  return memo[arg]
 
## fib() as written in example 1.
fibm = memoize(fibR,5)
print fibm
