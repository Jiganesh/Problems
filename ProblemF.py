n = int(input())
count=0
while n:
    if "++" in input():
        count+=1
    else:
        count-=1
    n-=1

print(count)
    