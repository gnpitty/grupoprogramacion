def fibR(n):
 if n==1 or n==2:
  return 1
 print(n)
 return fibR(n-1)+fibR(n-2)

print fibR(6)
