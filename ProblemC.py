n = int(input())
count =0

while n:
    array = list (map ( int, input().split()));
    if array.count(1)>1:
        count+=1
    n-=1
    
print(count)
